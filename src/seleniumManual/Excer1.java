package seleniumManual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Excer1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//Sabrusutra//Downloads//chromedriver");
	       
		//Open PAGE
		WebDriver driver = new ChromeDriver();
        driver.get("https://book.spicejet.com/");
        
        //TYPE OF TRIP & SELECT PAXS CHECKBOX
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).click();
        driver.findElement(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$FamilyAndFriends")).click();
        
        //SELECT CITYS
        driver.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT\"]")).click();
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='GOI']")).click();
        
        //SELECT DAY OF TODAY
        Thread.sleep(2000L);
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); 
        
        //BOTTOM DISABLE
        boolean contains = driver.findElement(By.id("marketDate_2")).getAttribute("style").contains("0.5");
        if(contains) {
        	Assert.assertTrue(true);
        	System.out.println("is Disable");
        } else {
        	Assert.assertTrue(false);
            System.out.println("is Enable");
        }
        //SELECT ADULTS
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")).click();
        driver.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT\"]/option[4]")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        
	    //SELECT TYPE MONEY
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")).click();
        driver.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency\"]/option[4]")).click();
        
        //FINAL BOTTOM
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
        
	
	}

}
