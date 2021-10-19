package org.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://www.greenstechnologys.com/");
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		
		File scr = tk.getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\NIRMAL\\eclipse-workspace\\SeleniumDay01\\ScreenShot\\zom.png");
		
		FileUtils.copyFile(scr, des);
		
		System.out.println("completed");
	}

}
