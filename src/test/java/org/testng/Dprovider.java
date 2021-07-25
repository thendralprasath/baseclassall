package org.testng;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dprovider {
WebDriver driver;
  	
  	@DataProvider(name = "test-data")
  	public Object[][] dataProvFunc(){
        	return new Object[][]{
              	{"barbie toys"},{"suit sets"},{"pencils"},{"laptop"}
        	};
  	}
  	
  	@BeforeMethod
  	  public void setUp() {
        	 
        	  System.out.println("Start test");
        	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARI\\Desktop\\chromee\\chromedriver.exe");
        	  driver = new ChromeDriver();
        	  String url = "https://www.amazon.in/";
        	  driver.get(url);
        	  driver.manage().window().maximize();
        	 
  	  }
  	//Passing the dataProvider to the test method through @Test annotation
  	@Test(dataProvider ="test-data")
  	public void search(String keyWord){
        	WebElement txtBox = driver.findElement(By.id("twotabsearchtextbox"));
        	  txtBox.sendKeys(keyWord);
        	  driver.findElement(By.id("nav-search-submit-button")).click();
  	}
        	 
  	
  	@AfterMethod
  	public void burnDown(){
        	driver.quit();
  	}
 

}
