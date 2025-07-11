package ParaBankProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankWebSite {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	 driver.findElement(By.xpath("//img[@class='logo']"));

	String title= driver.findElement(By.tagName("p")).getText();
	  System.out.println(title);
	  if(title.equals("Experience the difference"))
	  {
		 System.out.println("title is same"); 
	  }
	  else
	  {
		  System.out.println("tittle is different");
	  }
	  
	  driver.findElement(By.linkText("home")).click();
	  driver.findElement(By.linkText("about")).click();
	  driver.findElement(By.linkText("contact")).click();
	  driver.findElement(By.linkText("About Us")).click();
	  driver.findElement(By.linkText("Services")).click();
	  driver.findElement(By.linkText("Products")).click();
	  driver.navigate().back();
	//  driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	  driver.findElement(By.linkText("Locations")).click();
	//  driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	  driver.navigate().back();
	  driver.findElement(By.linkText("Admin Page")).click();
	  driver.findElement(By.name("username")).sendKeys("deolh4129@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("Harpreet90@");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.navigate().back();
	//  driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	  driver.findElement(By.linkText("Forgot login info?")).click();
	  driver.findElement(By.linkText("Register")).click();
	  
	  driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	  driver.findElement(By.linkText("Withdraw Funds")).click();
	  driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	  driver.findElement(By.linkText("Transfer Funds")).click();
	  driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	  driver.findElement(By.linkText("Check Balances")).click();
	  driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	  driver.findElement(By.linkText("Make Deposits")).click();
	  driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	  driver.findElement(By.linkText("Bill Pay")).click();
	  driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	  driver.findElement(By.linkText("Account History")).click();
	  driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	  driver.findElement(By.linkText("Transfer Funds")).click();
	  driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	  // read more 1
	  driver.findElement(By.xpath("//a[@href='services.htm']")).click();
	  
	  driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	  driver.findElement(By.linkText("ParaBank Is Now Re-Opened")).click();
	  driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	  driver.findElement(By.linkText("New! Online Bill Pay")).click();
	  driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	  driver.findElement(By.linkText("New! Online Account Transfers")).click();
	  driver.navigate().back();
	  // read more 2
      driver.findElement(By.xpath("//a[@href='news.htm']")).click();
		                     // footer links 
	  driver.findElement(By.linkText("Home")).click();
	  driver.findElement(By.linkText("About Us")).click();
	  driver.findElement(By.linkText("Services")).click();
	  driver.navigate().back();
	  driver.findElement(By.linkText("Products")).click();
	  driver.navigate().back();
	  driver.findElement(By.linkText("Locations")).click();
	  driver.navigate().back();
	  driver.findElement(By.linkText("Forum")).click();
	  driver.navigate().back();
	  driver.findElement(By.linkText("Site Map")).click();
	  driver.navigate().back();
	  driver.findElement(By.linkText("Contact Us")).click();
	String copyright=  driver.findElement(By.className("copyright")).getText();
	System.out.println(copyright);
	driver.findElement(By.linkText("www.parasoft.com")).click();
	  
	}


	}


