$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/googlearama.feature");
formatter.feature({
  "name": "Google Arama",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC01_kullanici googleda arama yapar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@google"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici google sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.GoogleAramaStepDefinitions.kullanici_google_sayfasina_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "techproeducation aramasi yapar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.GoogleAramaStepDefinitions.techproeducation_aramasi_yapar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sayfa basligini kontrol eder",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.GoogleAramaStepDefinitions.sayfa_basligini_kontrol_eder()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});