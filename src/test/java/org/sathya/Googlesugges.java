package org.sathya;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlesugges {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();

		 driver.get("http://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("automation");
		 Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		 for(WebElement s: suggestions)
		 {
			 String text = s.getText();
			 System.out.println(text);
		 }
		 
	}
}
