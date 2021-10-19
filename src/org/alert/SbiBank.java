package org.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiBank {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	

	
	driver.get("https://retail.onlinesbi.com/retail/login.htm");
	
	WebElement si = driver.findElement(By.xpath("(//a[contains(text(),'CONTINUE')])[1]"));
	si.click();
	
	WebElement sbi = driver.findElement(By.xpath("//input[@type='submit']"));
	sbi.click();
	Alert al = driver.switchTo().alert();
	System.out.println(al.getText());
	al.accept();
	
}
}
