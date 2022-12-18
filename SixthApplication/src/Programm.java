
public class Programm {

	public static void main(String[] args) {
		String str1="Hello";
		
		String str2="Hello";

		String str3="hello";

		String str4=new String("Hello");
		
		System.out.println("Str1 "+str1);
		System.out.println("Str2 "+str2);
		
		if(str1==str2)
			System.out.println("str1=str2");
		else
			System.out.println("str1!=str2");
		
		if(str1.equalsIgnoreCase(str3))
			System.out.println("str1=str3");
		else
			System.out.println("str1!=str3");
		
		if(str1.equals(str4))
			System.out.println("str=str4");
		else
			System.out.println("str1!=str4");




		

	}

}
