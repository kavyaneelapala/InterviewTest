package QATest.Interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.Careers;
import PageObjects.LifeOfInterns;

public class TenForceTest {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.tenforce.com/");

		driver.manage().window().maximize();
	}

	@Test
	public void careerFlowTest() throws InterruptedException {

		Careers careers = new Careers(driver);
		careers.clickOnCareers();

		careers.clickOnLifeAtTenForce();
		careers.clickOnLifeOfTwoInterns();

		new LifeOfInterns().scrollArticle(driver);

		driver.navigate().back();
		
		

		Assert.assertTrue(
				driver.findElement(By.xpath("//*[contains(@class,'tenforce[tabs]')] //a[contains(@class,'default')]"))
						.getText().equalsIgnoreCase("Life at TenForce"));
		;


		// Small delay added for demo/reviewer visibility.
		// Not recommended for production automation.
		Thread.sleep(2000);
		careers.clickOnJobOpening();
		
		

		Assert.assertTrue(
				driver.findElement(By.xpath("//*[contains(@class,'tenforce[tabs]')] //a[contains(@class,'default')]"))
						.getText().equalsIgnoreCase("Job Openings"));
		;
		
		// Small delay added for demo/reviewer visibility.
		// Not recommended for production automation.
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement textElement = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Feel free to send your CV to']")));

		Assert.assertEquals(textElement.getText().trim(), "Feel free to send your CV to");
		Assert.assertTrue(driver.findElement(By.xpath(
				"//span[text()='Feel free to send your CV to']/following-sibling::span[contains(text(),'jobs')]"))
				.isDisplayed());
		
		
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
