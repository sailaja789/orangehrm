package com.in;

public  class Test3 extends Test2
{
	private void method6()
	{
		System.out.println("method6 executed suceesfully");
	}
	public static void main(String[]args)
	{
		Test3 t=new Test3();
		t.method6();
		t.method1();
		t.method2();
		t.method3();
		t.method5();
	}
}


