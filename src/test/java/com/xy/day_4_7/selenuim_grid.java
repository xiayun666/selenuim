package com.xy.day_4_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class selenuim_grid {
/*    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\xy\\IdeaProjects\\selenium\\Driver\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\xy\\IdeaProjects\\selenium\\ChromeDriver\\chromedriver.exe");

    }*/

    @DataProvider(name="user")
    public Object[][] test1(){
        return new Object[][]{
                {"chrome","http://192.168.0.100:5555/wd/hub"},
                {"firefox","http://192.168.0.100:5555/wd/hub"}
        };
    }

    @Test(dataProvider = "user")
    public void test_2(String Brower,String url) throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities;
        if(Brower.equals("chrome")){
            desiredCapabilities=DesiredCapabilities.chrome();
        }else if(Brower.equals("firefox")){
            desiredCapabilities=DesiredCapabilities.firefox();
        }else {
            desiredCapabilities=DesiredCapabilities.internetExplorer();
        }
        WebDriver webDriver=new RemoteWebDriver(new URL(url),desiredCapabilities);
        webDriver.get("http://www.baidu.com");
        Thread.sleep(5000);
        webDriver.quit();



    }
    @Test
    public void test_1() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("test");
    }
}
