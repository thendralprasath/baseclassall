package org.base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ParentBase {
	
	public static WebDriver driver;
	public void getDriver(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ARI\\Desktop\\chromee\\chromedriver.exe");
			       driver = new ChromeDriver();
			}else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\ARI\\Desktop\\chromee\\geckodriver.exe");
			       driver = new FirefoxDriver();
			}
			else if (browsername.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver","C:\\Users\\ARI\\Desktop\\chromee\\IEDriverServer.exe");
			       driver = new InternetExplorerDriver();
			}else {
				System.out.println("invalid browser");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void typeText(WebElement ele,String data) {
		try {
			ele.sendKeys(data);
			
		} catch (Exception e) {
			System.out.println(e);
		}
     }
	public void launchUrl(String url) {
		try {
			driver.get(url);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	public void btnclick(WebElement ele) {
		try {
			ele.click();
			
		} catch (Exception e) {
		System.out.println(e);
		}

	}
	public WebElement findBy(String locator,String ele) {
		
		WebElement findele=null;
		try {
			if (locator.equalsIgnoreCase("id")) {
				findele = driver.findElement(By.id(ele));
				
			} else if (locator.equalsIgnoreCase("xpath")) {
				findele =driver.findElement(By.xpath(ele));
			
			}else if (locator.equalsIgnoreCase("linkText")) {
				findele =driver.findElement(By.linkText(ele));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
       return findele;
	}
	
	
	public void mouseover(WebElement ele) {
		try {
			Actions a=new Actions(driver);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public void selectByDropDown(WebElement ele,String find,String data) {
		try {
			Select s=new Select(ele);
			if (find.equalsIgnoreCase("value")) {
				s.selectByValue(data);
				
			} else if (find.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(data));
				
			}else if (find.equalsIgnoreCase("visibletext")) {
				s.selectByVisibleText(data);
		}
			} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public void selectAllDropDownOptions(WebElement ele) {
		try {
			Select s=new Select(ele);
			List<WebElement> options = s.getOptions();
			for (int i = 0; i < options.size(); i++) {
			WebElement x = options.get(i);	
			String text = x.getText();
			s.selectByVisibleText(text);
			}
			
			
			} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	
	public void selectFirstOptionDropDown(WebElement ele ) {
		
		try {
			Select s=new Select(ele);
			 s.getFirstSelectedOption(); 
		
			} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public void printFirstOptionDropDown(WebElement ele ) {
		try {
			Select s=new Select(ele);
			WebElement op = s.getFirstSelectedOption(); 
			System.out.println(op.getText());
		
			} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public void printAllOptionsDropDown(WebElement ele ,List<WebElement> list) {
		try {
			Select s=new Select(ele);
			 list = s.getOptions();
			for (int i = 0; i < list.size(); i++) {
			WebElement x = list.get(i);	
			String text = x.getText();
			System.out.println(text);
			}
			
			
			} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public void printOnlySelectedOptionsDropDown(WebElement ele ,List<WebElement> list) {
		try {
			Select s=new Select(ele);
			 list = s.getAllSelectedOptions();
			for (int i = 0; i < list.size(); i++) {
			WebElement x = list.get(i);	
			String text = x.getText();
			System.out.println(text);
			}
			
			
			} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	
	
	
	
	
	public void printText(String xpathExpression) {
		try {
			
			String text = driver.findElement(By.xpath("xpathExpression")).getText();
			System.out.println(text);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	
	
	public String getAttributeValue(WebElement ele,String data) {
		String attribute = null;
		try {
			 attribute = ele.getAttribute(data);
			System.out.println(attribute);
			
		} catch (Exception e) { 
			System.out.println(e);
		}
		return attribute;
	}
	
	public void dragAndDrop(WebElement target,WebElement source) {
		try {
			Actions a=new Actions(driver);
			a.dragAndDrop(source, target).build().perform();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public void rightClick(WebElement ele) {
		try {
			Actions a=new Actions(driver);
			a.moveToElement(ele).build().perform();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public void doubleClick(WebElement ele) {
		try {
			Actions a=new Actions(driver);
			a.moveToElement(ele).build().perform();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void highLight(String where,String n) {
		try {
			Robot r =new Robot();
			if(where.equalsIgnoreCase("up")) {
				for(int i=0;i<=Integer.parseInt(n);i++)
				{
			    r.keyPress(KeyEvent.VK_UP);
			    r.keyRelease(KeyEvent.VK_UP);
			    }
			}else if(where.equalsIgnoreCase("down")) {
				for(int i=0;i<=Integer.parseInt(n);i++)
				{
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void cut() {
		try {
			Robot r =new Robot();
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_X);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_X);
				
				}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void copy() {
		try {
			Robot r =new Robot();
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
				
				}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void paste() {
		try {
			Robot r =new Robot();
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
				
				}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void enter() {
		try {
			Robot r =new Robot();
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
				
				}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void switchToAlert(String action) {
		try {
			Alert a =driver.switchTo().alert();
			if(action.equalsIgnoreCase("ok")) {
				a.accept();
			}else if(action.equalsIgnoreCase("cancel")) {
				a.dismiss();
			}else if(action.equalsIgnoreCase("send")) {
				a.sendKeys("thendral");
				a.accept();
			}
				
				}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void jsSetAttribute(WebElement ele,int n) {
		try {
			JavascriptExecutor jk=(JavascriptExecutor)driver;
			jk.executeScript("arguments[0].setAttribute('value','thendral@gmail.com')", ele);
			
				
				}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public String jsGetAttribute(WebElement ele,int n) {
		String text=null;
		try {
			JavascriptExecutor jk=(JavascriptExecutor)driver;
			Object obj=jk.executeScript("return arguments[0].getAttribute('value')", ele);
			 text=(String)obj;
				
				}catch (Exception e) {
			System.out.println(e);
		}
	return text;
	}
	
	public void jsBtnClick(WebElement ele) {
	
		try {
			JavascriptExecutor jk=(JavascriptExecutor)driver;
			Object obj=jk.executeScript("arguments[0].click()", ele);
		
				
				}catch (Exception e) {
			System.out.println(e);
		}
	
	}
	
	
	public String getText(WebElement ele) {
		String text=null;
		try {
			text = ele.getText();
			
		
				
				}catch (Exception e) {
			System.out.println(e);
		}
	return text;
	}
	
	public void scroll(WebElement ele,String where) {
		
		try {
			JavascriptExecutor jk=(JavascriptExecutor)driver;
			if(where.equalsIgnoreCase("down")) {
			jk.executeScript("arguments[0].scrollIntoView(true)", ele);
			}else if(where.equalsIgnoreCase("up")) {
				jk.executeScript("arguments[0].scrollIntoView(false)", ele);
				}
			}catch (Exception e) {
			System.out.println(e);
		}
	
	}
	
	
	public  void screenshot(String name) throws IOException {
		try {
			TakesScreenshot tk=(TakesScreenshot)driver;
		
		   File src=tk.getScreenshotAs(OutputType.FILE);
		   File desc=new File("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\screenshot"+name+".png");
		   FileUtils.copyFile(src, desc);
	    }catch (Exception e) {
		System.out.println(e);
	}
	}
	
	public String getDataFromExcel(String pathName,String sheetname,int rowNo,int cellNo) {
		String Val=null;
		try {
			 File file= new File(pathName);
		      FileInputStream f1=new FileInputStream(file);
		      Workbook book= new HSSFWorkbook(f1);
		      Sheet sheet = book.getSheet(sheetname);
		      Row row = sheet.getRow(rowNo);
		      Cell cell = row.getCell(cellNo);
		      int cellType = cell.getCellType();
		     
		      if(cellType==1) {
		    	  Val = cell.getStringCellValue();
		    	  
		      } else if (DateUtil.isCellDateFormatted(cell)) {
		    	Date dateCellValue = cell.getDateCellValue();	  
				SimpleDateFormat s= new	SimpleDateFormat("dd-MM-yyyy");
				Val = s.format(dateCellValue);
				
			}else {
					double numericCellValue = cell.getNumericCellValue();
					long l=(long) numericCellValue ;
				    Val = String.valueOf(l);
				}
		      
		      
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
      return Val;
	}
	
	public void writeDataToExcel(String pathName,String sheetname,int rowNo,int cellNo,String text) {
		try {
			File file= new File(pathName);
		      FileInputStream f1=new FileInputStream(file);
		      Workbook book= new HSSFWorkbook(f1);
		      Sheet sheet = book.getSheet(sheetname);
		      Row row = sheet.createRow(rowNo);
		      Cell cell = row.createCell(cellNo);
		      cell.setCellValue(text);
		      f1.close();
			   FileOutputStream fo=new FileOutputStream(file);
			   book.write(fo);
			   fo.close();
				
				}catch (Exception e) {
			System.out.println(e);
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}








