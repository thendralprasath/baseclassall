package org.testng;

import org.testng.annotations.DataProvider;

public class Dprovider1 {
	@DataProvider(name = "test-data")
  	public Object[][] dataProvFunc(){
        	return new Object[][]{
              	{"barbie toys"},{"suit sets"},{"pencils"},{"laptop"}
        	};
  	}
}
