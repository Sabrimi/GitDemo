package seleniumManual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class seleniumScript {

	public static void main(String[] args) throws InterruptedException {
		
		String text = "Berlin";
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//Sabrusutra//Downloads//chromedriver");
	       
		WebDriver driver = new ChromeDriver();
        driver.get("http://rahulshettyacademy.com/AutomationPractice/");
        
        
        //CHECKBOXS
       
        //driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
        
        driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
        //driver.findElement(By.id("checkBoxOption1")).click();
        
       System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); 
       
       
        
        //POP UPS 
        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.cssSelector(("[id='alertbtn']"))).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        
        
       
       
       // driver.quit();


	}

}
