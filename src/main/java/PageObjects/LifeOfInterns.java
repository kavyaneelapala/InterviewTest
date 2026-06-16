package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LifeOfInterns 
{
	WebDriver driver;
	
	public void scrollArticle(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 0; i < 10; i++) {
		    js.executeScript("window.scrollBy(0, 600);");
		   
		}
	}

}
