@urunarama1 @amazon
  Feature: Amazon Urun Arama
    Scenario: TC04_kullanici amazonda urun aramasi yapar
      Given kullanici "http://amazon.com" sayfasina gider
      #drone yerine baska kelimeler yazip dinamik aramalar yapabiliriz
      And kullanici amazonda aramakutusuna "drone" yazar ve arar
      Then kullanici amazonda sonuc sayisini ekrana yazdirir