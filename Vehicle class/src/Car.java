public class Car extends Vehicle {
	int airConditioner;
	int airBags;

	public Car(int engine, int chasis, int tyres, int airConditioner, int airBags) {
		super(engine, chasis, tyres);
		this.airConditioner = airConditioner;
		this.airBags = airBags;
	}

	public int getAirConditioner() {
		return airConditioner;
	}

	public void setAirConditioner(int airConditioner) {
		this.airConditioner = airConditioner;
	}

	public int getAirBags() {
		return airBags;
	}

	public void setAirBags(int airBags) {
		this.airBags = airBags;
	}

	public void openDoor() {
		System.out.println("Opening door");
	}
}