package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//glue=tutkal
//plugin=eklenti
//dryrun=kurubaslangic
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",//html formatinda rapor olusturmak icin
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},  // rapor oluşturmak için
        features = {"src/test/resources/features"}, //features klasorunun adresi
        glue = {"stepdefinitions"},//testlerin icerisinde oldugu paketin ismi
        tags = "@walmart" , // seçtiğiniz tag'a ait testler çalıştırılır.
        dryRun =false //senaryoda olusturdugumuz ancak henuz test methodu yazilmamis olan
                        //stepslerin methodlarini consol'da gormek icin "dryRun=true"
                        //seklinde kullaniyoruz
        //dryRun=false olursa testleri calistirir
        //dryRun=true olursa eksik olan methodlari bulur ve size oneride bulunur.
        //bu nedenle run etmeden once dryRun=true yapariz ve method onerilerini alip kopyalayip class'imiza
        //yapistiririz. Daha sonra dryRun=false yapar ve tekrar testimizi run edeip bekledigimiz sonuclari aliriz.
        )
public class Runner {

}


