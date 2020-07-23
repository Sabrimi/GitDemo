package seleniumManual;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework7Tables {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//Sabrusutra//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		System.out.println(driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr")).size());
		System.out.println(driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr/th")).size());
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr[3]/td"));
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
		}
		
		
		driver.quit();
		
	}

}
