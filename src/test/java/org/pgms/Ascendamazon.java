package org.pgms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ascendamazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
          driver.get("https://www.amazon.in/");
          driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
          driver.findElement(By.id("nav-search-submit-button")).click();
          List<WebElement> list_of_products  = driver.findElements(By.className("//span[@class='a-size-medium a-color-base a-text-normal']"));
          List<WebElement> list_of_products_price  = driver.findElements(By.className("a-price-whole"));
            
        String product_name;
  		String product_price;
  		int int_product_price;
  		HashMap<Integer, String> map_final_products = new HashMap<Integer,String>();
  		for(int i=0;i<list_of_products.size();i++) {
  			product_name = list_of_products.get(i).getText();//Iterate and fetch product name
  			product_price = list_of_products_price.get(i).getText();//Iterate and fetch product price
  			product_price = product_price.replaceAll("[^0-9]", "");//Replace anything wil space other than numbers
  			int_product_price = Integer.parseInt(product_price);//Convert to Integer
  			map_final_products.put(int_product_price,product_name);//Add product and price in HashMap
  		}
		
  	//One way is to fetch all values of the hashMap and then save it in the ArrayList
  			//Then using Collections class in java, sort it. this we can easily get highest and lowest
  			
  			//Get all the keys from Hash Map
  		Set<Integer> allkeys = map_final_products.keySet();
		ArrayList<Integer> array_list_values_product_prices = new ArrayList<Integer>(allkeys);
		
		//Sort the Prices in Array List using Collections class
				//this will sort in ascending order lowest at the top and highest at the bottom
		
		Collections.sort(array_list_values_product_prices);
		System.out.println(array_list_values_product_prices);
  		
		//Get List of All values from Hash Map. Right now we do not need it so commenting
				Collection<String> allValues = map_final_products.values();
				ArrayList<String> array_list_values_product_names = new ArrayList<String>(allValues);
				
  		
  		
	}
	

}
