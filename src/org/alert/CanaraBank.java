package org.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanaraBank {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
	
	WebElement si = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	si.click();
	
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
}
}
