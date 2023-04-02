import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver y2=new ChromeDriver();
		y2.get("file:///C:/Users/yuva/Desktop/pag2.html");
		y2.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	WebElement ft	=y2.findElement(By.xpath("//iframe[@src=pag2.html]"));
	y2.switchTo().frame(ft);
	WebElement ft1=y2.findElement(By.xpath("//iframe[@src='parent.html']"));
	y2.switchTo().frame(ft1);
	y2.findElement(By.id("cd3")).click();
	y2.switchTo().parentFrame();
	y2.findElement(By.id("cd2")).click();
	y2.switchTo().parentFrame();
	y2.findElement(By.id("cd1")).click();
	//y2.switchTo().parentFrame();	

	}

}
