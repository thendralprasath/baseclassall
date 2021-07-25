package org.testng;

import java.io.IOException;
import java.util.Date;

import org.base.ParentBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.Demosqa;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demosqatestng {
	ParentBase p = new ParentBase();
	//WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		/*System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARI\\Desktop\\chromee\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-training/"); */
		p.getDriver("chrome");
		p.launchUrl("https://www.toolsqa.com/selenium-training/");
		
	}

	@BeforeMethod
	public void before() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void tc0() throws IOException, InterruptedException {
		//Thread.sleep(2000);
		Demosqa d = new Demosqa();
		WebElement name = d.getName();
		
		p.typeText(name, p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Baseclasss\\testdata\\Bok1.xls",
				"Sheet2", 0, 1));
		System.out.println(p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Baseclasss\\testdata\\Bok1.xls",
				"Sheet2", 0, 1));
		WebElement email = d.getEmail();
		p.typeText(email, p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Baseclasss\\testdata\\Bok1.xls",
				"Sheet2", 1, 1));
		WebElement mobile = d.getMobile();
		p.typeText(mobile, p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Baseclasss\\testdata\\Bok1.xls",
				"Sheet2", 2, 1));
		WebElement country = d.getCountry();
		p.typeText(country, p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Baseclasss\\testdata\\Bok1.xls",
				"Sheet2", 3, 1));
		WebElement city = d.getCity();
		p.typeText(city, p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Baseclasss\\testdata\\Bok1.xls",
				"Sheet2", 4, 1));
		WebElement msg = d.getMsg();
		p.typeText(msg, p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Baseclasss\\testdata\\Bok1.xls",
				"Sheet2", 5, 1));
	}

	@AfterMethod
	public void after() {

		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass
	public void afterclass() {
		//driver.quit();

	}

}
