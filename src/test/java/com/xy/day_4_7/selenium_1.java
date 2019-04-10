package com.xy.day_4_7;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class selenium_1 {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities=DesiredCapabilities.chrome();
        WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.100:5555/wd/hub"),desiredCapabilities);
        driver.get("http://www.baidu.com");
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void test_1(){

    }
}
