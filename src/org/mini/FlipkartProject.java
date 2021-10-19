package org.mini;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartProject {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		WebElement p = driver.findElement(By.xpath("//input[@type='text']"));
		p.sendKeys("crocs flipflops");
		p.submit();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_24_Dny _3tCU7L']")).click();
		Thread.sleep(3000);
       
		
        driver.findElement(By.xpath("(//div[@class='_24_Dny'])[1]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//div[@class='_24_Dny'])[6]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//div[@class='_24_Dny'])[19]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//div[@class='_24_Dny'])[23]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//img[@class='_2r_T1I'])[1]")).click();
        System.out.println("add to cart");
        
        
//        String currentTab = driver.getWindowHandle();
//        System.out.println(currentTab);
//        
        Set<String> multipleTab = driver.getWindowHandles();
        System.out.println(multipleTab);
        
        
        for (String Tab : multipleTab) {
        	String title = driver.switchTo().window(Tab).getTitle();
        	System.out.println(title);
			Thread.sleep(2000);
		}
        
        
        driver.findElement(By.xpath("//a[text()='9']")).click();
        System.out.println("size");
        Thread.sleep(2000);
        
        WebElement add = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
     add.click();
      System.out.println("ram");
      
      
      Set<String> multipleTab1 = driver.getWindowHandles();
      for (String current : multipleTab1) {
		String title1 = driver.switchTo().window(current).getTitle();
		System.out.println(title1);
		
	}
      
      WebElement pu = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
      pu.sendKeys("600019");
      System.out.println(pu);
      Thread.sleep(2000);
      
     TakesScreenshot tk=(TakesScreenshot)driver;
     
     File src = tk.getScreenshotAs(OutputType.FILE);
     
     File des=new File("C:\\Users\\NIRMAL\\eclipse-workspace\\SeleniumDay01\\ScreenShot\\Filp.png");
     
     FileUtils.copyFile(src, des);
     
     
     
     
		




		
	}

}
