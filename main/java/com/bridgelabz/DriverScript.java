package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverScript {
    public static WebDriver driver;
    @BeforeTest
    @Description("Used setUp method for setting the browser")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Navigating to url : https://www.linkedin.com")

    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();


        driver = new ChromeDriver();
    }

   // @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }
}
