package com.xy.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDay1 {
    @Test
    public void Test1(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\xy\\IdeaProjects\\selenium\\ChromeDriver\\chromedriver.exe");
        WebDriver a=new ChromeDriver();
    }

}
