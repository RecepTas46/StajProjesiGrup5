package Utilities;

import Pages.Parent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriverSingle {
    /**
     *  Interview Sorusu
     *              Singleton driver nedir?
     *      Bütün projede aynı ve tek bir driverın kullanılmasıdır.
     */

    public static WebDriver driver;

    public static WebDriver getDriver()
    {
        if (driver == null) {
//        System.setProperty("webdriver.chrome.driver","/Users/apple/IdeaProjects/Selenium/chromedriver");
//        driver=new ChromeDriver();

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            // firefox
//            WebDriverManager.firefoxdriver().setup();
//            driver=new FirefoxDriver();
        }

        return driver;
    }

    public static void DriverQuit()
    {
        // bekleme
        Parent.delay(5);


        if (driver != null)
        {
            driver.quit();
            driver=null;
        }
    }
}
