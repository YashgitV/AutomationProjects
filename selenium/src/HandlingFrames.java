import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver y1=new ChromeDriver();
		y1.get("file:///C:/Users/yuva/Desktop/PARENT.HTML");
	y1.findElement(By.xpath("//input[@placeholder='name']")).sendKeys("yashu");
	y1.switchTo().frame(0);
	y1.findElement(By.id("y1")).click();
	y1.switchTo().defaultContent();
	y1.findElement(By.xpath("//input[@placeholder='phone']")).sendKeys("1234");
	y1.switchTo().frame(1);
	y1.findElement(By.id("y2")).click();
	y1.switchTo().defaultContent();
	y1.findElement(By.xpath("//input[@placeholder='email']")).sendKeys("yashu@1");
	y1.switchTo().frame(2);
	y1.findElement(By.id("y3")).click();
	y1.switchTo().defaultContent();
		

	}

}
