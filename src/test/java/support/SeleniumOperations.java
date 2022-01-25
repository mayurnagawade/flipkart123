package support;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations 
{
					public static WebDriver driver=null;
					public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
					public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
					{
						
						try {
						String strBrowserName=(String) inputParameters[0];
						String webDriverExePath=(String) inputParameters[1];
						
						if(strBrowserName.equalsIgnoreCase("Chrome"))
						{
							System.setProperty("webdriver.chrome.driver", webDriverExePath);		
							driver=new ChromeDriver();			
							driver.manage().window().maximize();	
						}
						else if(strBrowserName.equalsIgnoreCase("FireFox"))
						{
							System.setProperty("webdriver.gecko.driver", webDriverExePath);		
							 driver=new FirefoxDriver();	
							driver.manage().window().maximize();	
						}
						outputParameters.put("STATUS","PASS");
						outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());
						
						}catch(Exception e)
						{
							outputParameters.put("STATUS","FAIL");
							outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());
						}						
						
						return outputParameters;		
					}	
					
//					public static void OpenBrowser()
//					{
//						System.setProperty("webdriver.chrome.driver", "D:\\Automation Support\\chromedriver.exe");						
//						ChromeDriver driver=new ChromeDriver();						
//						driver.manage().window().maximize();						
//						driver.get("http://primusbank.qedgetech.com//");
//					}
					public static Hashtable<String,Object> openApplication(Object[]inputParameters)
					{
						try {
						String Url=(String) inputParameters[0];
						driver.get(Url);	
						outputParameters.put("STATUS","PASS");
						outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());
						
						}catch(Exception e) {
							outputParameters.put("STATUS","FAIL");
							outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());
						}
						return outputParameters;
					}	
					public static Hashtable<String,Object> ClickOnElement(Object[]inputParameters)
					{
						try {
						String xpath=(String) inputParameters[0];
						driver.findElement(By.xpath(xpath)).click();
						outputParameters.put("STATUS","PASS");
						outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());
						
						}catch(Exception e) {
							outputParameters.put("STATUS","FAIL");
							outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());
						}
						
						return outputParameters;		
					}
					public static Hashtable<String,Object> MoveOnElement(Object[]inputParameters)
					{
						try {
							
						
						String xpath=(String) inputParameters[0];
						Actions act=new Actions(driver);
						WebElement element=driver.findElement(By.xpath(xpath));
						act.moveToElement(element).build().perform();
						outputParameters.put("STATUS","PASS");
						outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());
						
						}catch(Exception e) {
							outputParameters.put("STATUS","FAIL");
							outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());
						}
						
						return outputParameters;		
					}	
					public static Hashtable<String,Object> ClickMyProfile(Object[]inputParameters)
					{
						try 
						{
						String xpath=(String) inputParameters[0];
						driver.findElement(By.xpath(xpath)).click();
						outputParameters.put("STATUS","PASS");
						outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());
						
						}catch(Exception e) {
							outputParameters.put("STATUS","FAIL");
							outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());
						}
						
						return outputParameters;		
					}	
						
					
					public static Hashtable<String,Object> EnterSendKeys(Object[]inputParameters)
					{
						try {
						String Data=(String) inputParameters[0];
						String Value=(String) inputParameters[1];
						driver.findElement(By.xpath(Data)).sendKeys(Value);
						outputParameters.put("STATUS","PASS");
						outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());

						}catch(Exception e) {
							outputParameters.put("STATUS","FAIL");
							outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());
						}
						return outputParameters;		
					
					}	
					public static Hashtable<String,Object> ClickToLogin(Object[]inputParameters)
					{
						try {
						String xpath=(String) inputParameters[0];
						driver.findElement(By.xpath(xpath)).click();
						
						outputParameters.put("STATUS","PASS");
						outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());

						}catch(Exception e) {
							outputParameters.put("STATUS","FAIL");
							outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());
						}
						return outputParameters;	
					}	
					
					public static Hashtable<String,Object> HandleStaticDropDown(Object[]inputParameters)
					{
						try {
						String abc=(String) inputParameters[0];
						String xyz=(String) inputParameters[1];
						driver.findElement(By.xpath(abc)).click();
						Select result=new Select(driver.findElement(By.xpath(abc)));
						result.selectByIndex(1);
						result.selectByValue(xyz);
						outputParameters.put("STATUS","PASS");
						outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());

						}catch(Exception e) {
							outputParameters.put("STATUS","FAIL");
							outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());
						}
						return outputParameters;		
					}
					
					
					
					public static Hashtable<String,Object> GetText(Object[]inputParameters)
					{
						try 
						{
						String xpath=(String) inputParameters[0];
						driver.findElement(By.xpath(xpath)).getText();
						outputParameters.put("STATUS","PASS");
						outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());
						
						}catch(Exception e) {
							outputParameters.put("STATUS","FAIL");
							outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());
						}
						
						return outputParameters;		
					}	
						public static Hashtable<String,Object> validation(Object[]inputParameters)
						{
							String xpath=(String) inputParameters[0];
							String String1=(String) inputParameters[1];
							
							WebElement web=driver.findElement(By.xpath(xpath));
							
							String String2=web.getText();
							try
							{
								if(String1.equalsIgnoreCase(String2))
								{
									System.out.println("Test Case Pass");
								}else
								{
									System.out.println("Test case Fail");
								}
								outputParameters.put("STATUS","PASS");
								outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());

								}catch(Exception e)
								{
									outputParameters.put("STATUS","FAIL");
									outputParameters.put("MESSAGE","Action:Browser Launch,Input Given:"+inputParameters[0].toString());
								}
														
							return outputParameters;
						}
						
}			

