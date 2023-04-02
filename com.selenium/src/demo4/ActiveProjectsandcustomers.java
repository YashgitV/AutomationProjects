package demo4;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsandcustomers 
{
  @FindBy(xpath="//input[@value='Add New Customer']")
  private WebElement AddNewCustomer;
  @FindBy(className="successmsg")
  private WebElement Successmessage;
  public ActiveProjectsandcustomers()
  {
	 PageFactory.initElements(Baseclass.rv1,this);
  }
  public void clickonaddNewCustomer()
  {
	  AddNewCustomer.click();
  }
  public String retrivesuccessmessage()
  {
	  return Successmessage.getText();
  }
}
 
