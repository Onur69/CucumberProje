@urunarama
Feature: Amazon Arama
  #butun methodlarda basta ve ortak calisacak satiri buraya yazabiliriz
  #her scenario dan sonra calisir.
  Background: Oncesinde Calisacak Method(BeforeClass gibi)
    Given kullanici amazon sayfasina gider
  @amazon
  Scenario: TC02_kullanici amazonda arama yapar
    And  kullanici headphones aramasi yapar
    Then kullanici sonuc sayisini ekrana yazdirir
  @amazoncamera
  Scenario: TC03_kullanici amazonda arama yapar
    And kullanici aramakutusuna camera yazar ve arar
    Then kullanici sonuc sayisini ekrana yazdirir

