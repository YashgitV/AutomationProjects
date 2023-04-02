import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Youtube {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.youtube.com");
		d1.findElement(By.name("search"));
      //  Actions a1=new Actions(d1);
        //a1.moveToElement(f1).perform();
	}

}
