package StepDefinitions;

import Utilities.BaseDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {

    @Before // her senaryodan önce
    public void before(Scenario scenario)
    {
        System.out.println("Senaryo başladı");
        System.out.println("scenario id si="+ scenario.getId());
        System.out.println("scenario name="+ scenario.getName());
    }

    @After // her senaryodan sonra
    public void after(Scenario scenario)
    {
        System.out.println("Senaryo Bitti");
        System.out.println("scenario sonucu="+ scenario.getStatus());
        System.out.println("scenario isFailed ?="+ scenario.isFailed());

        //if (scenario.getStatus().contains("Failed"))
        if (scenario.isFailed()) { // Scenario hatalı ise
            // testNG deki ekran kaydetme bölümü gelecek

            LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");

            TakesScreenshot screenshot = (TakesScreenshot) BaseDriver.getDriver();
            File ekranDosyasi = screenshot.getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(ekranDosyasi,
                        new File("target/FailedScreenShots/"+ scenario.getId()+date.format(formatter)+".png"));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        BaseDriver.DriverQuit();
    }

}
