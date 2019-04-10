package com.xy.day_3_31;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

    public class TestCase_1 {
        WebDriver driver;
        @BeforeMethod
        public void BeforeMethod(){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\xy\\IdeaProjects\\selenium\\ChromeDriver\\chromedriver.exe");
            driver=new ChromeDriver();
        }
        @Test
        public void testCase() throws InterruptedException {
            Dimension dimension=new Dimension(300,300);
            driver.manage().window().setSize(dimension);
            Thread.sleep(3000);
            driver.manage().window().maximize();
            driver.get("http://www.baidu.com");
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
            driver.navigate().forward();
            Thread.sleep(3000);
            driver.navigate().refresh();



        }

        @AfterMethod
        public void AfterMethod() throws InterruptedException {
            Thread.sleep(5000);
            driver.quit();
        }

}
