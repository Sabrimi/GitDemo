package seleniumManual;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Homework6practisepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//Sabrusutra//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String elementText = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[3]")).getText();
		System.out.println(elementText);

		driver.findElement(By.id("checkBox" + elementText)).click();
		driver.findElement(By.id("dropdown-class-example")).click();
		driver.findElement(By.xpath("//*[.='" + elementText + "']")).click();
		driver.findElement(By.id("name")).sendKeys(elementText);
		driver.findElement(By.id("alertbtn")).click();
		
		boolean isFound = driver.switchTo().alert().getText().contains(elementText);
		Assert.assertTrue(isFound);
		System.out.println("Successful");
	}

}
