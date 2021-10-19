package org.windowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javafx.scene.input.KeyCode;

public class Amazon {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement m = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions a=new Actions(driver);
		a.contextClick(m).perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);


		String parentTab = driver.getWindowHandle();
		System.out.println(parentTab);

		Set<String> multipleTab = driver.getWindowHandles();
		for (String Tab : multipleTab) {
			driver.switchTo().window(Tab);

		}

		WebElement f = driver.findElement(By.xpath("//a[text()='Fashion']"));
		a.contextClick(f).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		WebElement cs = driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
		a.contextClick(cs).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		driver.switchTo().window(parentTab);

	}
}
