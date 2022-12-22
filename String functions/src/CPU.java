
public class CPU {
	int ramSize;
	int hddSize;
	int noOfProcessors;
	
	
	public CPU() {
		
	}
	
	public CPU (int ramSize, int hddSize, int noOfProcessors) {
		super();
		this.ramSize=ramSize;
		this.hddSize=hddSize;
		this.noOfProcessors=noOfProcessors;
	}


	public int getRamSize() {
		return ramSize;
	}


	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}


	public int getHddSize() {
		return hddSize;
	}


	public void setHddSize(int hddSize) {
		this.hddSize = hddSize;
	}


	public int getNoOfProcessors() {
		return noOfProcessors;
	}


	public void setNoOfProcessor(int noOfProcessors) {
		this.noOfProcessors = noOfProcessors;
	}

}
