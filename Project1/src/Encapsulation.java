class Data
{
  private String username;
  private String pwd;
  public void setuserdata(String username)
  {
	  this.username=username;
  }
  public String getuserdata()
  {
	  if(username=="yaswanth")
	  {
		  return "Username is correct:please enter password";
	  }
	  else
	  {
		  return "username is not matching";
	  }
  }
  public void setuserpassword(String pwd)
  {
	  this.pwd=pwd;
  }
  public String getuserpassword()
  {
	   if(pwd=="Vyaswanth@430")
	   {
		   return "password is correct";
	   }
	   else
	   {		   
	      return "password is incorect:please check once";
	   }
  }
}

public class Encapsulation
{
	public static void main(String[] args) 
	{
		Data d1 = new Data();
        d1.setuserdata("yaswanth");
        System.out.println(d1.getuserdata());
        d1.setuserpassword("Vyaswanth@430");
        System.out.println(d1.getuserpassword());
        
        }

}
