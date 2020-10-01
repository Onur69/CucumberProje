$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Koalapalace.feature");
formatter.feature({
  "name": "Koala Palace",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@koalapalace"
    }
  ]
});
formatter.background({
  "name": "Koala Palace Admin Giris",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici \"http://www.kaolapalace-qa-environment2.com/Account/LogOn?ReturnUrl\u003d%2FAdmin%2FUserAdmin\" sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.EbayStepDefinition.kullanici_sayfasina_gider(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici kullaniciadi ve sifresini girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_kullaniciadi_ve_sifresini_girer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici giris islemini gerceklestirir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_giris_islemini_gerceklestirir()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC26_kullanici hotelreservationlist sayfasinda verileri girerek reservation arar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@koalapalace"
    },
    {
      "name": "@hotelreservationsearch"
    }
  ]
});
formatter.step({
  "name": "kullanici hotelroomreservationlist sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_hotelroomreservationlist_sayfasina_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici hotelroomreservationlist hotelroomid bolumunde \"team06\" secer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_hotelroomreservationlist_hotelroomid_bolumunde_secer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici hotelroomreservationlist arama kutusuna tiklar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_hotelroomreservationlist_arama_kutusuna_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici hotelroomreservationlist kayitlari inceler",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.kullanici_hotelroomreservationlist_kayitlari_inceler()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});