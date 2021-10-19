package org.keyboard;

import java.awt.AWTException;
import java.awt.KeyEventPostProcessor;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class FaceBook {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/" );
	driver.manage().window().maximize();
	
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys("Nirmal");
	
	Actions a = new Actions(driver);
	
	
	
	//robotclass
	Robot r = new Robot();
	a.doubleClick(userName).perform();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_X);
	
	WebElement passWord = driver.findElement(By.id("pass"));
	passWord.click();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	Thread.sleep(1000);
	
	
	driver.navigate().to("http://greenstech.in/selenium-course-content.html");
	Thread.sleep(1000);
	
	WebElement models = driver.findElement(By.id("heading201"));
	a.moveToElement(models).perform();
	Thread.sleep(1000);
	models.click();
	
	WebElement x = driver.findElement(By.xpath("(//a[@target='_blank'])[157]"));
	a.contextClick(x).perform();	
	
	
}
}
