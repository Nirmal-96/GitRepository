package org.frames;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTechnology {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://greenstech.in/selenium-course-content.html\r\n");
		
		driver.findElement(By.xpath("(//i[@class='fas fa-plus'])[7]")).click();
		
		driver.findElement(By.xpath("//a[text()=' JUNIT']")).click();
		
		Set<String> w = driver.getWindowHandles();
		for (String tab : w) {
			driver.switchTo().window(tab);
			
		}
		
		
		WebElement m = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
		System.out.println("print ques...."+m.getText());
		
		
		
		
	}

}
