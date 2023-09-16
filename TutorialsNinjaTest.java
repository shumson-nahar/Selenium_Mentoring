package page_object_model1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialsNinjaTest {
	private WebDriver driver;
	private HomePage homepage ;
	private LoginPage loginpage;
	private SearchPage searchpage;
	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		homepage = new HomePage(driver);
		loginpage = new LoginPage(driver);
		searchpage = new SearchPage(driver);
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void validLoginCredentials() {
		homepage.clickOnAccountLink();
		homepage.clickOnLoginButton();
		loginpage.enterUserName("naharshumson@gmail.com");
		loginpage.enterPassword("Farabi1234");
		loginpage.clickLoginButton();
	}
	@Test
	public void searchQueryTest() {
		searchpage.enterSearchQuery("iphone");
		searchpage.clickSearchButton();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
