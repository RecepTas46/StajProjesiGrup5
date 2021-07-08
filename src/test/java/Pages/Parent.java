package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class Parent {

    public void sendKeysFunction(WebElement element, String value)
    {
        waitUntilVisible(element); // element gözükene kadar bekle
        scrollToElement(element); // element e kadar javascript ile kaydır
        element.clear();// elemntin için temizle
        element.sendKeys(value); // valueyi  gönder
    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element); // element clickable kadar bekle
        scrollToElement(element); // element e kadar javascript ile kaydır
        element.click(); // click yap
    }

    public static void waitUntilVisible(WebElement element){
        WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollToUpElement(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].setAttribute('style', 'top:0px')", element);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitUntilClickable(WebElement element){
        WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void delay(int second)
    {
        try {
            Thread.sleep(1000*second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void verifyContainsText(WebElement element, String msg)
    {
        waitUntilVisible(element); // element clickable kadar bekle
        Assert.assertTrue(element.getText().toLowerCase().contains(msg.toLowerCase()));
    }

    public void waitnumberOfElementsToBeLessThan(By selector, int number)
    {
        WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(),20);
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(selector,number));
    }

    public void listSelectOption(List<WebElement> list, String option)
    {
        //List den istenen eleman click yapacak
        for(WebElement e: list)
        {
            if (e.getText().contains(option)) {
                e.click();
                break;
            }
        }
    }

    public void ESCClick()
    {
        try {
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ESCAPE);
            r.keyRelease(KeyEvent.VK_ESCAPE);
        } catch (AWTException e) {
            e.printStackTrace();
        }

//        Actions actions=new Actions(BaseDriver.getDriver());
//        Action action= actions.sendKeys(Keys.ESCAPE).build();
//        action.perform();

    }



}
