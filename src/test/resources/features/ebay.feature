@ebayarama
  Feature: Ebay Urun Arama
   Scenario Outline: TC06_kullanici ebayda urunler arar
     Given kullanici "http://www.ebay.com" sayfasina gider
     And kullanici ebayda aramakutusuna "<urunler>" yazar ve arar
     Then kullanici ebaydaki sonuc sayisini ekrana yazdirir

     Examples: Test Verileri
     |urunler      |
     |bebek arabasi|
     |araba        |
     |bisiklet     |
