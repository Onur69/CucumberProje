@koalapalace
  Feature: Koala Palace
    #backround icindekiler her senaryodan once calisir
    Background: Koala Palace Admin Giris
      Given kullanici "http://www.kaolapalace-qa-environment2.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin" sayfasina gider
      And kullanici kullaniciadi ve sifresini girer
      Then kullanici giris islemini gerceklestirir

    @hotelcreate
    Scenario: TC09_kullanici bilgileri girerek hotel olusturur
      Given kullanici hotelcreate sayfasina gider
      And kullanici hotelcreate code bolumune "1234" girer
      And kullanici hotelcreate name bolumune "test" girer
      And kullanici hotelcreate adress bolumune "cikmaz sokak" girer
      And kullanici hotelcreate phone bolumune "05452345667" girer
      And kullanici hotelcreate email bolumune "asd@gmail.com" girer
      And kullanici hotelcreate idgroup bolumunde "Hotel Type1" secer
      And kullanici hotelcreate save butonuna tiklar
      Then kullanici hotelcreate kayit islemini assert eder

    @hotelroomcreate
    Scenario: TC10_kullanici bilgileri girerek hotel room creat olusturur
      Given kullanici hotelroomcreate sayfasina gider
      And kullanici hotelroomcreate bolumunde IDHotel "Star" secer
      And kullanici hotelroomcreate code bolumune "1234" girer
      And kullanici hotelroomcreate name bolumune "Ahmet" girer
      And kullanici hotelroomcreate location bolumune "Berlin" girer
      And kullanici hotelroomcreate Description bolumune "suitiniz bizden" girer
      And kullanici hotelroomcreate Price bolumune "700" droganddroop yapar
      And kullanici hotelroomcreate room type olarak dropdowndan "King" secer
      And kullanici hotelroomcreate Max Adult Count bolumune "2" girer
      And kullanicihotelroomcreate Max Children count bolumune "2" girer
      And kullanici hotelroomcreate Aproved secenegini secer
      And kullanici hotelroomcreate save butonuna tiklar
      Then kullanici hotelroomcreate kayit islemini assert eder

      @hotelreservationcreate
      Scenario: TC11_kullanici bilgileri girerek hotel room reservation olusturur
        Given kullanici roomreservation sayfasina gider
        And kullanici room reservation bolumunde IDUser1 "manager2" dropdowndan secer
        And kullanici room reservation bolumunde IDUser2 "Hilton" dropdowndan secer
        And kullanici room reservation bolumunde Price kismina "300" girer
        And kullanici room reservation bolumunde DateStart kismina "11/11/2021" girer
        And kullanici room reservation bolumunde DateEnd kismina "11/12/2021" girer
        And kullanici room reservation bolumunde AdultAmount "2" girer
        And kullanici room reservation bolumunde ChildrenAmount "2" girer
        And kullanici room reservation bolumunde ContactNameSurname "Ali Efe" girer
        And kullanici room reservation bolumunde ContactPhone "05452345623" girer
        And kullanici room reservation bolumunde ContactEmail "asd@gmail.com" girer
        And kullanici room reservation bolumunde Notes "naber" ekler
        And kullanici room reservation bolumunde save buttonuna tiklar
        Then And kullanici basarili yazisini assert eder.

    @hotelreservationcreate
    @hotelreservationnegativetest
    @hotelreservationnegativetest1
    Scenario: TC12_kullanici iduser secmeden roomreservation olusturur
      Given kullanici roomreservation sayfasina gider
      #And kullanici room reservation bolumunde IDUser1 "manager2" dropdowndan secer
      And kullanici room reservation bolumunde IDUser2 "Hilton" dropdowndan secer
      And kullanici room reservation bolumunde Price kismina "300" girer
      And kullanici room reservation bolumunde DateStart kismina "11/11/2021" girer
      And kullanici room reservation bolumunde DateEnd kismina "11/12/2021" girer
      And kullanici room reservation bolumunde AdultAmount "2" girer
      And kullanici room reservation bolumunde ChildrenAmount "2" girer
      And kullanici room reservation bolumunde ContactNameSurname "Ali Efe" girer
      And kullanici room reservation bolumunde ContactPhone "05452345623" girer
      And kullanici room reservation bolumunde ContactEmail "asd@gmail.com" girer
      And kullanici room reservation bolumunde Notes "naber" ekler
      And kullanici room reservation bolumunde save buttonuna tiklar
      Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder.

    @hotelreservationcreate
    @hotelreservationnegativetest
    @hotelreservationnegativetest2
      Scenario: TC13_kullanici iduser2 secmeden roomreservation olusturur
      Given kullanici roomreservation sayfasina gider
      And kullanici room reservation bolumunde IDUser1 "manager2" dropdowndan secer
      #And kullanici room reservation bolumunde IDUser2 "Hilton" dropdowndan secer
      And kullanici room reservation bolumunde Price kismina "300" girer
      And kullanici room reservation bolumunde DateStart kismina "11/11/2021" girer
      And kullanici room reservation bolumunde DateEnd kismina "11/12/2021" girer
      And kullanici room reservation bolumunde AdultAmount "2" girer
      And kullanici room reservation bolumunde ChildrenAmount "2" girer
      And kullanici room reservation bolumunde ContactNameSurname "Ali Efe" girer
      And kullanici room reservation bolumunde ContactPhone "05452345623" girer
      And kullanici room reservation bolumunde ContactEmail "asd@gmail.com" girer
      And kullanici room reservation bolumunde Notes "naber" ekler
      And kullanici room reservation bolumunde save buttonuna tiklar
      Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder.

    @hotelreservationcreate
    @hotelreservationnegativetest
    @hotelreservationnegativetest3
    Scenario: TC14_kullanici price secmeden roomreservation olusturur
      Given kullanici roomreservation sayfasina gider
      And kullanici room reservation bolumunde IDUser1 "manager2" dropdowndan secer
      And kullanici room reservation bolumunde IDUser2 "Hilton" dropdowndan secer
      #And kullanici room reservation bolumunde Price kismina "300" girer
      And kullanici room reservation bolumunde DateStart kismina "11/11/2021" girer
      And kullanici room reservation bolumunde DateEnd kismina "11/12/2021" girer
      And kullanici room reservation bolumunde AdultAmount "2" girer
      And kullanici room reservation bolumunde ChildrenAmount "2" girer
      And kullanici room reservation bolumunde ContactNameSurname "Ali Efe" girer
      And kullanici room reservation bolumunde ContactPhone "05452345623" girer
      And kullanici room reservation bolumunde ContactEmail "asd@gmail.com" girer
      And kullanici room reservation bolumunde Notes "naber" ekler
      And kullanici room reservation bolumunde save buttonuna tiklar
      Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder.

    @hotelreservationcreate
    @hotelreservationnegativetest
    @hotelreservationnegativetest4
    Scenario: TC15_kullanici DateStart secmeden roomreservation olusturur
      Given kullanici roomreservation sayfasina gider
      And kullanici room reservation bolumunde IDUser1 "manager2" dropdowndan secer
      And kullanici room reservation bolumunde IDUser2 "Hilton" dropdowndan secer
      And kullanici room reservation bolumunde Price kismina "300" girer
      #And kullanici room reservation bolumunde DateStart kismina "11/11/2021" girer
      And kullanici room reservation bolumunde DateEnd kismina "11/12/2021" girer
      And kullanici room reservation bolumunde AdultAmount "2" girer
      And kullanici room reservation bolumunde ChildrenAmount "2" girer
      And kullanici room reservation bolumunde ContactNameSurname "Ali Efe" girer
      And kullanici room reservation bolumunde ContactPhone "05452345623" girer
      And kullanici room reservation bolumunde ContactEmail "asd@gmail.com" girer
      And kullanici room reservation bolumunde Notes "naber" ekler
      And kullanici room reservation bolumunde save buttonuna tiklar
      Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder.

    @hotelreservationcreate
    @hotelreservationnegativetest
    @hotelreservationnegativetest5
    Scenario: TC16_kullanici DateEnd secmeden roomreservation olusturur
      Given kullanici roomreservation sayfasina gider
      And kullanici room reservation bolumunde IDUser1 "manager2" dropdowndan secer
      And kullanici room reservation bolumunde IDUser2 "Hilton" dropdowndan secer
      And kullanici room reservation bolumunde Price kismina "300" girer
      And kullanici room reservation bolumunde DateStart kismina "11/11/2021" girer
      #And kullanici room reservation bolumunde DateEnd kismina "11/12/2021" girer
      And kullanici room reservation bolumunde AdultAmount "2" girer
      And kullanici room reservation bolumunde ChildrenAmount "2" girer
      And kullanici room reservation bolumunde ContactNameSurname "Ali Efe" girer
      And kullanici room reservation bolumunde ContactPhone "05452345623" girer
      And kullanici room reservation bolumunde ContactEmail "asd@gmail.com" girer
      And kullanici room reservation bolumunde Notes "naber" ekler
      And kullanici room reservation bolumunde save buttonuna tiklar
      Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder.

    @hotelreservationcreate
    @hotelreservationnegativetest
    @hotelreservationnegativetest6
    Scenario: TC17_kullanici AdultAmount secmeden roomreservation olusturur
      Given kullanici roomreservation sayfasina gider
      And kullanici room reservation bolumunde IDUser1 "manager2" dropdowndan secer
      And kullanici room reservation bolumunde IDUser2 "Hilton" dropdowndan secer
      And kullanici room reservation bolumunde Price kismina "300" girer
      And kullanici room reservation bolumunde DateStart kismina "11/11/2021" girer
      And kullanici room reservation bolumunde DateEnd kismina "11/12/2021" girer
      #And kullanici room reservation bolumunde AdultAmount "2" girer
      And kullanici room reservation bolumunde ChildrenAmount "2" girer
      And kullanici room reservation bolumunde ContactNameSurname "Ali Efe" girer
      And kullanici room reservation bolumunde ContactPhone "05452345623" girer
      And kullanici room reservation bolumunde ContactEmail "asd@gmail.com" girer
      And kullanici room reservation bolumunde Notes "naber" ekler
      And kullanici room reservation bolumunde save buttonuna tiklar
      Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder.

    @hotelreservationcreate
    @hotelreservationnegativetest
    @hotelreservationnegativetest7
    Scenario: TC18_kullanici ChildrenAmount secmeden roomreservation olusturur
      Given kullanici roomreservation sayfasina gider
      And kullanici room reservation bolumunde IDUser1 "manager2" dropdowndan secer
      And kullanici room reservation bolumunde IDUser2 "Hilton" dropdowndan secer
      And kullanici room reservation bolumunde Price kismina "300" girer
      And kullanici room reservation bolumunde DateStart kismina "11/11/2021" girer
      And kullanici room reservation bolumunde DateEnd kismina "11/12/2021" girer
      And kullanici room reservation bolumunde AdultAmount "2" girer
      #And kullanici room reservation bolumunde ChildrenAmount "2" girer
      And kullanici room reservation bolumunde ContactNameSurname "Ali Efe" girer
      And kullanici room reservation bolumunde ContactPhone "05452345623" girer
      And kullanici room reservation bolumunde ContactEmail "asd@gmail.com" girer
      And kullanici room reservation bolumunde Notes "naber" ekler
      And kullanici room reservation bolumunde save buttonuna tiklar
      Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder.

    @hotelreservationcreate
    @hotelreservationnegativetest
    @hotelreservationnegativetest8
    Scenario: TC19_kullanici ContactNameSurname secmeden roomreservation olusturur
      Given kullanici roomreservation sayfasina gider
      And kullanici room reservation bolumunde IDUser1 "manager2" dropdowndan secer
      And kullanici room reservation bolumunde IDUser2 "Hilton" dropdowndan secer
      And kullanici room reservation bolumunde Price kismina "300" girer
      And kullanici room reservation bolumunde DateStart kismina "11/11/2021" girer
      And kullanici room reservation bolumunde DateEnd kismina "11/12/2021" girer
      And kullanici room reservation bolumunde AdultAmount "2" girer
      And kullanici room reservation bolumunde ChildrenAmount "2" girer
      #And kullanici room reservation bolumunde ContactNameSurname "Ali Efe" girer
      And kullanici room reservation bolumunde ContactPhone "05452345623" girer
      And kullanici room reservation bolumunde ContactEmail "asd@gmail.com" girer
      And kullanici room reservation bolumunde Notes "naber" ekler
      And kullanici room reservation bolumunde save buttonuna tiklar
      Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder.

    @hotelreservationcreate
    @hotelreservationnegativetest
    @hotelreservationnegativetest9
    Scenario: TC20_kullanici ContactPhone secmeden roomreservation olusturur
      Given kullanici roomreservation sayfasina gider
      And kullanici room reservation bolumunde IDUser1 "manager2" dropdowndan secer
      And kullanici room reservation bolumunde IDUser2 "Hilton" dropdowndan secer
      And kullanici room reservation bolumunde Price kismina "300" girer
      And kullanici room reservation bolumunde DateStart kismina "11/11/2021" girer
      And kullanici room reservation bolumunde DateEnd kismina "11/12/2021" girer
      And kullanici room reservation bolumunde AdultAmount "2" girer
      And kullanici room reservation bolumunde ChildrenAmount "2" girer
      And kullanici room reservation bolumunde ContactNameSurname "Ali Efe" girer
      #And kullanici room reservation bolumunde ContactPhone "05452345623" girer
      And kullanici room reservation bolumunde ContactEmail "asd@gmail.com" girer
      And kullanici room reservation bolumunde Notes "naber" ekler
      And kullanici room reservation bolumunde save buttonuna tiklar
      Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder.

    @hotelreservationcreate
    @hotelreservationnegativetest
    @hotelreservationnegativetest10
    Scenario: TC21_kullanici ContactEmail secmeden roomreservation olusturur
      Given kullanici roomreservation sayfasina gider
      And kullanici room reservation bolumunde IDUser1 "manager2" dropdowndan secer
      And kullanici room reservation bolumunde IDUser2 "Hilton" dropdowndan secer
      And kullanici room reservation bolumunde Price kismina "300" girer
      And kullanici room reservation bolumunde DateStart kismina "11/11/2021" girer
      And kullanici room reservation bolumunde DateEnd kismina "11/12/2021" girer
      And kullanici room reservation bolumunde AdultAmount "2" girer
      And kullanici room reservation bolumunde ChildrenAmount "2" girer
      And kullanici room reservation bolumunde ContactNameSurname "Ali Efe" girer
      And kullanici room reservation bolumunde ContactPhone "05452345623" girer
      #And kullanici room reservation bolumunde ContactEmail "asd@gmail.com" girer
      And kullanici room reservation bolumunde Notes "naber" ekler
      And kullanici room reservation bolumunde save buttonuna tiklar
      Then kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder.

    @hotelreservationcreate
    @hotelreservationnegativetest
    @hotelreservationnegativetest11
    Scenario: TC22_kullanici DateStarti DAteEndden sonra bir tarih girerek roomreservation olusturur
      Given kullanici roomreservation sayfasina gider
      And kullanici room reservation bolumunde IDUser1 "manager2" dropdowndan secer
      And kullanici room reservation bolumunde IDUser2 "Hilton" dropdowndan secer
      And kullanici room reservation bolumunde Price kismina "300" girer
      And kullanici room reservation bolumunde DateStart kismina "11/22/2021" girer
      And kullanici room reservation bolumunde DateEnd kismina "11/11/2021" girer
      And kullanici room reservation bolumunde AdultAmount "2" girer
      And kullanici room reservation bolumunde ChildrenAmount "2" girer
      And kullanici room reservation bolumunde ContactNameSurname "Ali Efe" girer
      And kullanici room reservation bolumunde ContactPhone "05452345623" girer
      And kullanici room reservation bolumunde ContactEmail "asd@gmail.com" girer
      And kullanici room reservation bolumunde Notes "naber" ekler
      And kullanici room reservation bolumunde save buttonuna tiklar
      Then And kullanici basarili yazisini assert etmemeli.

      @hotelsearch
      Scenario: TC23_kullanici hotel list sayfasinda code girerek hotel arar
        Given kullanici hotellist sayfasina gider
        And kullanici hotellist sayfasinda Code kismina "1234" girer
        And kullanici hotellist sayfasinda Search buttonuna tiklar
        Then kullanici hotellist bolumundeki kayitlari assert eder

      @hotelsearchnegative01
      Scenario: TC25_kullanici hotel list sayfasinda code girerek hotel arar
        Given kullanici hotellist sayfasina gider
        And kullanici hotellist sayfasinda Code kismina "-10" girer
        And kullanici hotellist sayfasinda Search buttonuna tiklar
        Then kullanici hotellist sonuc bolumunde kayit bulunamadi yazisini gorur

      @hotelroomsearch
      Scenario: TC24_kullanici hotelroomlist sayfasinda verileri girerek hotelroom arar
        Given kullanici hotelroomlist sayfasina gider
        And kullanici hotelroomlist idhotel bolumunde "Star" secer
        And kullanici hotelroomlist code bolumunde "12345" girer
        And kullanici hotelroomlist name bolumunde "Techproed" girer
        And kullanici hotelroomlist location bolumune "USA" girer
        And kullanici hotelroomlist sayfasinda search buttonuna tiklar
        Then kullanici hotelroomlist bolumundeki kayitlari inceler

      @hotelreservationsearch
      Scenario: TC26_kullanici hotelreservationlist sayfasinda verileri girerek reservation arar
        Given kullanici hotelroomreservationlist sayfasina gider
        And kullanici hotelroomreservationlist hotelroomid bolumunde "team06" secer
        And kullanici hotelroomreservationlist arama kutusuna tiklar
        Then kullanici hotelroomreservationlist kayitlari inceler

      @hoteledit
      Scenario: TC27_kullanici generaldata bolumunde duzenleme yapar
        Given kullanici generaldata sayfasina gider
        And kullanici generaldata bolumunde code kismina "69" girer
        And kullanici generaldata bolumunde name kismina "Kale" girer
        And kullanici generaldata bolumunde address kismina "Bayburt" girer
        And kullanici generaldata bolumunde phone kismina "02112345678" girer
        And kullanici generaldata bolumunde email kismina "kale@gmail.com" girer
        And kullanici generaldata bolumunde group dropdown bolumunden "Hotel Type1" secer
        And kullanici generaldata bolumunde save buttonuna tiklar
        Then kullanici generaldata bolumunde basarili yazisini assert eder

      @hotelroomedit
      Scenario: TC28_kullanici hotelroomedit sayfasinda properties bolumundeki veriyi siler
        Given kullanici hotelroomedit "http://www.kaolapalace-qa-environment2.com/admin/HotelRoomAdmin/Edit?Id=472" sayfasina gider
        And kullanici hotelroomedit sayfasinda properties bolumune tiklar
        And kullanici hotelroomedit sayfasinda tip olarak "room prop1" secer
        And kullanici hotelroomedit sayfasinda code olarak "4444" girer
        And kullanici hotelroomedit sayfasinda value olarak "sistem bozuldu" girer
        And kullanici hotelroomedit sayfasinda save butonuna tiklar
        Then kullanici hotelroomedit sayfasinda properties bolumunde yeni kayit oldugunu assert eder



