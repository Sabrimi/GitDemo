package seleniumManual;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework5SwitchWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//Sabrusutra//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//*[@id='content']/div/a")).click();
        System.out.println("before Switching");
        System.out.println(driver.getTitle());
        Set<String> win=driver.getWindowHandles();
        Iterator<String> it=win.iterator();
        String parentid=it.next();
        String childid=it.next();
        driver.switchTo().window(childid);
        System.out.println("After Switching");
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentid);
        System.out.println("Switching back to parent");
        System.out.println(driver.getTitle());
        
        driver.quit();
        
	}

}
