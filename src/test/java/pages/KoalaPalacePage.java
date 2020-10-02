package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class KoalaPalacePage {
    public KoalaPalacePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "UserName")
    public WebElement userNameKutusu;
    @FindBy(id = "Password")
    public WebElement passwordKutusu;
    @FindBy(xpath = "//button[.='Log in']")
    public WebElement girisButonu;
    @FindBy(id = "Code")
    //===============================================

    public WebElement hotelCreateCodeKutusu;
    @FindBy(id = "Name")
    public WebElement hotelCreateNameKutusu;
    @FindBy(id = "Address")
    public WebElement hotelCreateAdressKutusu;
    @FindBy(id = "Phone")
    public WebElement hotelCreatePhoneKutusu;
    @FindBy (id = "Email")
    public WebElement hotelCreateEmailKutusu;
    @FindBy (id = "IDGroup")
    public WebElement hotelCreateIDGroupDropdown;
    @FindBy (id = "btnSubmit")
    public WebElement hotelCreateSaveButonu;
    @FindBy (className = "bootbox-body")
    public WebElement hotelCreateBasariliYazisi;
    @FindBy(id = "IDHotel")
    //=================================================

    public WebElement hotelRoomCreateIDHotel;
    @FindBy(id = "Code")
    public WebElement hotelRoomCreateCode;
    @FindBy(id = "Name")
    public WebElement hotelRoomCreateName;
    @FindBy(id = "Location")
    public WebElement hotelRoomCreateLocation;
    @FindBy(xpath = "//textarea[@role='textbox']")
    public WebElement hotelRoomCreateDescription;
    @FindBy(id = "Price")
    public WebElement hotelRoomCreatePrice;
    @FindBy(id = "IDGroupRoomType")
    public WebElement hotelRoomCreateRoomType;
    @FindBy(id = "MaxAdultCount")
    public WebElement hotelRoomCreateMaxAdultCount;
    @FindBy(id = "MaxChildCount")
    public WebElement hotelRoomCreateMaxChildCount;
    @FindBy(id = "IsAvailable")
    public WebElement hotelRoomCreateApproved;
    @FindBy(id = "btnSubmit")
    public WebElement hotelRoomCreateSaveButtonu;
    @FindBy(xpath = "//div[.='HotelRoom was inserted successfully']")
    public WebElement hotelRoomCreateSonucYazisi;
    @FindBy ( xpath = "//*[@data-id='500']")
    public WebElement hotelRoomCreatePrice500 ;
//=============================================================
    @FindBy(id = "IDUser")
    public WebElement roomReservationIDUser1;
    @FindBy(id = "IDHotelRoom")
    public WebElement roomReservationIDUser2;
    @FindBy(id = "Price")
    public WebElement roomReservationPrice;
    @FindBy(id = "DateStart")
    public WebElement roomReservationDateStart;
    @FindBy(id = "DateEnd")
    public WebElement roomReservationDateEnd;
    @FindBy(id = "AdultAmount")
    public WebElement roomReservationAdultAmount;
    @FindBy(id = "ChildrenAmount")
    public WebElement roomReservationChildrenAmount;
    @FindBy(id = "ContactNameSurname")
    public WebElement roomReservationContactNameSurname;
    @FindBy(id = "ContactPhone")
    public WebElement roomReservationContactPhone;
    @FindBy(id = "ContactEmail")
    public WebElement roomReservationContactEmail;
    @FindBy(id = "Notes")
    public WebElement roomReservationNotes;
    @FindBy(id = "btnSubmit")
    public WebElement roomReservationSaveButonu;
    @FindBy(className= "bootbox-body")
    public WebElement roomReservationBasariliYazisi;
    //negative test
    @FindBy(xpath = "//label[@class='error']")
    public WebElement hataMesaji;

    //=======================================================

    @FindBy(name = "Code")
    public WebElement hotelListCodeKutusu;
    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement hotelListSearchButtonu;
    @FindBy(xpath = "//tbody/tr[1]")
    public WebElement hotelListIlkSatir;
    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement hotelListIlkSatirCodeSutunu;
    @FindBy(className = "dataTables_info")
    public WebElement hotelListToplamSonucSayisi;
    //=================================================

    @FindBy(id = "lkpHotels")
    public WebElement hotelRoomListIDHotelDropdown;
    @FindBy(name = "Code")
    public WebElement hotelRoomListCodeKutusu;
    @FindBy(name = "Name")
    public WebElement hotelRoomListNameKutusu;
    @FindBy(name = "Location")
    public WebElement hotelRoomListLocationKutusu;
    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement hotelRoomListAramaKutusu;
    @FindBy(className = "dataTables_info")
    public WebElement hotelRoomListLSonucSayisi;
    @FindBy(xpath = "//tbody/tr[1]")
    public WebElement hotelRoomListIlkSatir;
    //=======================================================

    @FindBy(className = "dataTables_empty")
    public WebElement hotelCreateKayitBulunmadiYazisi;
    //=======================================================

    @FindBy(id = "lkpHotelRooms")
    public WebElement hotelReservationListHotelRoomIdDropdown;
    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement hotelReservationListAramaKutusu;
    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> hotelResrvationListIlkSayfaSonuclari;
    //========================================================================================

    @FindBy(className = "bootbox-body")
    public WebElement generalDataBasariliYazisi;
    @FindBy(id = "Code")
    public WebElement generalDataCode;
    @FindBy(id = "Name")
    public WebElement generalDataName;
    @FindBy(id = "Address")
    public WebElement generalDataAddress;
    @FindBy(id = "Phone")
    public WebElement generalDataPhone;
    @FindBy(id = "Email")
    public WebElement generalDataEmail;
    @FindBy(id = "IDGroup")
    public WebElement generalDataIDGroup;
    @FindBy(xpath = "//button[@class='btn green']")
    public WebElement generalDataSaveButtonu;
    //=============================================================

    @FindBy ( linkText = "Properties")
    public WebElement hotelRoomEditPropertiesLinki;
    @FindBy ( id = "lkpBarcodeTypes" )
    public WebElement hotelRoomEditPropertiesTipDropdown;
    @FindBy ( id = "txtBarcodeCode" )
    public WebElement hotelRoomEditPropertiesCodeKutusu;
    @FindBy ( id = "txtBarcode")
    public WebElement hotelRoomEditPropertiesValueKutusu;
    @FindBy ( xpath = "//button[@onclick='javascript:AddBarcode();return false;']")
    public WebElement hotelRoomEditPropertiesSaveButonu;
    @FindBy ( xpath = "//tbody/tr[1]/td[6]/a")
    public WebElement hotelRoomEditPropertiesIlkKayitRemoveButonu;





}
