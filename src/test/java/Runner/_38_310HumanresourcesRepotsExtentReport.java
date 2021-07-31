package Runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = {"@HumanResourcesSetup"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},

        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
        }
)
public class _38_310HumanresourcesRepotsExtentReport extends AbstractTestNGCucumberTests {

       @AfterClass
       public static void afterClass() {
           Reporter.loadXMLConfig("src/test/java/XMLFiles/ExtendReportSet.xml");

           Reporter.setSystemInfo("User Name", "Group5");
           Reporter.setSystemInfo("Application Name", "Basqar");
           Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
           Reporter.setSystemInfo("Department", "QAr");
           Reporter.setSystemInfo("Ek Satır", "Acıklamasi");

           Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
       }
}
