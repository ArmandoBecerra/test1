package qa.actions;

import org.openqa.selenium.WebElement;

import qa.base.BaseTest;
import qa.pages.LiverpoolHome;

public class LiverpoolHomeActions extends BaseTest {

	public void selectSugestedProduct(String product) {

		LiverpoolHome livHome = new LiverpoolHome();

		for (WebElement result : livHome.sugestedProductsResults) {
			String suggested = result.getText();
			if (suggested.equals(product)) {
				result.click();
				break;
			}

		}

	}

}
