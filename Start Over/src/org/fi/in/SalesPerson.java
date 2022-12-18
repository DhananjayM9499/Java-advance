package org.fi.in;

public class SalesPerson extends Employee
{


public SalesPerson(String name, String address, int age, boolean gender, long basicSalary, long computeSalary,
			int comission)
	{
		super(name, address, age, gender, basicSalary, computeSalary);
		this.comission = comission;
	}

int comission;


public int getComission()
{
	return comission;
}

public void setComission(int comission)
{
	this.comission = comission;
}
}
