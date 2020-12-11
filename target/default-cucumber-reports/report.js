$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ebay.feature");
formatter.feature({
  "name": "Ebay Urun Arama",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ebayarama"
    }
  ]
});
formatter.scenarioOutline({
  "name": "TC06_kullanici ebayda urunler arar",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "kullanici \"http://www.ebay.com\" sayfasina gider",
  "keyword": "Given "
});
formatter.step({
  "name": "kullanici ebayda aramakutusuna \"\u003curunler\u003e\" yazar ve arar",
  "keyword": "And "
});
formatter.step({
  "name": "kullanici ebaydaki sonuc sayisini ekrana yazdirir",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test Verileri",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "urunler"
      ]
    },
    {
      "cells": [
        "bebek arabasi"
      ]
    },
    {
      "cells": [
        "araba"
      ]
    },
    {
      "cells": [
        "bisiklet"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC06_kullanici ebayda urunler arar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ebayarama"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici \"http://www.ebay.com\" sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.EbayStepDefinition.kullanici_sayfasina_gider(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici ebayda aramakutusuna \"bebek arabasi\" yazar ve arar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.EbayStepDefinition.kullanici_ebayda_aramakutusuna_yazar_ve_arar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici ebaydaki sonuc sayisini ekrana yazdirir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.EbayStepDefinition.kullanici_ebaydaki_sonuc_sayisini_ekrana_yazdirir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC06_kullanici ebayda urunler arar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ebayarama"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici \"http://www.ebay.com\" sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.EbayStepDefinition.kullanici_sayfasina_gider(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici ebayda aramakutusuna \"araba\" yazar ve arar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.EbayStepDefinition.kullanici_ebayda_aramakutusuna_yazar_ve_arar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici ebaydaki sonuc sayisini ekrana yazdirir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.EbayStepDefinition.kullanici_ebaydaki_sonuc_sayisini_ekrana_yazdirir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC06_kullanici ebayda urunler arar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ebayarama"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici \"http://www.ebay.com\" sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.EbayStepDefinition.kullanici_sayfasina_gider(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici ebayda aramakutusuna \"bisiklet\" yazar ve arar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.EbayStepDefinition.kullanici_ebayda_aramakutusuna_yazar_ve_arar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici ebaydaki sonuc sayisini ekrana yazdirir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.EbayStepDefinition.kullanici_ebaydaki_sonuc_sayisini_ekrana_yazdirir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});