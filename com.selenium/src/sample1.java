import org.testng.annotations.Test;

public class sample1 {
@Test(priority=1)
public void testCC()
{
	System.out.println("CC is executed");
}
@Test(priority=2)
public void testBB()
{
	System.out.println("BB is executed");
}
@Test(priority=3)
public void testAA()
{
	System.out.println("AA is executed");
	
	
}
}
 