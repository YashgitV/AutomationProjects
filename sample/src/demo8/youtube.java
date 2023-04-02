package demo8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
ChromeDriver b1=new ChromeDriver();
b1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
b1.get("https://www.youtube.com");
b1.findElement(By.name("search_query")).sendKeys("rangam movie songs");
b1.findElement(By.id("search-icon-legacy")).click();
b1.findElement(By.xpath("//a[@title='Rangam Songs | Aga Naga Naga Video Song | Jiiva, Karthika, Piaa | Sri Balaji Video']")).click();
b1.findElement(By.xpath("//a[@aria-label='4,553 likes']")).click();
b1.findElement(By.id("video-title")).click();
b1.findElement(By.xpath("//yt-icon[@class='style-scope ytd-toggle-button-renderer']")).click();
b1.findElement(By.id("button")).click();
b1.findElement(By.className("style-scope ytd-button-renderer style-suggestive size-small")).click();
b1.switchTo().alert().accept();
b1.findElement(By.xpath("//paper-button[@id='button']")).click();
}

}
