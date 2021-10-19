package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("http://demo.guru99.com/test/write-xpath-table.html");	
	
	List<WebElement> table = driver.findElements(By.tagName("table"));
	System.out.println("Table size...."+table.size());
	
	
	WebElement datas = driver.findElement(By.tagName("td"));
	System.out.println("---datas----"+datas.getText());
	
	for (WebElement cells : table) {
		System.out.println("print all cell"+cells.getText());
		
	}
	
	
	}
	
}
