
public class Employees {
	int salary;
	int hours;
	
	public void getinfo(int tmpSalary, int tmpHours){
		salary=tmpSalary;
		hours = tmpHours;
		
	}
	public int addSal() {
		 
			return salary=salary+10;
		
	
			
	}
	public int addWork() {
	
			return salary=salary+5;
		
		
	}
	public void display() {
		System.out.println("Your salary according to "+ hours + " hours is : "+salary);
	}

}
