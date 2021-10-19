package org.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement multiple = driver.findElement(By.xpath("//select[@name='States']"));
		
		Select s=new Select(multiple);
		
		s.selectByValue("New York");
		s.selectByValue("Texas");
		s.selectByIndex(0);
		s.selectByVisibleText("Pennsylvania");
		
		//s multiple
		boolean m = s.isMultiple();
		System.out.println(m);
		
		//getoptions
		List<WebElement> options = s.getOptions();
		System.out.println("------optionsize----"+options.size());
		
		//print options
		System.out.println("----print all options------");
		for (WebElement eachOption : options) {
			System.out.println(eachOption.getText());
			
		}
		
		//get all selected options
		List<WebElement> options2 = s.getAllSelectedOptions();
		for (WebElement eachOption : options2) {
			System.out.println(eachOption.getText());
			
		}
		
		//get first selected options
		
		WebElement selectedOption = s.getFirstSelectedOption();
		System.out.println(selectedOption.getText());
		
		//deselect option
		s.deselectByIndex(0);
		s.deselectByValue("Texas");
		s.deselectByVisibleText("Pennsylvania");
		Thread.sleep(2000);
		
		s.deselectAll();
		Thread.sleep(2000);
		
		//select all options
		for (int i = 0; i < options.size(); i++) {
			s.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		for (int i = 0; i < options.size(); i++) {
			WebElement eachOption = options.get(i);
			String value = eachOption.getAttribute("value");
			s.selectByValue(value);
			Thread.sleep(2000);
			
		}
		
		for (WebElement eachOption : options2) {
			s.selectByVisibleText(eachOption.getText());
			Thread.sleep(2000);
			
		}
			
		}
		
		
	}

