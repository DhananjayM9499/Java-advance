
public class Laptop {
	
	int height;
	int width;
	int screenSize;
	float clockSpeed;
	CPU objCPU;

	public Laptop() {
		
	}
	
	public  Laptop clone() {
		
	    Laptop copyLaptop=new Laptop();
		copyLaptop.height=height;
		copyLaptop.width=width;
		copyLaptop.screenSize=screenSize;
		copyLaptop.objCPU=new CPU(objCPU.ramSize,objCPU.hddSize,objCPU.noOfProcessors);
		return copyLaptop;
		
	}

	public Laptop(int height, int width, int screenSize, float clockSpeed) {
		super();
		this.height = height;
		this.width = width;
		this.screenSize = screenSize;
		this.clockSpeed = clockSpeed;
		this.objCPU=new CPU(16,1,4);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public float getClockSpeed() {
		return clockSpeed;
	}

	public void setClockSpeed(float clockSpeed) {
		this.clockSpeed = clockSpeed;
	}

}
