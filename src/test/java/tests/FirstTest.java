package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {
private  WebDriver driver;
    public void setUp(WebDriver driver) {

        System.setProperty("webserver.gecko.driver","/Users/muakhtar/Downloads/geckodriver");
        driver=new FirefoxDriver();
        driver.navigate().to("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }

    public static void main(String[] args) {
        FirstTest test = new FirstTest();
        test.setUp(test.driver);
    }
}
