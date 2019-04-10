package com.xy.day_4_4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day_4_4 {
    WebDriver driver;

    @BeforeMethod
    public void openchrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\xy\\IdeaProjects\\selenium\\ChromeDriver\\chromedriver.exe");
        driver=new ChromeDriver();
    }

    @Test
    public void test_1() throws InterruptedException {
        driver.get("F:\\selenium\\selenium+java自动化（最新）\\源码\\webdriver_demo\\selenium_html\\index.html");
        driver.findElement(By.className("confirm")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);
        alert.accept();


    }

    @Test
    public void test_2() throws InterruptedException {
        driver.get("F:\\selenium\\selenium+java自动化（最新）\\源码\\webdriver_demo\\selenium_html\\index.html");
        driver.switchTo().frame("aa");
        driver.findElement(By.className("baidu")).click();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        driver.findElement(By.className("baidu")).click();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void closechrome(){
        driver.quit();
    }

}
