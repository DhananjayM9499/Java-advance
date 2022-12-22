
public  class Data {

	private  int memory;//hidding

	private  float value;
	private boolean status;
	private static int iStatic;

	public  void display() {
		System.out.println(memory);
		System.out.println(value);
		System.out.println(status);
		System.out.println(iStatic);
       
	}
	// Getter/Accessor and Setter/mutator
	public void setMemory(int pMemory) {
	if (pMemory< 0 || pMemory > 5000)
		memory =1;
	else
		memory=pMemory;
	}
	public int getMemory() {
		return memory;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public static int getiStatic() {
		return iStatic;
	}
	public static void setiStatic(int iStatic) {
		Data.iStatic = iStatic;
	}

	
	

}
