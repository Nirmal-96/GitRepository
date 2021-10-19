package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/html/html_tables.asp");	

List<WebElement> tables = driver.findElements(By.tagName("table"));
System.out.println("print size...."+tables.size());

WebElement table1 = driver.findElement(By.id("customers"));

String text = table1.getText();
System.out.println(text);

//all headinds
List<WebElement> tableHeads = table1.findElements(By.tagName("th"));
for (WebElement eachHeads : tableHeads) {
	System.out.println(eachHeads.getText());
	
	
	//all rows
	List<WebElement> tableRows = table1.findElements(By.tagName("tr"));
	for (WebElement eachRow : tableRows) {
		System.out.println(eachRow.getText());
		}

	//all datas
	List<WebElement> datas = table1.findElements(By.tagName("td"));
	for (WebElement eachdatas : datas) {
		System.out.println(eachdatas.getText());
		
	}
	
	
}

}
}