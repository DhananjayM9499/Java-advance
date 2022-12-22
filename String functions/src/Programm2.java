
public class Programm2 {

	public static void main(String[] args) {
		String str1="Hello"+"Bye"+"Hello"+"Bye";
		
		StringBuffer buffer=new StringBuffer("Hello");
		buffer.append("Bye");
		buffer.append("Hello");		
		
		buffer.append("Bye");
		buffer.append("Hello");	
		
		buffer.append("Bye");
		buffer.append("Hello");	
		
		String str = buffer.toString();
		System.out.println(str);
	

	}

}
