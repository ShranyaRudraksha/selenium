package com.example.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

    @Test
    void openGoogleHomePage() {
        // Automatically set up ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");
        System.out.println("Page Title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }   
}
