import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import org.fi.utility.LinkedList;

public class Program
{

	public static void main(String[] args)
	{
		final int ADD_MANAGER = 1;
		final int ADD_ENGINEER = 2;
		final int ADD_SALESPERSON = 3;
		final int DISPLAY = 4;
		final int EXIT = 9;
		final int SAVE = 7;
		final int LOAD = 8;
		LinkedList<Employee> objList = new LinkedList<>();
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int choice = 100;

			while (choice != EXIT) {

				System.out.println("Menu for Application : " + "\n1. Add Manager" + "\n2. Add Engineer"
						+ "\n3. Add Sales Person" + "\n4. Display All" + "\n5. Sort by Name"
						+ "\n6. Sort by Designation" + "\n7. Save" + "\n8. Load" + "\n9. Exit");

				System.out.println("Enter the choice :");
				choice = scanner.nextInt();

				switch (choice)
				{

				case ADD_MANAGER:
				case ADD_ENGINEER:
				case ADD_SALESPERSON: {
					System.out.println("Enter name");
					String name = scanner.next();

					System.out.println("Enter address");
					String address = scanner.next();

					System.out.println("Enter age");
					int age = scanner.nextInt();

					System.out.println("Enter Gender ");
					boolean gender = scanner.nextBoolean();

					System.out.println("Enter BasicSalary ");
					float basicSalary = scanner.nextFloat();
					Employee objEmployee = null;
					if (choice == ADD_MANAGER) {
						System.out.println("Enter HRA ");
						float hra = scanner.nextFloat();

						objEmployee = new Manager(name, address, age, gender, basicSalary, hra);

					} else if (choice == ADD_ENGINEER) {
						System.out.println("Enter over time ");
						float overTime = scanner.nextFloat();
						objEmployee = new Engineer(name, address, age, gender, basicSalary, overTime);

					} else if (choice == ADD_SALESPERSON) {
						System.out.println("Enter commison");
						float comission = scanner.nextFloat();
						objEmployee = new SalesPerson(name, address, age, gender, basicSalary, comission);

					}
					objList.add(objEmployee);

				}
					break;

				case DISPLAY: {
					Employee objEmployee = objList.getFirst();
					while (objEmployee != null) {
						System.out.println("==============================================");

						System.out.println("Name : " + objEmployee.name);
						System.out.println("Address :" + objEmployee.address);
						System.out.println("Age : " + objEmployee.age);
						System.out.println("Gender : " + objEmployee.gender);
						if (objEmployee.getGender() == true)
							System.out.println("Male");
						else
							System.out.println("Female");
						System.out.println("Basic Salary : " + objEmployee.basicSalary);
						if (objEmployee instanceof Manager) {
							Manager objManager = (Manager) objEmployee;
							System.out.println("HRA : " + objManager.hra);
							System.out.println();
						} else if (objEmployee instanceof Engineer) {
							Engineer objEngineer = (Engineer) objEmployee;
							System.out.println("Over Time : " + objEngineer.overTime);
							System.out.println();
						} else if (objEmployee instanceof SalesPerson) {
							SalesPerson objSalesPerson = (SalesPerson) objEmployee;
							System.out.println("Comissiona : " + objSalesPerson.comission);
							System.out.println();

						}
						objEmployee = objList.getNext();

					}
				}
					break;

				case '5': {// sorting by name

				}

					break;
				case '6': {// sorting by designation

				}
					break;
				case SAVE: {
					if (objList.getCount() > 0) {
						FileOutputStream fileOutputStream = null;
						ObjectOutputStream objectOutputStream = null;
						System.out.println("Enter the file name");
						String fileName = scanner.next();
						try {
							fileOutputStream = new FileOutputStream(fileName);
							objectOutputStream = new ObjectOutputStream(fileOutputStream);
							Object data = objList.getFirst();
							while (data != null) {
								objectOutputStream.writeObject(data);
								data = objList.getNext();

							}
							System.out.println("Directory of the file is" + fileName);
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {

							e.printStackTrace();
						} finally {
							try {
								if (objectOutputStream != null)
									objectOutputStream.close();
								if (fileOutputStream != null)
									fileOutputStream.close();
							} catch (Exception e) {
								// TODO: handle exception
							}

						}

					}

				}
					break;
				case LOAD: {
					FileInputStream fileInputStream = null;
					ObjectInputStream objInputStream = null;
					
					try {
						System.out.println("Enter the File name to load");
						String fileName = scanner.next();
						fileInputStream = new FileInputStream(fileName);
						objInputStream = new ObjectInputStream(fileInputStream);

						try {
							do 
							{
								Object data = objInputStream.readObject();
								objList.add((Employee)data);
							} while (true);

						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						} catch (EOFException eof) {
							System.out.println("File loaded successfully");
						} catch (IOException e) {
							e.printStackTrace();
						
					} 
				
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}catch(IOException e) {
					e.printStackTrace();
				}
					finally {
						try {
							if (objInputStream != null)
								objInputStream.close();
							if (fileInputStream != null)
								fileInputStream.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
					break;

				case '9': {

					System.out.println(" Have a nice day....!!!");
					System.exit(0);
					return;

				}

				default:

					break;

				}
			}
		} finally

		{
			if (scanner != null)
				scanner.close();
		}
		
}
}
