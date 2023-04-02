import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver d1=new ChromeDriver();
		d1.get("file:///C:/Users/yuva/Desktop/Links.html");
		//List<WebElement> te=d1.findElements(By.tagName("a"));

	}

}
