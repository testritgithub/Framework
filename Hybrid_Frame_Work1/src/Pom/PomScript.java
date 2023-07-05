package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_script.BasePage;

public class PomScript extends BasePage {

	@FindBy(name="email")
	private WebElement uName;
	
	@FindBy(name="pass")
	private WebElement pWord;
	
	@FindBy(name="login")
	private WebElement loginBtn;
	
	public PomScript(WebDriver driver)
	{
		super(driver);
	}
	
	public void passUn(String un)
	{
		uName.sendKeys(un);
	}
	
	public void passPwd(String pwd)
	{
		pWord.sendKeys(pwd);
	}
	
	public void loginBtn()
	{
		loginBtn.click();
	}
	
}
