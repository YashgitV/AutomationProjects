interface Employeea
{
	void manual();	
}
interface Employeeb
{
	void automation();
}
interface Employeec
{
	void sdet();
		
}
class Employeed implements Employeea,Employeeb,Employeec
{
	public void manual()
	{
		System.out.println("do the all manual tasks daily");
	}
	public void automation()
	{
		System.out.println("do the all automation tasks daily ");
	}
	public void sdet()
	{
		System.out.println("did the both manual& automation tasks parallel");
	}
}
public class Multipleinheritence {

	public static void main(String[] args)
	{
		
      Employeed e1=new Employeed();
      e1.manual();
      e1.automation();
      e1.sdet();
	}

}
