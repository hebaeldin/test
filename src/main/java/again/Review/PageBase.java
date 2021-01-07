package again.Review;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	
	
	protected WebDriver dirver;
	//constructor
	public PageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	

}
