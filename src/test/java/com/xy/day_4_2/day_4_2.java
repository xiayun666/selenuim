package com.xy.day_4_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day_4_2 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\xy\\IdeaProjects\\selenium\\ChromeDriver\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    @Test
    public void test(){
        driver.get("http://www.baidu.com");
        WebElement kw = driver.findElement(By.id("kw1"));

    }

    @AfterMethod
    public void afterMethond(){
        driver.quit();
    }
}
