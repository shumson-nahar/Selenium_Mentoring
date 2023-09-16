package page_object_model1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	@FindBy(id="input-email")
	private WebElement UserNameField;
	@FindBy(id="input-password")
	private WebElement passwordField;
	@FindBy(css="input.btn-primary")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver,this);
		
	}
	public void enterUserName(String name) {
		 UserNameField.sendKeys(name);
	}
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	public void clickLoginButton() {
		loginButton.click();
	}

}
