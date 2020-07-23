package seleniumManual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//Sabrusutra//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		System.out.println(driver.findElement(By.id("content")).getText());
		
	}

}
