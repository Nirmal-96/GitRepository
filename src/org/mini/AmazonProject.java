package org.mini;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.glass.events.KeyEvent;

public class AmazonProject {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(" https://www.amazon.com/\r\n");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
		s.sendKeys("iphone 7 mobile");
		s.submit();	
		
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
		
		Actions a=new Actions(driver);
		a.contextClick(findElement).perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amazon.com/Universal-Smartphone-Compatible-Adjustable-Foldable/dp/B07ZF81S18/ref=sr_1_1_sspa?dchild=1&keywords=iphone+7+mobile&qid=1632212732&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUFHSUJMUUdWS0hOODImZW5jcnlwdGVkSWQ9QTAyOTM1NDYxMzg3N0pSTk1MUkY2JmVuY3J5cHRlZEFkSWQ9QTA5Njc5MjYyWFVSSjE1TFJFMDk5JndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
	
		WebElement i = driver.findElement(By.id("priceblock_ourprice"));
		System.out.println("Mobile price..."+i.getText());
		
	  
		
	
		
		
		
	}

}