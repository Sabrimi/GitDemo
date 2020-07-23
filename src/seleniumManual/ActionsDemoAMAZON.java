package seleniumManual;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemoAMAZON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//Sabrusutra//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Actions a= new Actions(driver);
        WebDriverWait w = new WebDriverWait(driver,5);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='nav-line-2 nav-long-width']")));
        WebElement move=(driver.findElement(By.cssSelector("span[class='nav-line-2 nav-long-width']")));
        
        
        //Move Specific Element
        a.moveToElement(move).contextClick().build().perform();
        //Shilf-Send Txt - DoubleClick
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
             

	}

}
