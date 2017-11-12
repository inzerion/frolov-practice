package org.zaverukha.edu;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class Main {
    static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
//        Login login = new Login();
//        login.setUserName("User1");
//        login.setPassword("AWE@E");
//        HomePage homePage = login.submit();
//        List<String> news = homePage.getNews();
//        news.forEach( n -> LOGGER.info(n));

        //System.setProperty("webdriver.chrome.driver", "/Users/alexanderzaverukha/Software/chromedriver");
           WebDriver chromeDriver = new ChromeDriver();
        JavascriptExecutor jsexec = (JavascriptExecutor)chromeDriver;
        chromeDriver.get("https://jqueryui.com/accordion/");
        WebElement element = (WebElement) jsexec.executeScript("return $('.ui-accordion-header')[0]");
        chromeDriver.quit();


    }

}