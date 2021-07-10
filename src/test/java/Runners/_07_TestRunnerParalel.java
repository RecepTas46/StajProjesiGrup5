package Runners;

import Utilities.BaseDriver;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


@CucumberOptions(
        tags = {"@RegressionTest"},//virgul koyup baska testler yazilabilir
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},

        plugin = {//basit rapor olusturma
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
                // oluşturalacak raporun yeri ve adı veriliyor
        }

)
public class _07_TestRunnerParalel extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browser")
    public void beforeClass(String browser){
        BaseDriver.threadBrowserName.set(browser);
    }

    @AfterClass
    public static void afterClass() {

        Reporter.loadXMLConfig("src/test/java/XML Files/ExtentReportSet.xml");
        Reporter.setSystemInfo("User Name"," Recep TAS");
        Reporter.setSystemInfo("Aplication Name"," Basgar");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("EDepartment", "QAr");
        Reporter.setSystemInfo("Ek Satır","Açıklamas");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }
}
