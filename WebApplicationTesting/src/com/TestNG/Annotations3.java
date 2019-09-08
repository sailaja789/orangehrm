package com.TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3 
{
	@BeforeMethod
	public void GmailApplicationLaunch()
	{
		System.out.println("Launchin gmailapplication");
	}
	@Test(priority=1)
	public void inbox()
	{
		System.out.println("testing inbox functionality");
		
	}
	@Test(priority=3)
	public void sentmail()
	{
		System.out.println("testing sentmail functionality");
	}
	@Test(priority=2)
	public void drafts()
	{
		System.out.println("testing drafts functionality");
	}
	@Test(enabled=false)
	public void composemail()
	{
		System.out.println("testing composemail functionality");
	}
	@AfterMethod
	public void GmailApplicationclose()
	{
		System.out.println("testing gmail applicationclose functionality");			
	}

}
