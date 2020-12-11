package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.KoalaPalacePage;
import utilities.Driver;

public class KoalaPalaceStepDef {
    KoalaPalacePage page = new KoalaPalacePage();

    @Given("kullanici kullaniciadi ve sifresini girer")
    public void kullanici_kullaniciadi_ve_sifresini_girer() {
       page.userNameKutusu.sendKeys("manager2");
       page.passwordKutusu.sendKeys("Man1ager2!");
    }

    @Then("kullanici giris islemini gerceklestirir")
    public void kullanici_giris_islemini_gerceklestirir() {
        page.girisButonu.click();
    }
    @Given("kullanici hotelcreate sayfasina gider")
    public void kullanici_hotelcreate_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelAdmin/Create");
    }

    @Given("kullanici hotelcreate code bolumune {string} girer")
    public void kullanici_hotelcreate_code_bolumune_girer(String string) {
    page.hotelCreateCodeKutusu.sendKeys(string);
    }

    @Given("kullanici hotelcreate name bolumune {string} girer")
    public void kullanici_hotelcreate_name_bolumune_girer(String string) {
    page.hotelCreateNameKutusu.sendKeys(string);
    }

    @Given("kullanici hotelcreate adress bolumune {string} girer")
    public void kullanici_hotelcreate_adress_bolumune_girer(String string) {
    page.hotelCreateAdressKutusu.sendKeys(string);
    }

    @Given("kullanici hotelcreate phone bolumune {string} girer")
    public void kullanici_hotelcreate_phone_bolumune_girer(String string) {
    page.hotelCreatePhoneKutusu.sendKeys(string);
    }

    @Given("kullanici hotelcreate email bolumune {string} girer")
    public void kullanici_hotelcreate_email_bolumune_girer(String string) {
    page.hotelCreateEmailKutusu.sendKeys(string);
    }

    @Given("kullanici hotelcreate idgroup bolumunde {string} secer")
    public void kullanici_hotelcreate_idgroup_bolumunde_secer(String string) {
        Select select = new Select(page.hotelCreateIDGroupDropdown);
        select.selectByVisibleText(string);
    }

    @Given("kullanici hotelcreate save butonuna tiklar")
    public void kullanici_hotelcreate_save_butonuna_tiklar() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.hotelCreateSaveButonu.click();
    }

    @Then("kullanici hotelcreate kayit islemini assert eder")
    public void kullanici_hotelcreate_kayit_islemini_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(page.hotelCreateBasariliYazisi.getText());
        Assert.assertTrue(page.hotelCreateBasariliYazisi.isDisplayed());

    //---------------------------------------------------------------------------------

    }
    @Given("kullanici hotelroomcreate sayfasina gider")
    public void kullanici_hotelroomcreate_sayfasina_gider() {
       Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelroomAdmin/Create");
    }

    @Given("kullanici hotelroomcreate bolumunde IDHotel {string} secer")
    public void kullanici_hotelroomcreate_bolumunde_IDHotel_secer(String string) {
        Select select=new Select(page.hotelRoomCreateIDHotel);
        select.selectByVisibleText(string);
    }

    @Given("kullanici hotelroomcreate code bolumune {string} girer")
    public void kullanici_hotelroomcreate_code_bolumune_girer(String string) {
    page.hotelRoomCreateCode.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate name bolumune {string} girer")
    public void kullanici_hotelroomcreate_name_bolumune_girer(String string) {
        page.hotelRoomCreateName.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate location bolumune {string} girer")
    public void kullanici_hotelroomcreate_location_bolumune_girer(String string) {
    page.hotelRoomCreateLocation.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate Description bolumune {string} girer")
    public void kullanici_hotelroomcreate_Description_bolumune_girer(String string) {
    page.hotelRoomCreateDescription.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate Price bolumune {string} droganddroop yapar")
    public void kullanici_hotelroomcreate_Price_bolumune_droganddroop_yapar(String string) {
        Actions actions=new Actions(Driver.getDriver());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.dragAndDrop(page.hotelRoomCreatePrice500,page.hotelRoomCreatePrice).perform();
    }

    @Given("kullanici hotelroomcreate room type olarak dropdowndan {string} secer")
    public void kullanici_hotelroomcreate_room_type_olarak_dropdowndan_secer(String string) {
        Select select=new Select(page.hotelRoomCreateRoomType);
        select.selectByVisibleText(string);
    }

    @Given("kullanici hotelroomcreate Max Adult Count bolumune {string} girer")
    public void kullanici_hotelroomcreate_Max_Adult_Count_bolumune_girer(String string) {
    page.hotelRoomCreateMaxAdultCount.sendKeys(string);
    }

    @Given("kullanicihotelroomcreate Max Children count bolumune {string} girer")
    public void kullanicihotelroomcreate_Max_Children_count_bolumune_girer(String string) {
    page.hotelRoomCreateMaxChildCount.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate Aproved secenegini secer")
    public void kullanici_hotelroomcreate_Aproved_secenegini_secer() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.hotelRoomCreateApproved.click();
    }

    @Given("kullanici hotelroomcreate save butonuna tiklar")
    public void kullanici_hotelroomcreate_save_butonuna_tiklar() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.hotelRoomCreateSaveButtonu.click();

    }

    @Then("kullanici hotelroomcreate kayit islemini assert eder")
    public void kullanici_hotelroomcreate_kayit_islemini_assert_eder() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(page.hotelRoomCreateSonucYazisi.getText());
        boolean gorunuyorMu= page.hotelRoomCreateSonucYazisi.isDisplayed();
        Assert.assertTrue(gorunuyorMu);
    }
    //---------------------------------------------------------------------------------
    @Given("kullanici roomreservation sayfasina gider")
    public void kullanici_roomreservation_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create");
    }

    @Given("kullanici room reservation bolumunde IDUser1 {string} dropdowndan secer")
    public void kullanici_room_reservation_bolumunde_IDUser_dropdowndan_secer(String string) {
    Select select=new Select(page.roomReservationIDUser1);
    select.selectByVisibleText(string);
    }

    @Given("kullanici room reservation bolumunde IDUser2 {string} dropdowndan secer")
    public void kullanici_room_reservation_bolumunde_IDUser2_dropdowndan_secer(String string) {
        Select select=new Select(page.roomReservationIDUser2);
        select.selectByVisibleText(string);
    }

    @Given("kullanici room reservation bolumunde Price kismina {string} girer")
    public void kullanici_room_reservation_bolumunde_Price_kismina_girer(String string) {
    page.roomReservationPrice.sendKeys(string);
    }

    @Given("kullanici room reservation bolumunde DateStart kismina {string} girer")
    public void kullanici_room_reservation_bolumunde_DateStart_kismina_girer(String string) {
    page.roomReservationDateStart.sendKeys(string);
    }

    @Given("kullanici room reservation bolumunde DateEnd kismina {string} girer")
    public void kullanici_room_reservation_bolumunde_DateEnd_kismina_girer(String string) {
    page.roomReservationDateEnd.sendKeys(string);
    }

    @Given("kullanici room reservation bolumunde AdultAmount {string} girer")
    public void kullanici_room_reservation_bolumunde_AdultAmount_girer(String string) {
    page.roomReservationAdultAmount.sendKeys(string);
    }

    @Given("kullanici room reservation bolumunde ChildrenAmount {string} girer")
    public void kullanici_room_reservation_bolumunde_ChildrenAmount_girer(String string) {
    page.roomReservationChildrenAmount.sendKeys(string);
    }

    @Given("kullanici room reservation bolumunde ContactNameSurname {string} girer")
    public void kullanici_room_reservation_bolumunde_ContactNameSurname_girer(String string) {
    page.roomReservationContactNameSurname.sendKeys(string);
    }

    @Given("kullanici room reservation bolumunde ContactPhone {string} girer")
    public void kullanici_room_reservation_bolumunde_ContactPhone_girer(String string) {
    page.roomReservationContactPhone.sendKeys(string);
    }

    @Given("kullanici room reservation bolumunde ContactEmail {string} girer")
    public void kullanici_room_reservation_bolumunde_ContactEmail_girer(String string) {
    page.roomReservationContactEmail.sendKeys(string);
    }

    @Given("kullanici room reservation bolumunde Notes {string} ekler")
    public void kullanici_room_reservation_bolumunde_Notes_ekler(String string) {
    page.roomReservationNotes.sendKeys(string);
    }

    @Given("kullanici room reservation bolumunde save buttonuna tiklar")
    public void kullanici_room_reservation_bolumunde_save_buttonuna_tiklar() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.roomReservationSaveButonu.click();
    }

    @Then("And kullanici basarili yazisini assert eder.")
    public void and_kullanici_basarili_yazisini_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(page.roomReservationBasariliYazisi.getText());
        Assert.assertTrue(page.roomReservationBasariliYazisi.isDisplayed());
    }
    //-----------------------------------------------------------------------------------------
    @Then("kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder.")
    public void kullanici_roomreservation_kayit_isleminin_basarisiz_oldugunu_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(page.hataMesaji.isDisplayed());
        System.out.println(page.hataMesaji.getText());

    }
    //---------------------------------------------------------------------
    @Then("And kullanici basarili yazisini assert etmemeli.")
    public void and_kullanici_basarili_yazisini_assert_etmemeli() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertFalse(page.roomReservationBasariliYazisi.isDisplayed());
    }
    //===========================================================================
    @Given("kullanici hotellist sayfasina gider")
    public void kullanici_hotellist_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelAdmin");
    }

    @Given("kullanici hotellist sayfasinda Code kismina {string} girer")
    public void kullanici_hotellist_sayfasinda_Code_kismina_girer(String string) {
    page.hotelListCodeKutusu.sendKeys(string);
    }

    @Given("kullanici hotellist sayfasinda Search buttonuna tiklar")
    public void kullanici_hotellist_sayfasinda_Search_buttonuna_tiklar() {
    page.hotelListSearchButtonu.click();
    }

    @Then("kullanici hotellist bolumundeki kayitlari assert eder")
    public void kullanici_hotellist_bolumundeki_kayitlari_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String sonucSayisi= page.hotelListToplamSonucSayisi.getText();
        System.out.println(sonucSayisi);

        String ilkSatir= page.hotelListIlkSatir.getText();
        System.out.println(ilkSatir);

        String ilkSatirCodeSutunu= page.hotelListIlkSatirCodeSutunu.getText();
        System.out.println(ilkSatirCodeSutunu);

    }
    //===============================================================================
    @Given("kullanici hotelroomlist sayfasina gider")
    public void kullanici_hotelroomlist_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelRoomAdmin");
    }

    @Given("kullanici hotelroomlist idhotel bolumunde {string} secer")
    public void kullanici_hotelroomlist_idhotel_bolumunde_secer(String string) {
    Select select=new Select(page.hotelRoomListIDHotelDropdown);
    select.selectByVisibleText(string);
    }

    @Given("kullanici hotelroomlist code bolumunde {string} girer")
    public void kullanici_hotelroomlist_code_bolumunde_girer(String string) {
    page.hotelRoomListCodeKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomlist name bolumunde {string} girer")
    public void kullanici_hotelroomlist_name_bolumunde_girer(String string) {
    page.hotelRoomListNameKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomlist location bolumune {string} girer")
    public void kullanici_hotelroomlist_location_bolumune_girer(String string) {
    page.hotelRoomListLocationKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomlist sayfasinda search buttonuna tiklar")
    public void kullanici_hotelroomlist_sayfasinda_search_buttonuna_tiklar() {
    page.hotelRoomListAramaKutusu.click();
    }

    @Then("kullanici hotelroomlist bolumundeki kayitlari inceler")
    public void kullanici_hotelroomlist_bolumundeki_kayitlari_inceler() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String sonucSayisi= page.hotelRoomListLSonucSayisi.getText();
        System.out.println(sonucSayisi);

        String ilkSatir=page.hotelRoomListIlkSatir.getText();
        System.out.println(ilkSatir);
    }
        @Then("kullanici hotellist sonuc bolumunde kayit bulunamadi yazisini gorur")
        public void kullanici_hotellist_sonuc_bolumunde_kayit_bulunamadi_yazisini_gorur() {
            Assert.assertTrue(page.hotelCreateKayitBulunmadiYazisi.isDisplayed());
        }
        //======================================================================================

    @Given("kullanici hotelroomreservationlist sayfasina gider")
    public void kullanici_hotelroomreservationlist_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin");
    }

    @Given("kullanici hotelroomreservationlist hotelroomid bolumunde {string} secer")
    public void kullanici_hotelroomreservationlist_hotelroomid_bolumunde_secer(String string) {
    Select select=new Select(page.hotelReservationListHotelRoomIdDropdown);
    select.selectByVisibleText(string);
    }

    @Given("kullanici hotelroomreservationlist arama kutusuna tiklar")
    public void kullanici_hotelroomreservationlist_arama_kutusuna_tiklar() {
        page.hotelReservationListAramaKutusu.click();
    }

    @Then("kullanici hotelroomreservationlist kayitlari inceler")
    public void kullanici_hotelroomreservationlist_kayitlari_inceler() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (WebElement w: page.hotelResrvationListIlkSayfaSonuclari  ) {
            System.out.println(w.getText());
        }
    }
    //==================================================================================
    @Given("kullanici generaldata sayfasina gider")
    public void kullanici_generaldata_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelAdmin/Edit?Id=4");
    }

    @Given("kullanici generaldata bolumunde code kismina {string} girer")
    public void kullanici_generaldata_bolumunde_code_kismina_girer(String string) {
    page.generalDataCode.clear();
    page.generalDataCode.sendKeys(string);
    }

    @Given("kullanici generaldata bolumunde name kismina {string} girer")
    public void kullanici_generaldata_bolumunde_name_kismina_girer(String string) {
        page.generalDataName.clear();
        page.generalDataName.sendKeys(string);
    }

    @Given("kullanici generaldata bolumunde address kismina {string} girer")
    public void kullanici_generaldata_bolumunde_address_kismina_girer(String string) {
        page.generalDataAddress.clear();
        page.generalDataAddress.sendKeys(string);
    }

    @Given("kullanici generaldata bolumunde phone kismina {string} girer")
    public void kullanici_generaldata_bolumunde_phone_kismina_girer(String string) {
        page.generalDataPhone.clear();
        page.generalDataPhone.sendKeys(string);
    }

    @Given("kullanici generaldata bolumunde email kismina {string} girer")
    public void kullanici_generaldata_bolumunde_email_kismina_girer(String string) {
        page.generalDataEmail.clear();
        page.generalDataEmail.sendKeys(string);
    }

    @Given("kullanici generaldata bolumunde group dropdown bolumunden {string} secer")
    public void kullanici_generaldata_bolumunde_group_dropdown_bolumunden_secer(String string) {
    Select select=new Select(page.generalDataIDGroup);
    select.selectByVisibleText(string);
    }

    @Given("kullanici generaldata bolumunde save buttonuna tiklar")
    public void kullanici_generaldata_bolumunde_save_buttonuna_tiklar() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.generalDataSaveButtonu.click();
    }

    @Then("kullanici generaldata bolumunde basarili yazisini assert eder")
    public void kullanici_generaldata_bolumunde_basarili_yazisini_assert_eder() {
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
        //boolean yaziDogruMu = wait.until(ExpectedConditions.textToBe(By.className("bootbox-body") , "Hotel was updated successfully"));
        //Assert.assertTrue(yaziDogruMu);

    }
    //========================================================================
    @Given("kullanici hotelroomedit {string} sayfasina gider")
    public void kullanici_hotelroomedit_sayfasina_gider(String string) {
        Driver.getDriver().get(string);
    }

    @Given("kullanici hotelroomedit sayfasinda properties bolumune tiklar")
    public void kullanici_hotelroomedit_sayfasinda_properties_bolumune_tiklar() {
    page.hotelRoomEditPropertiesLinki.click();
    }
    @Given("kullanici hotelroomedit sayfasinda tip olarak {string} secer")
    public void kullanici_hotelroomedit_sayfasinda_tip_olarak_secer(String string) {
    Select select=new Select(page.hotelRoomEditPropertiesTipDropdown);
    select.selectByVisibleText(string);
    }

    @Given("kullanici hotelroomedit sayfasinda code olarak {string} girer")
    public void kullanici_hotelroomedit_sayfasinda_code_olarak_girer(String string) {
    page.hotelRoomEditPropertiesCodeKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomedit sayfasinda value olarak {string} girer")
    public void kullanici_hotelroomedit_sayfasinda_value_olarak_girer(String string) {
    page.hotelRoomEditPropertiesValueKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomedit sayfasinda save butonuna tiklar")
    public void kullanici_hotelroomedit_sayfasinda_save_butonuna_tiklar() {
    page.hotelRoomEditPropertiesSaveButonu.click();
    }

    @Then("kullanici hotelroomedit sayfasinda properties bolumunde yeni kayit oldugunu assert eder")
    public void kullanici_hotelroomedit_sayfasinda_properties_bolumunde_yeni_kayit_oldugunu_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.hotelRoomEditPropertiesIlkKayitRemoveButonu.isDisplayed());
    }









}
