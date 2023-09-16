package page_object_model1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	@FindBy(linkText = "My Account")
	private WebElement myAccount;
	@FindBy(linkText ="Login")
	private WebElement loginButton;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
	}
	public void clickOnAccountLink() {
		myAccount.click();
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}

}
