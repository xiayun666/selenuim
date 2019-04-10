package com.xy.day_4_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class firefox_1 {

    @Test
    public void  test(){
        //System.setProperty("webdriver.firefox.bin","D:\\huohu\\firefox.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\xy\\IdeaProjects\\selenium\\Driver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.baidu.com");
        driver.quit();
    }
}
