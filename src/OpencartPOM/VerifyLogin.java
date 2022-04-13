package OpencartPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class VerifyLogin {
	 @Test
	  public void TestUser() {
		  WebDriver driver = Browseroption.BrowserFactory("chrome","https://www.opencart.com/index.php?route=account/login");
		  OpencartP loginHRM =PageFactory.initElements(driver, OpencartP.class);
		  loginHRM.Loginopencart("d.shivam1507@gmail.com","Shivam123@");
	}
}
