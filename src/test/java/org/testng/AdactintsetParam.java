package org.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactintsetParam {
	
	 WebDriver driver;
	
	 @BeforeClass
		public void launchBrowser() {
			System.out.println("launching chrome browser");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARI\\Desktop\\chromee\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://adactinhotelapp.com/");
	 }
	 
	 @BeforeMethod
		public void before() {
			Date d=new Date();
			System.out.println(d);
	 }
	 
	 @Parameters({ "uname", "pass"})
	 @Test
     public void tc0(String s1,String s2) {
		 WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
	     username.sendKeys(s1);
	     WebElement passwrd= driver.findElement(By.id("password"));
	     passwrd.sendKeys(s2);
	     WebElement login= driver.findElement(By.id("login"));
	     login.click();
	   }
	 
	 
	 @Parameters({ "loc", "hot","rtype","rno","din","dout","adult","child"})
	 @Test
	 private void tc1(int loc,String hot,String rtype,String rno,String din,String dout,String adult,String child) {
		  WebElement dd=driver.findElement(By.id("location"));
	       Select s =new Select(dd);
	       s.selectByIndex(loc);
	       
	       WebElement dd1=driver.findElement(By.id("hotels"));
	       Select s1 =new Select(dd1);
	       s1.selectByValue(hot);
	       Assert.assertEquals(dd1.getAttribute("value"), "Hotel Creek");
	      
	       WebElement dd2=driver.findElement(By.id("room_type"));
	       Select s2 =new Select(dd2);
	       s2.selectByVisibleText(rtype);
	       
	       WebElement dd3=driver.findElement(By.id("room_nos"));
	       Select s3 =new Select(dd3);
	       s3.selectByValue(rno);
	       
	       
	       WebElement dd4=driver.findElement(By.id("datepick_in"));
	       dd4.sendKeys(din);
	       
	       WebElement dd5=driver.findElement(By.id("datepick_out"));
	       dd5.sendKeys(dout);
	       
	       WebElement dd6=driver.findElement(By.id("adult_room"));
	       Select s6 =new Select(dd6);
	       s6.selectByValue(adult);
	       
	       WebElement dd7=driver.findElement(By.id("child_room"));
	       Select s7 =new Select(dd7);
	       s7.selectByValue(child);
	       
	       WebElement submit=driver.findElement(By.id("Submit"));
	       submit.click(); 
	       
		

	}
	 
	 
	 
	 @AfterMethod
		public void after() {
			
			Date d=new Date();
			System.out.println(d);
		}
		
		@AfterClass
		public  void afterclass() {
			driver.quit();

		} 
	 
	 
}
