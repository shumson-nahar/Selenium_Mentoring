package page_object_model1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetText {
	public WebDriver driver;
	@Test
	public void testGetText() {
		driver = new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		String logo =driver.findElement(By.linkText("Qafox.com")).getText();
		System.out.println("The text of logo is:"+logo);
	}

}
