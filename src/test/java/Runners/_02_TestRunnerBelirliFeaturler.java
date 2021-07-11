package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Aşağıdaki opsionda çalıştırmak istediğimi FEATURE fillerın
 * pathleri verilerek sadece onlar çalıştırıldı
 * Hangi FEATURE ların çalışcağına features parametresine yazılan bölüm karar veriyor.
 * glue ise bunlara ait STEP lerin lokasyonu gösterilir.
 * Aşağıdaki örnekte sadece _01_Login.feature ve _07_EntranceExam.feature çalışcak.
 */

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_07_EntranceExam.feature"},
        glue = {"StepDefinitions"}



)
public class _02_TestRunnerBelirliFeaturler extends AbstractTestNGCucumberTests {
}
