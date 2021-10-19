package org.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement single = driver.findElement(By.xpath("//select[@class='form-control']"));
		
		Select s=new Select(single);
		//by index
		s.selectByValue("Wednesday");
			
		//ismultiple
		boolean m = s.isMultiple();
		System.out.println(m);
		
		//get all options
		System.out.println("------Get all Options");
		List<WebElement> option = s.getOptions();
		System.out.println("----optionsize----"+option.size());
		
		//print all options
		for (int i = 0; i < option.size(); i++) {
			WebElement eachOption = option.get(i);
			System.out.println(eachOption.getText());
			}
		
		for (WebElement eachOption : option) {
			System.out.println(eachOption.getText());
			
		}
	
		
		
		
	}

}
