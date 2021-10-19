package org.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class Task {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("http://greenstech.in/selenium-course-content.html\r\n");
		Thread.sleep(2000);
		
		WebElement sclDwn = driver.findElement(By.id("heading304"));
		js.executeScript("arguments[0].scrollIntoView(true)",sclDwn);
		
		
		
		WebElement up = driver.findElement(By.id("contact-tab"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);
		
		
	}
}
