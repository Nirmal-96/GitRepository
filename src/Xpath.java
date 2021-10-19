import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
  public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://www.olx.in/");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("SWIFT CAR",Keys.ENTER);
	
	driver.findElement(By.xpath("(//input[@min='0'])[1]")).sendKeys("250000",Keys.ENTER);
	
	driver.findElement(By.xpath("(//input[@min='0'])[2]")).sendKeys("450000",Keys.ENTER);
	
	driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	
	driver.findElement(By.xpath("(//div[@class='IKo3_'])[7]")).click();

	
}

}

