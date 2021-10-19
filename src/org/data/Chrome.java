package org.data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	
public static void main(String[] args) {
			
System.setProperty("webdriver.chrome.driver", "C:\\Users\\NIRMAL\\eclipse-workspace\\SeleniumDay01\\driver\\chromedriver.exe");
			
WebDriver driver=new ChromeDriver();
			
          //GreensTechnology
            driver.get("http://www.trainingintambaram.net/selenium-training-in-chennai/");
			
			String title = driver.getTitle();
			System.out.println(title);
			
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			
			driver.quit();
			
			
			//Gmail
			System.setProperty("webdiver.chrome.driver", "C:\\Users\\NIRMAL\\eclipse-workspace\\SeleniumDay01\\driver\\chromedriver.exe");
			
			WebDriver d=new ChromeDriver();
			
			d.get("http://gmail.com/");
			
			System.out.println(d.getTitle());
			
			System.out.println(d.getCurrentUrl());
			
			d.quit();
			
			//Youtube
			WebDriver c=new ChromeDriver();
			
			c.get("https://www.youtube.com/");
			
			System.out.println(c.getTitle());
			
			System.out.println(c.getCurrentUrl());
			
			c.navigate().to("https://www.amazon.in");
			c.navigate().back();
			c.navigate().forward();
			c.close();
			
			
			
		}
		
		

}
