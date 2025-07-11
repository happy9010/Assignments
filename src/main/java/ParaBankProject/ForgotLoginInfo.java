package ParaBankProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotLoginInfo {
     static WebDriver driver;
     
	public static void main(String[] args) 
	{
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		          //Forgot login info? link validation
	
WebElement forgotLoginLink=	driver.findElement(By.linkText("Forgot login info?"));	
Boolean display  =	forgotLoginLink.isDisplayed();
System.out.println(display);
if(display)
{
String forgotLoginText=forgotLoginLink.getText();
System.out.println(forgotLoginText);
//Assert.assertEquals("Forgot login info?", forgotLoginText, "message is correct");
}
else
{
	System.out.println("Forgot login info? link is not displayed");
}
Boolean enabled =  forgotLoginLink.isEnabled();
System.out.println(enabled);
if(enabled)
{
	forgotLoginLink.click();
}
else
{
	System.out.println("Forgot login info? link is disabled");
}

	
	                    //Customer Lookup Form Validations

    driver.navigate().back();
    String headerText = driver.findElement(By.xpath("//h1[@class='title']")).getText();
    System.out.println(headerText); 
    String title  =  driver.findElement(By.xpath("//h1[@class='title']/following-sibling::p")).getText();
    System.out.println(title); 

    
                       //Error Messages Text
    
    driver.findElement(By.xpath("//input[@value='Find My Login Info']")).click();
   List<WebElement> errorList =  driver.findElements(By.xpath("//span[@class='error']"));
  System.out.println("total error messages:"+errorList.size()); 
     for(WebElement e :errorList)
     {
    	System.out.println(e.getText()); 
    	 
     }
                       // First Name
    
   driver.navigate().back();  
     
  WebElement firstName = driver.findElement(By.id("firstName"));
 
  Boolean firstNameDisplayed=  firstName.isDisplayed();
  if(firstNameDisplayed)
  {
 	System.out.println("firstName Textbox is displayed"); 
   }
  else
  {
  	 System.out.println("firstName Textbox is not displayed");  
  }
   Boolean firstNameEnabled= firstName.isEnabled();
   if(firstNameEnabled)
   {	
   firstName.clear();	 
   firstName.sendKeys("Harpreet");
   }
   else
  {
   System.out.println("First name textbox is not enabled");
  }
   
    //Last Name
     WebElement lastName = driver.findElement(By.id("lastName"));
     lastName.sendKeys("kaur");
    
    // Address Street
     WebElement addressStreet=	driver.findElement(By.id("address.street"));
     addressStreet.sendKeys("131 industrial rd");
    // Address City
    WebElement addressCity=	driver.findElement(By.id("address.city"));
    addressCity.sendKeys("bolton");
    // Address State
    WebElement addressState=	driver.findElement(By.id("address.state"));
    addressState.sendKeys("ontario");
	// Address ZipCode
    WebElement zipCode =	driver.findElement(By.id("address.zipCode"));
    zipCode.sendKeys("L6P2Y3");
		
		                            
          // Find My Login Info button validations
		
 WebElement findMyLoginInfo =   driver.findElement(By.xpath("//input[@value='Find My Login Info']"));
    //Question to ask
    String buttonText= findMyLoginInfo.getAttribute("Find My Login Info");
    
    System.out.println(buttonText);
    //is displayed
    //is enabled 
		
	}

}







		
