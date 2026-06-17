package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;

public class Careers extends PageHelper
{
	public Careers(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	public  void clickOnCareers() {
		WebElement ele = driver.findElement(By.xpath(
				"//ul[contains(@class,'tf-navbar__main-nav tf-navbar__main-nav--main')]  //span[text()='About Us']"));
		
		WebElement career = driver.findElement(By.xpath("(//a[text()='Career' and contains(@href,'career')])[2]"));
		Actions act = new Actions(driver);
		
		////a[contains(@href,'about-us')]/following-sibling::a[contains(@href,'career')]
		act.moveToElement(ele).moveToElement(career).click().build().perform();
	}
	
	public void clickOnLifeAtTenForce() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement lifeAtTenForce = wait.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//a[text()='Job Openings']/following-sibling::a[text()='Life at TenForce']")));

		lifeAtTenForce.click();
	}
	
	public void clickOnLifeOfTwoInterns() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    WebElement link = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//span[normalize-space()='Life of two interns']/ancestor::a")));

	    ((JavascriptExecutor) driver)
	            .executeScript("arguments[0].scrollIntoView({block:'center'});", link);

	    ((JavascriptExecutor) driver)
	            .executeScript("arguments[0].click();", link);
	}
	
	public void clickOnJobOpening()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.urlToBe(
		        "https://www.tenforce.com/career/#people"));
		
		

	    WebElement link = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//a[text()='Job Openings']")));

	    ((JavascriptExecutor) driver)
	            .executeScript("arguments[0].scrollIntoView({block:'center'});", link);

	    ((JavascriptExecutor) driver)
	            .executeScript("arguments[0].click();", link);
	    
	    wait.until(ExpectedConditions.urlToBe(
		        "https://www.tenforce.com/career/#job"));
		
		
	}
	
	
		
	

}
