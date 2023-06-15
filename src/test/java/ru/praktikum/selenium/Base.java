package ru.praktikum.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Base {

    WebDriver webDriver;

    @Before
    public void init() {

        /*WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();*/
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        webDriver = new FirefoxDriver();

        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @After
    public void clean(){
        webDriver.quit();
    }
}