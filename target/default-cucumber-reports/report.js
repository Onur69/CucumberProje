$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/amazonexamples.feature");
formatter.feature({
  "name": "Amazonda Urun Arama",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@birdenfazlaexamples"
    },
    {
      "name": "@amazon"
    }
  ]
});
formatter.scenarioOutline({
  "name": "TC07_kullanici amazonda dropdown ve aramakutusu kullanarak arama yapar",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "kullanici \"http://www.amazon.com\" sayfasina gider",
  "keyword": "Given "
});
formatter.step({
  "name": "kullanici amazonda dropdownda \"\u003ckategori\u003e\" secer",
  "keyword": "And "
});
formatter.step({
  "name": "kullanici amazonda aramakutusuna \"\u003curunismi\u003e\" yazar ve arar",
  "keyword": "And "
});
formatter.step({
  "name": "kullanici amazonda sonuc sayisini ekrana yazdirir",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test Verileri",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "kategori",
        "urunismi"
      ]
    },
    {
      "cells": [
        "Automotive",
        "phone holder"
      ]
    },
    {
      "cells": [
        "Baby",
        "stroller"
      ]
    },
    {
      "cells": [
        "Books",
        "miserables"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC07_kullanici amazonda dropdown ve aramakutusu kullanarak arama yapar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@birdenfazlaexamples"
    },
    {
      "name": "@amazon"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici \"http://www.amazon.com\" sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.EbayStepDefinition.kullanici_sayfasina_gider(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici amazonda dropdownda \"Automotive\" secer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinition.kullanici_amazonda_dropdownda_secer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici amazonda aramakutusuna \"phone holder\" yazar ve arar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinition.kullanici_amazonda_aramakutusuna_yazar_ve_arar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici amazonda sonuc sayisini ekrana yazdirir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinition.kullanici_amazonda_sonuc_sayisini_ekrana_yazdirir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC07_kullanici amazonda dropdown ve aramakutusu kullanarak arama yapar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@birdenfazlaexamples"
    },
    {
      "name": "@amazon"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici \"http://www.amazon.com\" sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.EbayStepDefinition.kullanici_sayfasina_gider(java.lang.String)"
});
