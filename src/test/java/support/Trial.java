package support;

public class Trial 

{

	public static void main(String[]args) throws Throwable
	{
		
		//Browser Launch
		Object [] input=new Object[2];
		         input[0]="Chrome";
		         input[1]="C:\\Users\\mayur\\Desktop\\Automation support\\chromedriver.exe";
	        SeleniumOperations.browserLaunch(input);
		         
		//Open Application
		Object [] input1=new Object[1];
		         input1[0]="https://www.flipkart.com/";
		         SeleniumOperations.openApplication(input1);
		//Click on Cancel
		Object [] input2=new Object[1];
		         input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		         SeleniumOperations.clickOnElement(input2);
		//moveToElement
		Object [] input3=new Object[1];
		         input3[0]="//*[@class='_1_3w1N']";
		         SeleniumOperations.moveOnElement(input3);
		//Click on My Profile
		Object [] input4=new Object[1];
		         input4[0]="//*[@class='_3vhnxf'][1]";
		         SeleniumOperations.clickOnElement(input4);
		//Enter User name
		Object [] input5=new Object[2];
		          input5[0]="//*[@class='_2IX_2- VJZDxU']";
		          input5[1]="9011665366";
		          SeleniumOperations.EnterData(input5);
		//Enter Passsword
		          Object [] input6=new Object[2];
		          input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		          input6[1]="mayur123";
		          SeleniumOperations.EnterData(input6);
		//Click on Login button
		Object [] input7=new Object[1];
		          input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		          SeleniumOperations.clickOnElement(input7);
	}

	
	
}
