public class Program {
	public static void main(String[] args) {
		Vehicle[] arrVehicle = new Vehicle[2];
		arrVehicle[0] = new Car(2000, 1, 4, 1, 6); // Upcasting
		arrVehicle[1] = new Bike(250, 1, 2, 1);
		Car secCar = (Car) arrVehicle[0]; // Base -> Derived Downcast
		System.out.println(arrVehicle[0]);
		System.out.println(arrVehicle[1]);
		System.out.println(secCar.airConditioner);
		((Car) arrVehicle[0]).openDoor();
	}
}
