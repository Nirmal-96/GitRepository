package org.mouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


		driver.get("https://www.homedepot.com/\r\n");


		WebElement mo = driver.findElement(By.xpath("//a[text()='All Departments']"));
		Actions b= new Actions(driver);
		b.moveToElement(mo).perform();
		Thread.sleep(1000);

		WebElement mov = driver.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));

		Actions c=new Actions(driver);
		c.moveToElement(mov).perform();
		Thread.sleep(2000);


		WebElement air = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		c.moveToElement(air).perform();
		Thread.sleep(1000);

		WebElement por = driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		por.click();
		Thread.sleep(1000);
		//	         
		//	         driver.navigate().to("http://demo.guru99.com/test/drag_drop.html ");
		//	         
		//	         WebElement drg = driver.findElement(By.xpath("(//a[contains(@class,'button ')])[5]"));
		//	         
		//	         WebElement drp = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		//	         
		//	         Actions d = new Actions(driver);
		//	         d.dragAndDrop(drg, drp).perform();
		//	         
		//	         WebElement drg2 = driver.findElement(By.xpath("(//a[contains(@class,'button button-orange')])[4]"));
		//	         
		//	         WebElement drp2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		//	         
		//	         Actions e= new Actions(driver);
		//	         e.dragAndDrop(drg2, drp2).perform();
		//	          
		//	          
		//		
		//		
		//		driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
		//		


	}

}
