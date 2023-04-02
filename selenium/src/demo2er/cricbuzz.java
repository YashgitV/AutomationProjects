package demo2er;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricbuzz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver n1=new ChromeDriver();
		n1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		n1.get("https://www.cricbuzz.com");
		n1.findElement(By.linkText("News")).click();
		
		

	}

}
