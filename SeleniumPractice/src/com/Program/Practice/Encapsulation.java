package com.Program.Practice;


class LoginPage1
{
	private String username;
	private String password;
	
	public void setusername(String username)
	{
		this.username=username;
	}
	public String getusername()
	{
		if(username=="yaswanth")
		{
			return "username is correct:please enter password" ;
			}
		else
		{
			return "Invalid username:please re-eheck the credentials once";
		}
	}
	public void setpassword(String password)
	{
		this.password=password;
	}
	public String getpassword()
	{
		if(password=="yash430")
		{
			return "home page displayed";
		}
		else
		{
			return "invalid username or password";
		}
	}
}
public class Encapsulation {

	public static void main(String[] args) {

		LoginPage1 l1 = new LoginPage1();
		l1.setusername("yaswanth");
		System.out.println(l1.getusername());
		l1.setpassword("yash430");
		System.out.println(l1.getpassword());


	}

}
