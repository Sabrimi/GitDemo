package seleniumManual;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework8AutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//Sabrusutra//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("autocomplete")).sendKeys("ar");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
	
		while(!text.equalsIgnoreCase("Argentina")) {
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
		}
		
		if(text.equalsIgnoreCase("Argentina"))
    	{
    		System.out.println("Element found");
    	}
    	else
    	{
    		System.out.println("Element not found");
    	}

	}

}
