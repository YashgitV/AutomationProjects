package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver n1=new ChromeDriver();
	  n1.get("https://parabank.parasoft.com/parabank/index.htm");
	  n1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

}
