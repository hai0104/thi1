package com.example.bai3_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.Console;
import java.time.Duration;

public class Bai1_SelumTest {
    ChromeDriver chromeDriver;
    WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));

    }

    @Test
    public void test() {
        chromeDriver.get("https://www.google.com/");
        sendKeys(By.name("q"),"Udemy");
        chromeDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        try {
            Thread.sleep(200); // Dừng 10 giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click vào link Udemy
        clickElement(By.partialLinkText("Udemy"));
//        clickElement(By.linkText("Udemy: Online Courses"));

        try {
            Thread.sleep(1000); // Dừng 10 giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    @AfterEach
    public void tearDown() {
        if (chromeDriver != null)
        {
            chromeDriver.quit();
        }
        System.out.println("Test kết thúc.");


    }

    // Hàm nhập text vào ô input
    private void sendKeys(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }

    // Hàm click phần tử với xử lý lỗi
    private void clickElement(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            scrollToElement(element);
            element.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("Element bị chặn, thử click bằng JavaScript...");
            WebElement element = chromeDriver.findElement(locator);
            ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].click();", element);
        }
    }

    private void scrollToElement(WebElement element) {
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
