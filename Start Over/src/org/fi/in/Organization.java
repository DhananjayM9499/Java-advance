package org.fi.in;

import java.util.Scanner;

public class Organization
{

	public static void main(String[] args)
	{
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		System.out.println("Enter name ");
		String name=scanner.next();
		System.out.println("Enter address");
		String address = scanner.next();
		System.out.println("Enter age");
		int age=scanner.nextInt();
		System.out.println("enter gender");
		boolean gender=scanner.nextBoolean();
		System.out.println("enter Basic salary4");
		long basicSalary=scanner.nextLong();
		long totalSalary=scanner.nextLong();
		int hra=scanner.nextInt();
		
		Manager objManager=new Manager(name, address, age, gender, basicSalary,totalSalary , hra);

	}

}
