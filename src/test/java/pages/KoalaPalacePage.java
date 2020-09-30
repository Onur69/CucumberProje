package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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


}
