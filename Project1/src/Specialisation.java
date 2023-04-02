interface Parentproperties
{
	void agriland();
	void houses();
}
class Son implements Parentproperties
{
	public void agriland()
	{
		System.out.println("get the majority agriland from parents");
	}
	public void houses()
	{
		System.out.println("majority houses from parents belongs to son");
	}
}
class Daughter implements Parentproperties
{
	public void agriland()
	{
		System.out.println("get the one acre agriland from parents belongs to daughter");
	}
	public void houses()
	{
		System.out.println("few house property from parents belongs to daughter");
	}
}
public class Specialisation {

	public static void main(String[] args)
	{
	   Son s1=new Son();
	   s1.agriland();
	   s1.houses();
	   Daughter d1=new Daughter();
	   d1.agriland();
	   d1.houses();
	   
	}

}
