$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/walmart.feature");
formatter.feature({
  "name": "Walmart Urun Arama",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@walmart"
    }
  ]
});
formatter.scenarioOutline({
  "name": "TC08_kullanici walmartta urun arar",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "kullanici \"https://walmart.com\" sayfasina gider",
  "keyword": "Given "
});
formatter.step({
  "name": "kullanici walmart aramakutusuna \"\u003ckelime\u003e\" yazar ve arar",
  "keyword": "And "
});
formatter.step({
  "name": "kullanici walmart sonuc sayisini ekrana yazdirir",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test Verileri",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "kelime"
      ]
    },
    {
      "cells": [
        "calculator"
      ]
    },
    {
      "cells": [
        "watch"
      ]
    },
    {
      "cells": [
        "flower"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC08_kullanici walmartta urun arar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@walmart"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici \"https://walmart.com\" sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.EbayStepDefinition.kullanici_sayfasina_gider(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici walmart aramakutusuna \"calculator\" yazar ve arar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.WalmartStepDefinition.kullanici_walmart_aramakutusuna_yazar_ve_arar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici walmart sonuc sayisini ekrana yazdirir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.WalmartStepDefinition.kullanici_walmart_sonuc_sayisini_ekrana_yazdirir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC08_kullanici walmartta urun arar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@walmart"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici \"https://walmart.com\" sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.EbayStepDefinition.kullanici_sayfasina_gider(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici walmart aramakutusuna \"watch\" yazar ve arar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.WalmartStepDefinition.kullanici_walmart_aramakutusuna_yazar_ve_arar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici walmart sonuc sayisini ekrana yazdirir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.WalmartStepDefinition.kullanici_walmart_sonuc_sayisini_ekrana_yazdirir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC08_kullanici walmartta urun arar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@walmart"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici \"https://walmart.com\" sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.EbayStepDefinition.kullanici_sayfasina_gider(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici walmart aramakutusuna \"flower\" yazar ve arar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.WalmartStepDefinition.kullanici_walmart_aramakutusuna_yazar_ve_arar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici walmart sonuc sayisini ekrana yazdirir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.WalmartStepDefinition.kullanici_walmart_sonuc_sayisini_ekrana_yazdirir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});utusu kullanarak arama yapar",
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
  "name": "kullanici amazonda dropdownda \"Books\" secer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinition.kullanici_amazonda_dropdownda_secer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici amazonda aramakutusuna \"miserables\" yazar ve arar",
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
formatter.uri("file:src/test/resources/features/amazonsearch.feature");
formatter.feature({
  "name": "Amazon Arama",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@urunarama"
    }
  ]
});
formatter.background({
  "name": "Oncesinde Calisacak Method(BeforeClass gibi)",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici amazon sayfasina gider",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "TC02_kullanici amazonda arama yapar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@urunarama"
    },
    {
      "name": "@amazon"
    }
  ]
});
formatter.step({
  "name": "kullanici headphones aramasi yapar",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "kullanici sonuc sayisini ekrana yazdirir",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/parametre.feature");
formatter.feature({
  "name": "Amazon Urun Arama",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@urunarama1"
    },
    {
      "name": "@amazon"
    }
  ]
});
formatter.scenario({
  "name": "TC04_kullanici amazonda urun aramasi yapar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@urunarama1"
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
  "name": "kullanici \"http://amazon.com\" sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.EbayStepDefinition.kullanici_sayfasina_gider(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici amazonda aramakutusuna \"drone\" yazar ve arar",
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
});