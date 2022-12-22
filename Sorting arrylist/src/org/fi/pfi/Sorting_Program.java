package org.fi.pfi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Sorting_Program
{

	public static void main(String[] args)
	{
		
		List<String> name =Arrays.asList(new String[] { "Danny", "Rutuja", "Dhananjay", "Mark", "Zebra" });
		 
		        System.out.println("Unsorted name list : "+ name);
				Comparator<String>sortNames = ((str1, str2) ->str1.compareTo(str2));
				Function<List<String>, List<String>>sortList = inputList ->
				{
					name.sort(sortNames);
					return name;
				};
		 
		        System.out.println("Sorted name list : "+ sortList.apply(name));
		    }
}


