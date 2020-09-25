Feature: Google Arama
  @google
  Scenario: TC01_kullanici googleda arama yapar
    Given kullanici google sayfasina gider
    And techproeducation aramasi yapar
    Then sayfa basligini kontrol eder
    #yorum satiri icin "#" ifadesini kullaniyoruz