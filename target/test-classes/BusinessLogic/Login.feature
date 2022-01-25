Feature: Login Functionality

Background: User is successfully logged in
Given user open "Chrome" browser with exe "C:\\Users\\mayur\\Desktop\\Automation support\\chromedriver.exe"
Given user open url as "https://www.flipkart.com/"

@SmokeTest
Scenario Outline: Login functionality with valid creditationals
When user click on cancle button
When user move on Login DropDown
When user click on my profile
When user enter <username> as username
When user enter <password> as password
When user click on login button
Then application shows user profile to user

Examples:
             |username|password|
             |9011665366|mayur123|
             |9011665367|mayur1234|
             |9011665368|mayur12345|
             
             
             
             
             
             