@urunarama
Feature: Amazon Arama
  #butun methodlarda basta ve ortak calisacak satiri buraya yazabiliriz
  #her scenario dan sonra calisir.
  Background: Oncesinde Calisacak Method(BeforeClass gibi)
    Given kullanici "http:/amazon.com" sayfasina gider
  @amazon
  Scenario: TC02_kullanici amazonda arama yapar
    And  kullanici amazonda aramakutusuna "head phones" yazar ve arar
    Then kullanici amazonda sonuc sayisini ekrana yazdirir
  @amazoncamera
  Scenario: TC03_kullanici amazonda arama yapar
    And kullanici amazonda aramakutusuna "camera" yazar ve arar
    Then kullanici amazonda sonuc sayisini ekrana yazdirir

