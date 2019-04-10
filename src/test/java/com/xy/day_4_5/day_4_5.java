package com.xy.day_4_5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class day_4_5 {
    WebDriver driver;

    @BeforeMethod
    public void openchrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\xy\\IdeaProjects\\selenium\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void closechrome() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test_1() throws InterruptedException {
        driver.get("F:\\selenium\\selenium+java自动化（最新）\\源码\\webdriver_demo\\selenium_html\\index.html");
        WebElement select = driver.findElement(By.name("select"));
        Select select1 = new Select(select);
        select1.selectByValue("oppe");
        Thread.sleep(3000);
        select1.selectByIndex(0);
        Thread.sleep(3000);
        select1.selectByVisibleText("meizu");
    }

    @Test
    public void test_2() {
        driver.get("F:\\selenium\\selenium+java自动化（最新）\\源码\\webdriver_demo\\selenium_html\\index.html");
        driver.findElement(By.linkText("Open new window")).click();
        for(String handle:driver.getWindowHandles()){
            if (handle.equals(driver.getWindowHandle())){
                continue;
            }
            driver.switchTo().window(handle);
        }
        WebElement user = driver.findElement(By.id("user"));
        user.sendKeys("这是一首简单的小情歌");
    }

    @Test
    public void test_3(){
        driver.get("F:\\selenium\\selenium+java自动化（最新）\\源码\\webdriver_demo\\selenium_html\\index.html");
        driver.findElement(By.className("wait")).click();
        WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("red")));
        driver.findElement(By.className("red"));

    }
    @Test
    public void test_4(){
        driver.get("F:\\selenium\\selenium+java自动化（最新）\\源码\\webdriver_demo\\selenium_html\\index.html");
        WebElement over = driver.findElement(By.className("over"));
        Actions actions = new Actions(driver);
        actions.moveToElement(over).perform();

    }

    @Test
    public void test_5(){
        driver.get("F:\\selenium\\selenium+java自动化（最新）\\源码\\webdriver_demo\\selenium_html\\index.html");
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"selectWithMultipleEqualsMultiple\"]/option"));
        Actions action=new Actions(driver);
        action.keyDown(Keys.SHIFT).click(elements.get(2)).keyUp(Keys.SHIFT).perform();


    }
}
