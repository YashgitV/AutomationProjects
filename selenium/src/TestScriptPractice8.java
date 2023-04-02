import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptPractice8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver ref3=new ChromeDriver();
		ref3.get("http://127.0.0.1:81/login.do");
		ref3.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		ref3.findElement(By.name("username")).sendKeys("admin");
		ref3.findElement(By.name("pwd")).sendKeys("manager");
		ref3.findElement(By.xpath("//input[@type='submit']")).click();
        ref3.findElement(By.linkText("Projects & Customers")).click();
        ref3.findElement(By.xpath("//input[@value='Add New Customer']")).click();
        ref3.findElement(By.name("name")).sendKeys("yaswanth");
        ref3.findElement(By.linkText("Completed Tasks")).click();
       String s1 =ref3.findElement(By.id("ConfirmWarning")).getText();
        System.out.println(s1);
     String s2=   ref3.findElement(By.xpath("//input[@value='Cancel Customer Creation and Proceed']")).getAttribute("value");
     System.out.println(s2);
        ref3.findElement(By.xpath("//input[@value='Cancel Customer Creation and Proceed']")).click();
        ref3.findElement(By.className("logoutImg")).click();
	}

}
