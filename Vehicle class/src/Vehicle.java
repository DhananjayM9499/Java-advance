public class Vehicle {
	int engine;
	int chasis;
	int tyres;

	public Vehicle(int engine, int chasis, int tyres) {
		super();
		this.engine = engine;
		this.chasis = chasis;
		this.tyres = tyres;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public int getChasis() {
		return chasis;
	}

	public void setChasis(int chasis) {
		this.chasis = chasis;
	}

	public int getTyres() {
		return tyres;
	}

	public void setTyres(int tyres) {
		this.tyres = tyres;
	}
}