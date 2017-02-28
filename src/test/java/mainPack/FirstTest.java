package mainPack;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    WebDriver webDriver;

    @Test
    public void FirstTest() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        webDriver.get("http://v3.test.itpmgroup.com/login");

        webDriver.findElement(By.xpath(".//input[@name='_username']")).clear();
        webDriver.findElement(By.xpath(".//input[@name='_username']")).sendKeys("yy401@bigmir.net");

        webDriver.findElement(By.xpath(".//input[@id='password']")).clear();
        webDriver.findElement(By.xpath(".//input[@id='password']")).sendKeys("909090");





    }

}
