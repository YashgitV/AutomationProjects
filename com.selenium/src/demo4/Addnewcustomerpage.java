package demo4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addnewcustomerpage 
{
@FindBy(name="name")
private WebElement Addnewcustomerpage;
@FindBy(name="createCustomerSubmit")
private WebElement createnewcustomer;

public Addnewcustomerpage()
{
	PageFactory.initElements(Baseclass.rv1,this);
}
public void entercustomername(String name)
{
	Addnewcustomerpage.sendKeys( name);
}
public void clickoncreatecustomerbutton()
{
	createnewcustomer.click();
}




}
