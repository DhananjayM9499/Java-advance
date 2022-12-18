package org.fi.employee;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) 
	{
		final int EXIT = 9 ;
		final int ADD_MANAGER = 1;
		final int ADD_ENGINEER = 2;
		final int ADD_SALESPERSON = 3;
		final int DISPLAY = 4;
		final int SAVE = 5;
		final int LOAD = 6;
		
		LinkedList<Employee> objList =new LinkedList<>();  // Type Inference
		
		Scanner scanner = null;
		try
		{
			scanner = new Scanner(System.in);
			
			int choice = 0;
			
			while(choice!=EXIT)
			{
				System.out.println("1. Add Manager");
				System.out.println("2. Add Engineer");
				System.out.println("3. Add Sales Person");
				System.out.println("4. Display");
				System.out.println("9. Exit");
				
				System.out.println("Enter your choice");
				choice = scanner.nextInt();
			
				switch(choice)
				{
					case ADD_MANAGER:
					case ADD_ENGINEER:
					case ADD_SALESPERSON:
					{
			
						System.out.println("Enter the name");
						String name = scanner.next();
						
						System.out.println("Enter the address");
						String address = scanner.next();
						
						System.out.println("Enter the age");
						int age = scanner.nextInt();
						
						System.out.println("Enter the gender");
						String strGender = scanner.next();
						boolean gender ;
						if(strGender.equalsIgnoreCase("male"))
						gender  = true;
						else
							gender = false;
				
						System.out.println("Enter the salary");
						float salary  = scanner.nextFloat();
						
						Employee objEmployee = null;
						
						if(choice==ADD_MANAGER)
						{
							System.out.println("Enter the hra");
							float hra = scanner.nextFloat();		
							
							objEmployee = new Manager(name, address, age, gender, salary, hra);
											
						}
						else if(choice==ADD_ENGINEER)
						{
							System.out.println("Enter the over time");
							float ot= scanner.nextFloat();		
							
							objEmployee= new Engineer(name, address, age, gender, salary, ot);
											
						}
						objList.add(objEmployee);
								
					}
					break;
					case DISPLAY:
					{
						Employee objEmployee = objList.getFirst();
						
						while(objEmployee!=null)
						{
						
							System.out.println(objEmployee.getName());
							System.out.println(objEmployee.getAddress());
							System.out.println(objEmployee.getAge());
							if(objEmployee.getGender())
							System.out.println("Male");
							else 
								System.out.println("Female");
							System.out.println(objEmployee.getBasicSalary());
							if(objEmployee instanceof Manager)
							{
								Manager objManager = (Manager) objEmployee;
								System.out.println(objManager.getHra());
							}
							else if(objEmployee instanceof Engineer)
							{
								Engineer objEngineer = (Engineer) objEmployee;
								System.out.println(objEngineer.getOverTime());
							}
							System.out.println("**********************************");
							objEmployee = objList.getNext();
					}
					break;
					
					case SAVE:
					{
						if(objList.getCount() > 0)
						{
							FileOutputStream fileOutputStream = null;
							ObjectOutputStream objectOutputStream = null;
							
							System.out.println("Enter the file name");
							String fileName = scanner.next();
							
							try {
								fileOutputStream = new FileOutputStream(fileName);
								objectOutputStream = new ObjectOutputStream(fileOutputStream);
								
								Object data = objList.getFirst();
								while(data!=null)
								{
									objectOutputStream.writeObject(data);
									data = objList.getNext();
								}
								System.out.println("Objects saved in the file " + fileName);
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							finally
							{
								try {
									if(objectOutputStream!=null)
										objectOutputStream.close();
									if(fileOutputStream!=null)
										fileOutputStream.close();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
					break;
					
					case LOAD:
					{
						FileInputStream fileInputStream = null;
						ObjectInputStream objectInputStream = null;
						
						try {
							System.out.println("Enter the filename to load");
							String fileName = scanner.next();
							
							fileInputStream  = new FileInputStream(fileName);
							objectInputStream = new ObjectInputStream(fileInputStream);
							
							try {
								do
								{
									Object data = objectInputStream.readObject();
									objList.add((Employee)data);
									
								}while(true);							
							} catch (ClassNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								
							}
							catch(EOFException eof)
							{
								System.out.println("File Loaded successfully...");
							}
							catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}						
						finally
						{
							try {
								if(objectInputStream!=null)
									objectInputStream.close();
								if(fileInputStream!=null)
									fileInputStream.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					break;
				}
				
			}
		
		
		}
		finally
		{
			scanner.close();
		}
		
		
		
		
		
	}

}
