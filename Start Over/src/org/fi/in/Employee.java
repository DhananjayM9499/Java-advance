package org.fi.in;

public class Employee
{
	String name;
	String address;
	int age;
	boolean gender;
	long basicSalary;
	long computeSalary;
	
	
	public Employee(String name, String address, int age, boolean gender, long basicSalary, long computeSalary)
	{
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.basicSalary = basicSalary;
		this.computeSalary = computeSalary;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public boolean isGender()
	{
		return gender;
	}
	public void setGender(boolean gender)
	{
		this.gender = gender;
	}
	public long getBasicSalary()
	{
		return basicSalary;
	}
	public void setBasicSalary(long basicSalary)
	{
		this.basicSalary = basicSalary;
	}
	public long getComputeSalary()
	{
		return computeSalary;
	}
	public void setComputeSalary(long computeSalary)
	{
		this.computeSalary = computeSalary;
	}

}
