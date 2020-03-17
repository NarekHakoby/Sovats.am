package am.sovats.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.sovats.pages.base.SovatsBasePageObject;
import am.sovats.pages.login.SovatsLoginPage;


public class SovatsHomePage extends SovatsBasePageObject{
	public SovatsHomePage(WebDriver driver) {
		super(driver);
	}
	
		public final String LANG_DROPDOWN_XPATH = "//div[@class='S-language-drop-down']";
		public final String DROPDOWN_EN_XPATH = "//div[@class='S-dropdown']//span[contains(text(),'en')]";
		public final String DROPDOWN_RU_XPATH = "//div[@class='S-dropdown']//span[3]";
		public final String DROPDOWN_AM_XPATH = "//div[@class='S-dropdown']//span[2]";
		public final String LOGIN_BTN_XPATH = "//div[@class='S-right-side_2']";
		
		
		@FindBy(xpath = LANG_DROPDOWN_XPATH)
		WebElement dropdown;
		
		@FindBy(xpath = DROPDOWN_EN_XPATH)
		WebElement dropdownen;

		@FindBy(xpath = DROPDOWN_RU_XPATH)
		WebElement dropdownru;

		@FindBy(xpath = DROPDOWN_AM_XPATH)
		WebElement dropdownam;
		
		@FindBy(xpath = LOGIN_BTN_XPATH)
		WebElement loginbtn;
		
		
		public SovatsHomePage clickOnDropdown() {
			waitForElementPresent(LANG_DROPDOWN_XPATH);
			dropdown.click();
			return new SovatsHomePage(driver);
		}
		
		public SovatsHomePage clickOnDropdownEn() {
			waitForElementClickable(DROPDOWN_EN_XPATH);
			dropdownen.click();
			return new SovatsHomePage(driver);
		}

		public SovatsHomePage clickOnDropdownRu() {
			waitForElementPresent(DROPDOWN_RU_XPATH);
			dropdownru.click();
			return new SovatsHomePage(driver);
		}

		public SovatsHomePage clickOnDropdownAm() {
			waitForElementPresent(DROPDOWN_AM_XPATH);
			dropdownam.click();
			return new SovatsHomePage(driver);
		}
		
		public SovatsLoginPage clickOnLoginBtn() {
			waitForElementPresent(LOGIN_BTN_XPATH);
			loginbtn.click();
			return new SovatsLoginPage(driver);
		}
}