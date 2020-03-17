package am.sovats.page.base.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SovatsBaseObjectTest {
	protected WebDriver driver;

	@BeforeTest
	public void prepareEnv() {
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sovats.am");
		//driver.findElement(By.xpath("//div[@class=\"S-language-drop-down\"]")).click();
		//driver.findElement(By.xpath("//div[@class=\"S-dropdown \"]//span[contains(text(),'en')]")).click();
	}

	/*@AfterTest
	public void cleanup() {
		driver.quit();
	}*/

}


