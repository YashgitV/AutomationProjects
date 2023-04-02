import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptPractice7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver ref2=new ChromeDriver();
		ref2.get("http://127.0.0.1:81/login.do");
		ref2.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		ref2.findElement(By.name("username")).sendKeys("admin");
		ref2.findElement(By.name("pwd")).sendKeys("manager");
		ref2.findElement(By.xpath("//input[@type='submit']")).click();
        ref2.findElement(By.linkText("Projects & Customers")).click();
        ref2.findElement(By.linkText("selenium3")).click();
        ref2.findElement(By.xpath("//input[@value='Delete This Project']")).click();
       String s1=ref2.switchTo().alert().getText();
        System.out.println(s1);
       ref2.switchTo().alert().accept();  
        ref2.findElement(By.className("logoutImg")).click();
	}

}
