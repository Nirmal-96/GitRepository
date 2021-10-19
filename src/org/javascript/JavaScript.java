package org.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) throws InterruptedException {
		//int to long---type conversion or upcasting
				long a=10;
				int b=20;
				a=b;
				
				//long to int---type casting or downcasting
				int c=20;
				long d=40;
				c=(int)d;
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://en-gb.facebook.com/");
		
		//type--casting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//js sendkeys
		WebElement textUsername = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','nirmal')",textUsername);
		
		WebElement passWord = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value', '123456')",passWord);
		Thread.sleep(3000);
		
		//js scroll down
		WebElement fbLogin = driver.findElement(By.xpath("//span[text()=' Facebook © 2021']"));
		js.executeScript("arguments[0].scrollIntoView(true)",fbLogin);
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].scrollIntoView(false)", name);
		Thread.sleep(3000);
		
		
		driver.navigate().to("http://www.greenstechnologys.com/");
		Thread.sleep(3000);
		
		WebElement greens = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
		js.executeScript("arguments[0].scrollIntoView(false)",greens);
		
		
		Object object = js.executeScript("return arguments[0].getAttribute('value')", greens);
		System.out.println(object);
		System.out.println(object.toString());
		String s=(String)object;
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
