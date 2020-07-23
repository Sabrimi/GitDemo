package seleniumManual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homework4EXPLICTY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//Sabrusutra//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
        driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
        WebDriverWait w = new WebDriverWait(driver,5);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("results"))); 
        System.out.println(driver.findElement(By.id("results")).getText());	
	     driver.quit(); 
	}
	
	

}
