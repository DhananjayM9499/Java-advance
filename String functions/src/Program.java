
public class Program {

	public static void main(String[] args)
	{
		Laptop objLaptop = new Laptop(2,15,15,2.0f);
		
		Laptop newLaptop =  objLaptop.clone();
		
		objLaptop.objCPU.hddSize=99;
		
		System.out.println(newLaptop.objCPU.hddSize);

	}

}
