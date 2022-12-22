
public class Program_4 {

	public static void main(String[] args) {
		Employee employee1=new Employee();
		employee1.name="Robert";
		employee1.yearOfJoining=1994;
		employee1.salary=50000;
	    employee1.address="64C- WallsStreat";
	    
	    Employee employee2=new Employee();
	    employee2.name="Sam   ";
		employee2.yearOfJoining=5000;
		employee2.salary=20000;
	    employee2.address="68D- WallsStreat";
	    
	    
	    
	    
		Employee employee3=new Employee();
		employee3.name="John  ";
		employee3.yearOfJoining=1999;
		employee3.salary=30000;
	    employee3.address="26B- WallsStreatt";
	    
		
		
		
	    System.out.println("  Name "+"    Year of joining "+"  Salary "+"         Address  " );
		employee1.display();
		employee2.display();
		employee3.display();

	}

}
