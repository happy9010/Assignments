package FisProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	static WebDriver driver;
	
	
	
	public static void main(String[] args) {
	
    driver  = new ChromeDriver();
    driver.get("https://careers.fisglobal.com/us/en/home");
    driver.findElement(By.xpath("//img[@alt='header logo']")).click();
    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("software");
	}

}
