package seleniumManual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

	public static void main(String[] args) {
		String text = "indigo";
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//Sabrusutra//Downloads//chromedriver");
	      
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.cleartrip.com/");
        
        driver.findElement(By.id("Adults")).click();
        driver.findElement(By.xpath("//select[@id=\"Adults\"]//option[@value=\"2\"]")).click();
        driver.findElement(By.xpath("//select[@id=\"Childrens\"]//option[@value=\"7\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"DepartDate\"]")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
        
        driver.findElement(By.id("MoreOptionsLink")).click();
        driver.findElement(By.name("airline")).click();
        driver.findElement(By.name("airline")).sendKeys(text);
        driver.findElement(By.id("SearchBtn")).click(); 
        
        System.out.print(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
