package org.fi.in;

public class Engineer extends Employee
{
int overTime;

public Engineer(String name, String address, int age, boolean gender, long basicSalary, long computeSalary,
		int overTime)
{
	super(name, address, age, gender, basicSalary, computeSalary);
	this.overTime = overTime;
}

public int getOverTime()
{
	return overTime;
}

public void setOverTime(int overTime)
{
	this.overTime = overTime;
}

}
