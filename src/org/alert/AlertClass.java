package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {
	public static void main(String[] args) {
		
		
		
		
		
		
		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//simple alert
		WebElement sm = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		sm.click();
		Alert sim = driver.switchTo().alert();
		System.out.println(sim.getText());
		sim.accept();
//		
//		//conform alert
//		WebElement con = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//		con.click();
//		WebElement cin = driver.findElement(By.xpath("(//button[contains(@class,'btn')])[3]"));
//		cin.click();
//		
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.dismiss();
//		
//		//prompt alert
//		WebElement p = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
//		p.click();
//		WebElement pr = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
//		pr.click();
//		
//		Alert alert2 = driver.switchTo().alert();
//		alert2.sendKeys("nirmal");
//		System.out.println(alert.getText());
//		alert2.accept();
//		
	}

}
