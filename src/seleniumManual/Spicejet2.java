package seleniumManual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//Sabrusutra//Downloads//chromedriver");
	       
		WebDriver driver = new ChromeDriver();
        driver.get("https://book.spicejet.com/");
        /*
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        
      ///(//a[@value='MAA'])[2]
      //a[@value='BLR']
        Thread.sleep(10000L);
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
     
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(1000L);
        ///driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
        */
        //adult
        //Thread.sleep(10000L);
       
        
        driver.quit();


	}

}
