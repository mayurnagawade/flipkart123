package support;



	import org.openqa.selenium.chrome.ChromeDriver;

	public class Temp
	{

		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\Desktop\\Automation support\\chromedriver.exe");		
			ChromeDriver driver=new ChromeDriver();	
			driver.manage().window().maximize();		
			driver.get("http://flipkart.com/");
			
			driver.findElementByXPath("//input[@class='_2IX_2- VJZDxU']").sendKeys("9011665366");
			
			driver.findElementByXPath("//input[@type='password']").sendKeys("mayur123");
			
			driver.findElementByXPath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();
			
			driver.findElementByXPath("//*[@class='_2KpZ6l _2HKlqd _3NgS1a']").click();
			
		
		
		}

	


	}





