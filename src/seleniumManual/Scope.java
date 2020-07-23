package seleniumManual;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//Sabrusutra//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
//1 Search all links		
		System.out.println(driver.findElements(By.tagName("a")).size());
//2 Search all links from foot
		WebElement footedriverr=driver.findElement(By.id("gf-BIG"));
		System.out.println(footedriverr.findElements(By.tagName("a")).size());
//3 Search all links first colonm 	
		WebElement colomDriver=footedriverr=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(colomDriver.findElements(By.tagName("a")).size());
//4	Open difference links
		for(int i=1;i<colomDriver.findElements(By.tagName("a")).size();i++) 
		
		{
		
			String clickLinkTab=Keys.chord(Keys.COMMAND,Keys.ENTER);
			colomDriver.findElements(By.tagName("a")).get(i).sendKeys(clickLinkTab);
			Thread.sleep(5000L);
			
		}
	// Print 5 titles difference tabs	
	Set<String> abc=driver.getWindowHandles();
	Iterator<String> it=abc.iterator();
	
	while(it.hasNext())
	{
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	
	
	
	
	driver.quit();
	
	
	}
	
	
	

}
