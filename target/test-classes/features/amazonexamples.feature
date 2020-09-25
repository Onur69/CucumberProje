@birdenfazlaexamples @amazon
Feature: Amazonda Urun Arama
  Scenario Outline: TC07_kullanici amazonda dropdown ve aramakutusu kullanarak arama yapar
    Given kullanici "http://www.amazon.com" sayfasina gider
    And kullanici amazonda dropdownda "<kategori>" secer
    And kullanici amazonda aramakutusuna "<urunismi>" yazar ve arar
    Then kullanici amazonda sonuc sayisini ekrana yazdirir

    Examples: Test Verileri
    |kategori     |urunismi    |
    |Automotive   |phone holder|
    |Baby         |stroller    |
    |Books        |miserables  |

