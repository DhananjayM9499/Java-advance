
public class Student {
	private String phoneNumber;
	private int rollNumber;
	private String name;
	private String address;

	public void displayStudentDetails() {
		System.out.println("Student Name : " + name);
		System.out.println("Student Roll Number : " + rollNumber);

		System.out.println("Student Address : " + address);
		System.out.println("Student phone Number : " + phoneNumber);

	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String PhoneNumber) {
		this.phoneNumber = PhoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String Address) {
		this.address = Address;
	}
	
	
	

}
