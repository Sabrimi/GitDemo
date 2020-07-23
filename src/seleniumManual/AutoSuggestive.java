package seleniumManual;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//Sabrusutra//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://ksrtc.in/");
	    driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
	    Thread.sleep(2000);
	    driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	    driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	    
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    String script ="return document.getElementById(\"fromPlaceName\").value;";
	    String text=(String) js.executeScript(script);
	    System.out.println(text);
	    int i=0;
	    while(!text.equalsIgnoreCase("BENGALURU INTATION AIPORT"))
	    {
	    	i++;
	    	driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	    	text=(String) js.executeScript(script);
	    	System.out.println(text);
	    	 Thread.sleep(500);
	    	if(i>10)
	    	{
	    		break;
	    	}
	    }
	    
    	if(text.equalsIgnoreCase("BENGALURU INTATION AIPORT"))
    	{
    		System.out.println("Element found");
    	}
    	else
    	{
    		System.out.println("Element not found");
    	}
	
	}

}
