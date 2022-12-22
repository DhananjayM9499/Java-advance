
public class Program5 {

	public static void main(String[] args) {
		Employees employee=new Employees();
		System.out.println("Enter your salary");
		int Salary=ConsoleInput.getInteger();
		
		System.out.println("Enter your Working hours");
		int workingHours=ConsoleInput.getInteger();
		employee.getinfo(Salary, workingHours);
		if(Salary<500) {
			employee.addSal();
		}
		if(workingHours>6) {
			employee.addWork();
		}
		
		employee.display();
	}

}
