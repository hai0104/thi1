package com.example.bai3_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Bai2_SelumTest {
    ChromeDriver chromeDriver;
    WebDriverWait wait;
    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
//        wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
    }
    @Test
    public void test(){
       try {
           chromeDriver.get("https://google.com");

           Thread.sleep(10000);
           System.out.println("Website opened:"+chromeDriver.getCurrentUrl());
       }catch (Exception e){
           e.printStackTrace();
       }
    }
    @AfterEach
    public void tearDown() {
        if (chromeDriver != null)
        {
            chromeDriver.quit();
        }
        System.out.println("Website closed");



    }
}
