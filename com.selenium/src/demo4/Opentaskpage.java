package demo4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opentaskpage 
{
@FindBy(linkText="Projects & Customers")
private WebElement projectsandcustomers;
	
public Opentaskpage()
{
	PageFactory.initElements(Baseclass.rv1,this);
}
	
public void clickonProjectsCustomer()
{
	projectsandcustomers.click();
}

	
	
	
	
	
}
