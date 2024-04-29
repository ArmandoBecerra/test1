package qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import qa.base.BaseTest;

public class LiverpoolHome extends BaseTest {

	// object repository for Liverpool Home Page
	@FindBy(xpath = "//img[@title= 'Liverpool Logo']")
	protected WebElement liverpoolHomeHeader;
	
	@FindBy(id = "mainSearchbar")
	public WebElement searchBar;

	@FindBy(xpath = "//input[@id= 'mainSearchbar']/following::div[@class= 'input-group-append']")
	public WebElement searchButton;

	@FindBy(xpath = "//ul[@class = 'row p-2 sayt-child']")
	protected WebElement sugestedProductsTable;
	
	@FindBys({
		@FindBy(xpath = "//p[@class= 'a-search-suggestion-title']/ancestor::a")
		
	})
	public List<WebElement> sugestedProductsResults;
	// constructor with PageFactory to initiate all the page objects
	public LiverpoolHome() {
		PageFactory.initElements(driver, this);
	}

	// actions or functions on Liverpool Home

	public boolean isHomePageDisplayed() {
		return liverpoolHomeHeader.isDisplayed();
	}
	
	public void  selectSugestedProduct(String product) {
		
		for (WebElement result : sugestedProductsResults) {
			String suggested = result.getText();
			if (suggested.equals(product)) {
				result.click();
				break;
			}
			
		}
		
	}

}
