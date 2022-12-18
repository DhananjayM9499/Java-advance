package org.fi.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program
{
	public static void main(String[] args)
	{

		String[] names = { "Dhananjay", "Rutuja", "Amol", "Dhanashree", "Pooja" };

		List<String> listNames = Arrays.asList(names);
		System.out.println("Before sorting the list is");
		System.out.println(listNames);
		System.out.println("******************************");
		Comparator<String>nameCompare=(str1,str2)->str1.compareTo(str2);
		listNames.sort(nameCompare);
		listNames.sort((str1,str2)->str1.compareTo(str2));
		System.out.println("after sorting the list is");
            System.out.println(listNames);
	}
}
