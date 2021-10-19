package org.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    
    
    driver.get(" http://adactinhotelapp.com/");
    
    WebElement fb = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
    fb.click();
    
    driver.findElement(By.id("username")).sendKeys("nirmaldoss");
    
    driver.findElement(By.id("password")).sendKeys("0123456");
    
    driver.findElement(By.id("re_password")).sendKeys("0123456");
    
    driver.findElement(By.id("full_name")).sendKeys("Nimal Doss");
    
    driver.findElement(By.id("email_add")).sendKeys("nirmal007@gmail.com");
    
    driver.findElement(By.id("captcha-form")).sendKeys("foyboat");
    
    driver.findElement(By.id("tnc_box")).click();
    
    driver.findElement(By.id("Submit")).click();
}
}
