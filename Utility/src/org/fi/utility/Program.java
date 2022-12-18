package org.fi.utility;

public class Program {

	public static void main(String[] args) 
	{
	LinkedList objList=new LinkedList();
	objList.add("First");
	objList.add("Second");
	objList.add("Third");
	objList.add("Fourth");
	objList.add("Fifth");
	
	objList.remove(4);
	String str = (String) objList.getFirst();
	while(str!=null) {
		System.out.println(str);
		str=(String)objList.getNext();
	}

	}

}
