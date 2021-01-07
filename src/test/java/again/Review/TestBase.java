package again.Review;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestBase extends AbstractTestNGCucumberTests {

	public static WebDriver driver;
	

	@BeforeSuite
	@Parameters({"browser"})
	public void startDriver(@Optional("chrome") String browserName) {
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");

			driver = new FirefoxDriver();
		}
	else if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
	}
	

	driver.navigate().to("https://demo.nopcommerce.com/");
	}
}











