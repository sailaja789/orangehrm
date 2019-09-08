package com.in;
public class Test2 extends Test1
{
	public void method3()
	{
		System.out.println("method3 executed suceessfully");
	}
	private void method4()
	{
		System.out.println("method4 executed suceessfully");
	}
	protected void method5()
	{
		System.out.println("method5 executed suceesfully");
	}
	public static void main(String[]args)
	{
		Test2 t=new Test2();
		t.method1();
		t.method2();
		t.method3();
		t.method4();
		t.method5();
	}

}
