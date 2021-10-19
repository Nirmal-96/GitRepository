package org.mini;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MiniProject2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		driver.findElement(By.id("email")).sendKeys("nirmal001@gmail.com");
		
		driver.findElement(By.id("passwd")).sendKeys("0123456");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		WebElement women = driver.findElement(By.xpath("(//a[@title='Women'])"));
		Actions a=new Actions(driver);
		a.moveToElement(women).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[1]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		
		WebElement m = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		a.moveToElement(m).perform();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement g = driver.findElement(By.xpath("//a[@title='Add to cart']"));
		a.click(g).perform();
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		 WebElement tick = driver.findElement(By.id("uniform-cgv"));
         tick.click();
         Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[@class='cheque']")).click();
	    Thread.sleep(2000);
	    
	    WebElement c = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	    c.click();
	    Thread.sleep(2000);
	    
	    
	    driver.get("http://automationpractice.com/index.php?controller=order-confirmation&id_cart=3739700&id_module=30&id_order=359410&key=b80416a1ad0055f4b727607f72c8a0e3");
	    TakesScreenshot tk=(TakesScreenshot)driver;
	    File src = tk.getScreenshotAs(OutputType.FILE);
	    File des=new File("C:\\Users\\NIRMAL\\eclipse-workspace\\SeleniumDay01\\ScreenShot\\MiniProject.png");
	    
	    FileUtils.copyFile(src, des);
	     System.out.println("done");	
	}

}
