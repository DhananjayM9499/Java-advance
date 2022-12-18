
public class Program {

	public static void main(String[] args) {
		Data objData=new Data();
		
		objData.setMemory(100);
		objData.setStatus(true);
		objData.setValue(15.5f);
		Data.setiStatic(500);
		
		
		objData.display();
	
	
	}

	
}
