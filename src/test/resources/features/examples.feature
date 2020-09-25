@teknolojikarama
  Feature: Amazon Birden Fazla Arama
    Scenario Outline: TC05_kullanici amazonda urunler arar
      Given kullanici amazon sayfasina gider
      And kullanici arama kutusuna "<urunler>" yazar ve arar
      Then kullanici sonuc sayisini ekrana yazdirir

      Examples: Urun Isimleri
      |urunler|
      |headphones|
      |camera    |
      |drone     |
      |pencil    |
      |tv        |