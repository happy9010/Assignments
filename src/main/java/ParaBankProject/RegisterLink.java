package ParaBankProject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterLink {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		                  //Register link validation

		WebElement RegisterLink =	driver.findElement(By.linkText("Register"))	;
		Boolean displayRegisterLink=	RegisterLink.isDisplayed();
		System.out.println(displayRegisterLink);
		if(displayRegisterLink)
		{
		String registerLinkText= RegisterLink.getText();
		System.out.println(registerLinkText);
		//Assert.assertEquals("Forgot login info?", registerLinkText, "message is correct");
		}
		else
		{
			System.out.println("Register link is not displayed");
		}
		Boolean RegisterLinkEnabled =  RegisterLink.isEnabled();
		System.out.println(RegisterLinkEnabled);
		if(RegisterLinkEnabled)
		{
			RegisterLink.click();
		}
		else
		{
			System.out.println("Register link is disabled");
		}
			
		                     // Errors Messages 
	//	driver.navigate().back();
		
		WebElement registerButton = driver.findElement(By.xpath("//input[@value='Register']"));
		
		registerButton.click();
		Thread.sleep(2000);
		ArrayList <String>list = new ArrayList<String>();
	List<WebElement> errorList=	driver.findElements(By.xpath("//span[@class='error']"));
	System.out.println("total number of error messages:" +errorList.size());	
	for (WebElement e: errorList)
	{
		String text = e.getText();
		list.add(text);
	}
		System.out.println(list);
		                          // Register Form 
		
		
		driver.navigate().back();
		By firstName = By.id("customer.firstName");
		By lastName=  By.id("customer.lastName");
		By address = By.id("customer.address.street")	;
		By city = By.id("customer.address.city");
		By state  = By.id("customer.address.state");
		By zipCode = By.id("customer.address.zipCode");
		By phone = By.id("customer.phoneNumber");
		By ssn = By.id("customer.ssn");
		By userName = By.id("customer.username");
		By password = By.id("customer.password");
		By confirm = By.id("repeatedPassword");
		getElement(firstName).sendKeys("Harpreet");
		getElement(lastName).sendKeys("kaur");
		getElement(address).sendKeys("123 lake shore rd");
		getElement(city).sendKeys("london");
		getElement(state).sendKeys("on");
		getElement(zipCode).sendKeys("we4556");
		getElement(phone).sendKeys("9052266034");
		getElement(ssn).sendKeys("14235");
		getElement(userName).sendKeys("sososo");
		getElement(password).sendKeys("12345bchdjdjf=");
		getElement(confirm).sendKeys("12345bchdjdjf=");
		}
	
	
	public static WebElement getElement(By locator )
	{
		return driver.findElement(locator);
	}
	
	

}
