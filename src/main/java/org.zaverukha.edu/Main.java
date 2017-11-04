package org.zaverukha.edu;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "/Users/alexanderzaverukha/Software/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        JavascriptExecutor jsexec = (JavascriptExecutor)chromeDriver;
        chromeDriver.get("http://google.com");
        jsexec.executeScript("return alert('Hello')");
        chromeDriver.quit();
    }
}