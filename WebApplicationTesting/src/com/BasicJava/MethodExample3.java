package com.BasicJava;

public class MethodExample3
{
		int employeeId;
		String employeeName;
		//user defind method using parameters/arguments
		void insertTestData(int id,String Name)
		{
			employeeId=id;
			employeeName=Name;
		}
		void displayInformation()
		{
			System.out.println("the employee id is : "+employeeId);
			System.out.println("the employee name is : "+employeeName);
		}
		public static void main(String[]args)
		{
			MethodExample3 M=new MethodExample3();
			M.insertTestData(101,"Ram");
			M.displayInformation();
			M.insertTestData(102,"Krishna");
			M.displayInformation();
		}

	}


