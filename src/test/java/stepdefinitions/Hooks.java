package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    //testNG deki @BeforeMethod gibi her senaryodan once calisir
    @Before
    public void setUp(){
    }
    //testNG deki @AfterMethod gibi her senaryodan sonra calisir
    @After
    public void tearDown(Scenario scenario){

        //ekran goruntusu almak icin bu sabit kodu kullanabiliriz. Selenium kutuphanesinden geliyor
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        //eger seneryanon sonucu "Failed" ise ekran goruntusunu rapora ekler
        if(scenario.isFailed()){
            scenario.embed(screenshot,"image/png");
        }
        Driver.closeDriver();
    }
}
