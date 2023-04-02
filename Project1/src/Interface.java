interface Employee
{
	public abstract void employeeid();
	public abstract void employeename();
	public abstract void attendinterview();
	public abstract void gotjob();
}
class Fresher implements Employee
{
	public void employeeid()
	{
		System.out.println("employeeid is t733");
	}
	public void employeename()
	{
		System.out.println("employee name is yaswanth");
	}
	public void attendinterview()
	{
		System.out.println("attend the interview");
	}
	public void gotjob()
	{
		System.out.println("got the job");
	}
}
public class Interface
{
	public static void main(String[]args)
	{
		Fresher f1 = new Fresher();
		f1.employeeid();
		f1.employeename();
		f1.attendinterview();
		f1.gotjob();
	}
}
