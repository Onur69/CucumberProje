package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//glue=tutkal
//plugin=eklenti
//dryrun=kurubaslangic
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",//html formatinda rapor olusturmak icin
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = {"src/test/resources/features"},
        glue = {"stepdefinitions"},
        tags = "@hotelroomedit" ,//{"@tag1" , "@tag2" ,"@tag3"} veya {"@tag1 , @tag2 ,@tag3"}seklind zincir yapilabiliyor
        dryRun =false
)
public class KoalaPalaceRunner {

}
