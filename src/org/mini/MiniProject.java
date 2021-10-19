package org.mini;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MiniProject{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		WebElement s = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		s.sendKeys("nirmal001@gmail.com");
		s.submit();
		
		driver.findElement(By.id("id_gender1")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Nirmal");
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Don");
		
		driver.findElement(By.id("passwd")).sendKeys("0123456");
		
		WebElement day = driver.findElement(By.id("days"));
		day.click();
		Select se=new Select(day);
		se.selectByValue("13");
		
		WebElement month = driver.findElement(By.id("months"));
		month.click();
		Select si=new Select(month);
		si.selectByValue("12");
		
		WebElement year = driver.findElement(By.id("years"));
		year.click();
		Select sy=new Select(year);
		sy.selectByValue("1996");
		
		driver.findElement(By.id("company")).sendKeys("AG METALS");
		
		driver.findElement(By.id("address1")).sendKeys("No.5,ECR MAHABS");
		
		driver.findElement(By.id("city")).sendKeys("CHENNAI");	
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select sx=new Select(state);
		sx.selectByValue("32");
		
		driver.findElement(By.id("postcode")).sendKeys("00000");
		WebElement country = driver.findElement(By.id("id_country"));
		Select sc=new Select(country);
		sc.selectByValue("21");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("0123456989");
		
		driver.findElement(By.id("alias")).sendKeys("No.4 pondy");
		
		driver.findElement(By.id("submitAccount")).click();	
	}

}
