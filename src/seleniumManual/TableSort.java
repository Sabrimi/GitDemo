package seleniumManual;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//Sabrusutra//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//b[contains(text(),'Veg')]")).click();
		// driver.findElement(By.xpath("//b[contains(text(),'Veg')]")).click();

		List<WebElement> fristColList = driver.findElements(By.xpath("//tr/td[2]"));

		ArrayList<String> originalList = new ArrayList<String>();
		for (int i = 0; i < fristColList.size(); i++) {
			originalList.add(fristColList.get(i).getText());
		}
		ArrayList<String> copitedList = new ArrayList<String>();

		for (int i = 0; i < originalList.size(); i++) {
			copitedList.add(originalList.get(i));
		}

		System.out.println("***********************");
		Collections.sort(copitedList);
		Collections.reverse(copitedList);
		for (String s : copitedList) {
			System.out.println(s);

		}
		System.out.println("********Original List***************+");
		for (String s : originalList) {
			System.out.println(s);
		}

		Assert.assertTrue(originalList.equals(copitedList));
	}
}
