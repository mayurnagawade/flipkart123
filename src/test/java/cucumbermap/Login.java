package cucumbermap;
import java.util.Hashtable;

import cucumber.api.java.en.*;
import support.HTMLReportGenerator;
import support.SeleniumOperations;
public class Login
{
	@Given("^user open \"([^\"]*)\" browser with exe \"([^\"]*)\"$")
	public void user_open_browser_with_exe(String bname,String exe) 
	{
		Object [] input=new Object[2];
		input[0]=bname;
		input[1]=exe;
		SeleniumOperations.browserLaunch(input);
	}
	@Given("^user open url as \"([^\"]*)\"$")
	public void user_open_url_as(String url) throws Throwable 
	{
		Object [] input1=new Object[1];
		input1[0]=url;
		SeleniumOperations.openApplication(input1);
		Thread.sleep(3000);
	}
	@When("^user click on cancle button$")
	public void user_click_on_cancle_button() throws Throwable
	{
		Object[] input2= new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
			
		Hashtable<String,Object> input4op=SeleniumOperations.ClickOnElement(input2);
		HTMLReportGenerator.StepDetails(input4op.get("STATUS").toString(),"user click on cancle button", input4op.get("MESSAGE").toString());
	}
	@When("^user move on Login DropDown$")
	public void user_move_on_Login_DropDown() throws Throwable 
	{
		Object [] input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		
		Hashtable<String,Object> input5op=SeleniumOperations.MoveOnElement(input3);
		HTMLReportGenerator.StepDetails(input5op.get("STATUS").toString(),"user move on Login DropDown", input5op.get("MESSAGE").toString());
	}
	@When("^user click on my profile$")
	public void user_click_on_my_profile() throws Throwable
	{
		Object[] input4=new Object[1];
		input4[0]="(//*[@class='_3vhnxf'])[1]";
			
		Thread.sleep(3000);	
		Hashtable<String,Object> input5op=SeleniumOperations.ClickMyProfile(input4);
		HTMLReportGenerator.StepDetails(input5op.get("STATUS").toString(),"user click on my profile", input5op.get("MESSAGE").toString());
	    
	}


	
	@When ("^user enter (.*) as username$")
	public void user_enter_as_username(String uname) throws Throwable
	{
		Object [] input5=new Object[2];
		input5[0]="(//*[@autocomplete='off'])[2]";
		input5[1]=uname;
		Thread.sleep(2000);	
		Hashtable<String,Object> input2op=SeleniumOperations.EnterSendKeys(input5);
		HTMLReportGenerator.StepDetails(input2op.get("STATUS").toString(),"user enter \"([^\"]*)\" as username", input2op.get("MESSAGE").toString());
	    
	}

	@When ("^user enter (.*) as password$")
	public void user_enter_as_password(String pwd) throws Throwable 
	{
		Object[] input6=new Object[2];
		input6[0]="//input[@type='password']";
		input6[1]=pwd;
				
		Thread.sleep(2000);	
		Hashtable<String,Object> input3op=SeleniumOperations.EnterSendKeys(input6);
		HTMLReportGenerator.StepDetails(input3op.get("STATUS").toString(),"user enter \"([^\"]*)\" as password", input3op.get("MESSAGE").toString());
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable
	{
		Object[] input7= new Object[1];
		input7[0]="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']";		
		
		Hashtable<String,Object> input6op=SeleniumOperations.ClickToLogin(input7);
		HTMLReportGenerator.StepDetails(input6op.get("STATUS").toString(),"user click on login button", input6op.get("MESSAGE").toString());
		
	}
	
	@Then("^application shows user profile to user$")
	public void application_shows_user_profile_to_user() throws Throwable
	{
		Object[] input8=new Object[1];
		input8[0]="//*[@class='_1mHr1S']";
	
			
		Thread.sleep(2000);	
		Hashtable<String,Object> input7op=SeleniumOperations.GetText(input8);
		HTMLReportGenerator.StepDetails(input7op.get("STATUS").toString(),"application shows user profile to user", input7op.get("MESSAGE").toString());
	}


	public static void main(String[] args) 	
	{





	}

}	