package Generic_script;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_text implements Framework_const1  {
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty(chrome_key,chrome_value);
		driver=new ChromeDriver();
		//for launching the browser
		driver.get(base_url);
		//to enter url
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Take_screenshot.getphoto(driver);
		}
	
		driver.close();
	}

}
