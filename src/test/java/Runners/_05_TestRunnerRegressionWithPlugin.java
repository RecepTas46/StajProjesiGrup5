package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


/**
 * Aşağıdaki seçenekde tags eklendi içinde grup adına
 * sahip senaryolar çalıştıralacak sadece tüm senaryolardan
 * tags etiketi sınırlama yaptı sadece bu etikete veya grup adına sahip
 * olanlar çalışacak
 *
 * plugin kısmı ise basit rapor oluşturan kısım
 * "html:target/cucumber-report" : target klasörünün altında cucumber-report un
 * altında basit bir rapor oluşturacak.
 *
 * "json:target/cucumber.json" : aynı raporu JSON formatında oluşturacak.
 */
@CucumberOptions(
        tags = {"@RegressionTest"},//virgul koyup baska testler yazilabilir
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},

        plugin = {//basit rapor olusturma
                "html:target/cucumber-report","json:target/cucumber.json"
        }

)
public class _05_TestRunnerRegressionWithPlugin extends AbstractTestNGCucumberTests {

}
