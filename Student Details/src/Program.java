
public class Program {

	public static void main(String[] args) {
		Student objStudent1 = new Student();
		Student objStudent2 = new Student();

		/*
		 * objStudent1.name="John"; objStudent1.address="Pune";
		 * objStudent1.phoneNumber="9855449499"; objStudent1.rollNumber=2;
		 * objStudent1.displayStudentDetails();
		 */

		objStudent1.setRollNumber(2);

		objStudent1.setAddress("Pune");

		objStudent1.setName("john");

		objStudent1.setPhoneNumber("5654898959");

		objStudent1.displayStudentDetails();

		System.out.println("************************************************");

		objStudent2.setRollNumber(3);

		objStudent2.setAddress("Mumbai");

		objStudent2.setName("Sam");

		objStudent2.setPhoneNumber("989898959");

		objStudent2.displayStudentDetails();

	}

}
