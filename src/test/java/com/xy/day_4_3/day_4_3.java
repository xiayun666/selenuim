package com.xy.day_4_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day_4_3 {
    WebDriver driver;

    @BeforeMethod
    public void openchrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\xy\\IdeaProjects\\selenium\\ChromeDriver\\chromedriver.exe");
        driver=new ChromeDriver();
    }

    @Test
    public void Test_1() throws InterruptedException {
        driver.get("http://www.baidu.com");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"kw\"]"));
        element.sendKeys("selenuim");
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"su\"]"));
        element1.click();
        Thread.sleep(3000);
        String title = driver.getTitle();
        Assert.assertEquals("selenium_百度搜索",title);


    }

    @AfterMethod
    public void closechrome(){
        driver.quit();
    }
}
