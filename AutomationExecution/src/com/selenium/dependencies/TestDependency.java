package com.selenium.dependencies;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestDependency
{
	static String trackingnum = null;
	@Ignore
    @Test()
    public void CreateShipment()
    {
    	System.out.println(3/0);
    	System.out.println("CreateShipment");
    	trackingnum = "ABGTR1287";
    }
    
    @Test(dependsOnMethods= {"CreateShipment"}, ignoreMissingDependencies = true)
    public void TrackShipment() throws Exception
    {
    	if(trackingnum !=null)
    	{
    	System.out.println("TrackShipment");
    	}
    	else
    	{
    		throw new Exception("Invalid tracking number");
    	}
    }
    
    @Test(dependsOnMethods= {"CreateShipment","TrackShipment"} ,ignoreMissingDependencies = true)
    public void CancelShipment()
    {
    	if(trackingnum !=null)
    	{
    	  System.out.println("CancelShipment");
    	}
    	else
    	{
    		System.out.println("Invalid tracking number");
    	}
    }
}
