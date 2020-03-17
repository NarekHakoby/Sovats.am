package am.sovats.pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SovatsBasePageObject {

	protected WebDriver driver;

	public SovatsBasePageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
		public void waitForElementPresent(String xPath) {
			new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
		}
		public void waitForElementClickable(String xPath) {
			new WebDriverWait(driver,100).until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
		}
		
		
		
}
