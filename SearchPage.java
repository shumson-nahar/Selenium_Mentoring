package page_object_model1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	private WebDriver driver;
	@FindBy(name="search")
private WebElement searchInput;
	@FindBy(css="i.fa-search")
	private WebElement searchButton;
	public SearchPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements( driver,this);
		
	}
	public void enterSearchQuery(String product) {
		searchInput.sendKeys(product);
	}
	public void clickSearchButton() {
		searchButton.click();
	}
	
}
