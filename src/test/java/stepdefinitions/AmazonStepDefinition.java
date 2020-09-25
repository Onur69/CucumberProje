package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;

public class AmazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazonda dropdownda {string} secer")
    public void kullanici_amazonda_dropdownda_secer(String string) {
        Select select = new Select(amazonPage.dropDown);
        select.selectByVisibleText(string);
    }

    @Given("kullanici amazonda aramakutusuna {string} yazar ve arar")
    public void kullanici_amazonda_aramakutusuna_yazar_ve_arar(String string) {
        amazonPage.aramaKutusu.sendKeys(string+ Keys.ENTER);
    }

    @Then("kullanici amazonda sonuc sayisini ekrana yazdirir")
    public void kullanici_amazonda_sonuc_sayisini_ekrana_yazdirir() {
        System.out.println(amazonPage.sonucSayisi.getText());
    }

}
