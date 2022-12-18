package org.fi.in;

public class Manager extends Employee
{
int hra;


public Manager(String name, String address, int age, boolean gender, long basicSalary, long computeSalary, int hra)
{
	super(name, address, age, gender, basicSalary, computeSalary);
	this.hra = hra;
}
public int getHra() {
	return hra;
}
public void setHra(int hra) {
	this.hra=hra;
}
}
