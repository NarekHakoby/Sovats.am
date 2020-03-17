package am.sovats.pages.login.test;

import org.testng.annotations.Test;

import am.sovats.pages.home.SovatsHomePage;
import am.sovats.pages.home.test.SovatsHomePageTest;
import am.sovats.pages.login.SovatsLoginPage;


public class SovatsLoginPageTest extends SovatsHomePageTest {
	// Test id
	// Login with correct credentials(positive test).
	@Test
	public void LoginTestPositive() {
		// 1.1 Open sovats.am(done in beforeTest)
		// 1.2 Click on "Login" button
		SovatsHomePage home = new SovatsHomePage(driver);
		SovatsLoginPage login = home.clickOnLoginBtn();
		// 1.3 Type correct parameters
		login=login.clickOnLoginField("n9661102212@gmail.com");
		login=login.clickOnPasswordField("605H234");
		// 1.4 Click on "Log in" button
		login=login.clickOnLoginbutton();
		
	}
		
		
	

}
