package org.windowhandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	    driver.findElement(By.id("inputValEnter")).sendKeys("Hand Sanitizer" ,Keys.ENTER);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//img[@class='product-image '])[2]")).click();
	    Thread.sleep(2000);
	    
	    String parentWindowId = driver.getWindowHandle(); 
	    Set<String> allWindows = driver.getWindowHandles(); 
	    int windowCount = 0;
	    for (String x : allWindows)
	    {
	    	windowCount++;
	    if (!parentWindowId.equals(x))
	    {
	    	if (windowCount == 2)
	    	{
	    driver.switchTo().window(x);
	    driver.close();
	    continue;
	    }
	    driver.switchTo().window(x);
	    System.out.println("I am in " + windowCount +
	    "window");
	    }
	    driver.switchTo().defaultContent();}
	    
	    
		
		
		
	}

	
}
