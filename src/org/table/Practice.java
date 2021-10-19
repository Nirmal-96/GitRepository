package org.table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	List<WebElement> tables = driver.findElements(By.tagName("table"));
	System.out.println("table size..."+tables.size()+"\n");
	
    WebElement table = driver.findElement(By.xpath("//table[@border='1']"));
    System.out.println("-----Table Values----"+table.getText()+"\n");
    
    WebElement rows = table.findElement(By.tagName("tr"));
    System.out.println("----Rows size----"+rows.getText()+"\n");
   
    
    List<WebElement> headings = table.findElements(By.tagName("th"));
    for (WebElement head : headings) 
    {
    	System.out.println("----Table Headings----"+head.getText()+"\n");
		
	}
    	
    List<WebElement> datas = table.findElements(By.tagName("td"));
    for (WebElement data : datas) {
    	System.out.println("----Table datas----"+data.getText());
		
	}
    	
			
		}
		
	


}

