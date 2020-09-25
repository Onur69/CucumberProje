package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.EbayPage;
import utilities.Driver;

public class EbayStepDefinition {
    EbayPage ebayPage = new EbayPage();
    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(string);
    }

    @Given("kullanici ebayda aramakutusuna {string} yazar ve arar")
    public void kullanici_ebayda_aramakutusuna_yazar_ve_arar(String string) {
        ebayPage.aramaKutusu.sendKeys(string+Keys.ENTER);
    }

    @Then("kullanici ebaydaki sonuc sayisini ekrana yazdirir")
    public void kullanici_ebaydaki_sonuc_sayisini_ekrana_yazdirir() {
        System.out.println(ebayPage.urunSonucSayisi.getText());
    }

}
