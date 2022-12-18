public class SalesPerson extends Employee {

	public SalesPerson(String name, String address, int age, boolean gender, float basicSalary, float comission) {
		super(name, address, age, gender, basicSalary);
		this.comission = comission;
	}

	protected float comission;

	public float getcomission() {
		return comission;
	}

	public void setcomission(float comission) {
		this.comission = comission;
	}

}
