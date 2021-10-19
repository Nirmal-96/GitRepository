package org.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	    driver.get("https://en-gb.facebook.com/");
	    
	 WebElement drop = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	 drop.click();
	 
	 WebElement day = driver.findElement(By.id("day"));
	 day.click();
	 Select s=new Select(day);
	 s.selectByValue("13");
	 
	 WebElement month = driver.findElement(By.id("month"));
	 Select s1=new Select(month);
	  s1.selectByValue("12");
	 
	 
	 WebElement yr = driver.findElement(By.id("year"));
	 Select s2=new Select(yr);
	 s2.selectByValue("1996");
	 
	 boolean mt = s1.isMultiple();
	 System.out.println(mt);
	 
	 //get all options
	 List<WebElement> options = s1.getOptions();
	 System.out.println("options size....."+options.size());
	 
	 //print all options
	 System.out.println("----Normal for loop----");
	 for (int i = 0; i < options.size(); i++) {
		 WebElement eachOption = options.get(i);
		 String text = eachOption.getText();
		 System.out.println(text);
		 
		
	}
	 
	 
	 
	 driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	 
	 
	 
	 
	    
	}

}
