package OpencartPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OpencartP {
WebDriver driver;
	
	public OpencartP (WebDriver driver) {
		this.driver = driver;
		
		
	}
	
	@FindBy(how = How.ID, using = "input-email")
	WebElement UserName;
	
	@FindBy(how = How.ID, using = "input-password")
	WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]")
	WebElement LoginBtn;
	
	
	
	public void Loginopencart(String Uname ,String Psd) {
		UserName.sendKeys(Uname);
		Password.sendKeys(Psd);
		LoginBtn.click();
		
		
}
}
