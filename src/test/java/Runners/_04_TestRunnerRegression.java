package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Aşağıdaki seçenekde tags eklendi içinde grup adına
 * sahip senaryolar çalıştıralacak sadece tüm senaryolardan
 * tags etiketi sınırlama yaptı sadece bu etikete veya grup adına sahip
 * olanlar çalışacak
 *
 * SmokeTest : En genel manada ana unsurları test etmek
 *  RegressionTest : Bütün birimleri uyumlu şekilde çalışma test etme
 *
 */
@CucumberOptions(
        tags = {"@RegressionTest"},//virgul koyup baska testler yazilabilir
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}


)
public class _04_TestRunnerRegression extends AbstractTestNGCucumberTests {

}
