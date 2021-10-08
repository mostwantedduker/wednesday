package org.sample6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	 static int id = 10;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO PC\\eclipse-workspace\\sample6\\driver");
	WebDriver driver = new ChromeDriver();
	
	driver.get(" https://www.swiggy.com");
	WebElement txtlocation = driver.findElement(By.id("Location"));
	txtlocation.sendKeys("Madipakkam");
    driver.quit();
    System.out.println(id);
   
    
    
    
   
}
}
