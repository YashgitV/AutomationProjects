package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestScriptPractice2 {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
ChromeDriver ref3=new ChromeDriver();
ref3.get("http://127.0.0.1:81/login.do");
ref3.findElement(By.name("username")).sendKeys("admin");
ref3.findElement(By.name("pwd")).sendKeys("manager");
ref3.findElement(By.xpath("//input[@type='submit']")).click();
ref3.findElement(By.linkText("Projects & Customers")).click(); 
ref3.findElement(By.xpath("//input[@onclick='addProject(this.form)']")).click();
WebElement d1=ref3.findElement(By.name("customerId"));
Select s1=new Select(d1);
if(s1.isMultiple())
{
	System.out.println("it is a multiple select dropdown");
	
}
else
{
	System.out.println("it is a single select drop down");
}
int i=s1.getOptions().size();
System.out.println("no of options are"+i);
s1.selectByVisibleText("yaswanth");
ref3.findElement(By.name("name")).sendKeys("selenium3");
ref3.findElement(By.name("createProjectSubmit")).click();
 String s2=ref3.findElement(By.className("successmsg")).getText();
System.out.println(s2);
ref3.findElement(By.className("logoutImg")).click();
}
}
		



		

