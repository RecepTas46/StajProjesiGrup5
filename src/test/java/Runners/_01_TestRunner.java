package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Runner Classlar ne için kullanılır: Belirli veya grupladığımı testleri toplu olarak çalıştırma imkanı veriri.
 * Bunun için;
 * 1- Java Class açılır.
 * 2- AbstractTestNGCucumberTests  extend alınır.Böylece RUN özelliği kazanır
 * 3- Class a   @CucumberOptions annotition ı eklenrek , buraya parametreleri verilerek kullanılır.
 * Genel olarak TestNG deki XML i olarak düşünebilirsiniz.
 *
 * Aşağıdaki ayarlara göre features daki belirtilen klasördeki bütün feature lar çalıştırılacak
 *
 */
@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},//buraya feature filesin path ni verecegiz
        glue = {"StepDefinitions"},//stepDefinitions klasorunu verecegiz
        dryRun = false//tru oldugunda testlerin varligini kontrol ediyor
        //false oldugunda butun testleri calistiriyor


)
public class _01_TestRunner extends AbstractTestNGCucumberTests {
}
