package Runner_script;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_script.Base_text;
import Pom.PomScript;


public class Runnerscript extends Base_text  {
	@Test(dataProvider = "testData")
	public void test1(String un,String pwd)
	{
		PomScript p= new PomScript(driver);
		p.passUn(un);
		p.passPwd(pwd);
		p.loginBtn();
		
	}
	@DataProvider(name="testData")
	public Object[][] creatData()
	{
		return new Object[][] {
			{"appu","123456"},
			{"biradar","789456"}
		};
	}

}
