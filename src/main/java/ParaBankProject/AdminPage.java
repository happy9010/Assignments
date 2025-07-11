package ParaBankProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminPage {
 static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	WebElement adminPage=	driver.findElement(By.linkText("Admin Page"));
	adminPage.click();

	}

}
