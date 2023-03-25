package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.ToDoubleBiFunction;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Down;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.io.QuietException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{   
//	one method of browser launch
	public static WebDriver driver;//instant variable and initialize here only
//	//browser launch for one browser
	public static WebDriver launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		return driver;
	}
	//another one method to launch browser 3 browser
	
	public static WebDriver launchbrowser(String browsername) 
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			}
		else if(browsername.equalsIgnoreCase("firebox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser");
	}
		return driver;		
		}
	//3rd method to browser launch
//	//public static WebDriver launchBrowser(String browserName)
//	{
//		switch(browserName)
//		{
//		case("Chrome"):
//			WebDriverManager.chromedriver().setup();
//		    driver=new ChromeDriver();
//		    break;
//		
//		case("Edge"):
//			WebDriverManager.edgedriver().setup();
//		    driver=new EdgeDriver();
//		    break;
//		case("firebox"):
//			WebDriverManager.firefoxdriver().setup();
//		    driver=new FirefoxDriver();
//		    break;
//		    default:
//		    	System.out.println("invalidbrowser");
//		    	break;
//		}
//		return driver;
//	}
	// get url launch
	public static void launchurl(String url) 
	{
		driver.get(url);
		driver.manage().window().maximize();
}
		//wait 1
	public static void implicitytlyWait(long time, TimeUnit seconds)
	{
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
}
		//gettitle 2
	public static String getTile() 
	{
		String text=driver.getTitle();
		return text;
}
	//getText 3
	public static String getText(WebElement t)
	{
		String text=t.getText();
		return text;
	}
	//getCurrenturl 4
	public static String getCurrenturl() 
	{
		String currenturl=driver.getCurrentUrl();
		return currenturl;
	}
		//quit 5
	public static void quit() 
	{
		driver.quit();
	}
	//sendkeys 6
	public static void senkeys(WebElement s,String value) 
	{
	s.sendKeys(value);
	}
		//click 7
	public static void buttonclick(WebElement b)
	{
		b.click();
	}
		//getAttribute 8
	public static String getAttribute(WebElement a) 
	{
		String text=a.getAttribute("value");
		return text;
	}
	//Actions
	//moveToElement 9
	public static void movetoelement(WebElement m) 
	{
		Actions a=new Actions(driver);
		a.moveToElement(m).perform();
}
	//dropAndDrog 10
	public static void drogAndDrop(WebElement src,WebElement des) 
	{ 
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).perform();
		}
	//doubleclick 11
	public static void doubleClick(WebElement d)
	{
		Actions a=new Actions(driver);
		a.doubleClick(d).perform();
	}
	//clickAndHold 12
	public static void clickAndHold(WebElement c) 
	{
		Actions a=new Actions(driver);
		a.clickAndHold(c).perform();
	}
	//contextClick 13
	public static void contextClick(WebElement c)
	{
		Actions a=new Actions(driver);
		a.contextClick(c).perform();
	}
	
				//Alert
				//accept 14
				public static void accept() 
				{
					Alert a=driver.switchTo().alert();
					a.accept();
				}
				//dismiss 15
				public static void dismiss() 
				{
					Alert a=driver.switchTo().alert();
					a.dismiss();
				}
				//DropDown 16
				//selectByValue
				public static void selectByValue(WebElement v,String value)
				{
					Select s=new Select(v);
					s.selectByValue(value);
                }
				//selectByIndex 17
				public static void selectByIndex(WebElement i,int index)
				{
					Select s=new Select(i);
					s.selectByIndex(index);
                }
				//selectByVisibleText 18
				public static void selectByVisibleText(WebElement vt,String text)
				{
					Select s=new Select(vt);
					s.selectByVisibleText(text);
                }
				//getOptions 19
				public static String getOptions(WebElement o,int index)
				{
					Select s=new Select(o);
					List<WebElement> options = s.getOptions();
					WebElement w = options.get(index);
					String text = w.getText();
					return text;
                }
				
				//getFirstSelectedOption 20
				public static void getFirstSelectedOption(WebElement i)
				{
					Select s=new Select(i);
					s.getFirstSelectedOption();
                }
				//isMultiple 21
				public static boolean isMultiple(WebElement m)
				{
					Select s=new Select(m);
					boolean multiple= s.isMultiple();
					return multiple;
					
                }
				//deSelectByIndex 22
				public static void deSelectByIndex(WebElement i,int index)
				{
					Select s=new Select(i);
					s.deselectByIndex(index);
                }
				//deselectByvalue 23
				public static void deselectByvalue(WebElement i,String value)
				{
					Select s=new Select(i);
					s.deselectByValue(value);
                }
				//deselectByVisibleText 24
				public static void deselectByVisibleText(WebElement i,String value)
				{
					Select s=new Select(i);
					s.deselectByVisibleText(value);
                }
				//deSelectAll 25
				//select all options then we are go to deselectall
				public static void deSelectAll(WebElement a,int index)
				{
					Select s=new Select(a);
					List<WebElement> op = s.getOptions();
					for(int i=0;i<op.size();i++)
					{
						s.selectByIndex(i);
					}
					s.deselectAll();
                }
				//isDisplayed 26
				public static boolean isDisplayed(WebElement d) 
				{
					boolean displayed = d.isDisplayed();
					return displayed;
                    
				}
				//isSelected 27
				public static boolean isSelected(WebElement s) 
				{
					boolean selected = s.isSelected();
					return selected;				
				  
				}
				//isEnabled 28
				public static boolean isEnabled(WebElement e)
				{
					boolean enabled = e.isEnabled();
					return enabled;
				}
				//windowHandle 29
				//get one  window id
				public static String windowHandle() 
				{
                  String parentid = driver.getWindowHandle();
				  return parentid;
                }
				//windowHandles 30
				//get many windows id.using set concept,set dont allow duplicate value
				//convert set to list
				public static void windowHandles(int index)
				{
					Set<String> e1 = driver.getWindowHandles();
					List<String> list = new ArrayList<String>();
					list.addAll(e1);
					driver.switchTo().window(list.get(index));	
				}
				//findElement 31
				public static WebElement findElement(String locatorname,String locatorvalue) 
				{
					WebElement value=null;
					if(locatorname.equals("id"))
					{
						 value = driver.findElement(By.id(locatorvalue));
					}
					else if(locatorname.equals("name"))
					{
						value = driver.findElement(By.name(locatorvalue));
					}
					else if(locatorname.equals("xpath"))
					{
						value = driver.findElement(By.xpath(locatorvalue));
					}
					return value;
                   }
				//navigation
				//TO 32
				public static void navigationto(String url)
				{
					driver.navigate().to(url);
            	}
				//back 33
				public static void navigationback() 
				{
					driver.navigate().back();

				}
               //forward 34
				public static void navigationforward()
				{
					driver.navigate().forward();

				}
				//refresh 35
				public static void navigationrefresh()
				{
					driver.navigate().refresh();
				}
				public static void implicitlyWait(int i) {
					driver.manage().timeouts().implicitlyWait(i, null);
				}
				public static WebDriver WebDriverManager()
				{
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
					return driver;
				}
public static String excelData(String excelName,String SheetName,int rowNo,int cellNo) throws IOException
{
	File loc = new File("C:\\Users\\Administrator\\eclipse-workspace\\MavenProjectNew\\src\\test\\resources\\"+excelName+".xlsx");
	FileInputStream fi = new FileInputStream(loc);
	Workbook w = new XSSFWorkbook(fi);
	Sheet s = w.getSheet(SheetName);
	Row r = s.getRow(rowNo);
	Cell c = r.getCell(cellNo);
	int type = c.getCellType();
	String value=null;
	if(type==1)
	{
		value = c.getStringCellValue();
	}
	else
	{
		if(DateUtil.isCellDateFormatted(c))
		{
			  value = new SimpleDateFormat("dd_mm_yyyy").format(c.getDateCellValue());
		}
		else
		{
			  value = String.valueOf((long)c.getNumericCellValue());
		}

		}
	return value;
}

}
				



				

				

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		

	
		
		
		
		
	
	
	
	



