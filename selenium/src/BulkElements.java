import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BulkElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver c1=new ChromeDriver();
		c1.get("file:///C:/Users/yuva/Desktop/label.html");
		c1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	List<WebElement>r1=c1.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0;i<r1.size();i++)
	{
		r1.get(i).click();
	}

	}

}
