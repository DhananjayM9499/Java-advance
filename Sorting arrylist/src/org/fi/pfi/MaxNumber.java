package org.fi.pfi;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxNumber
{

	public static void main(String[] args)
	{
		List<Integer> objList = Stream.of(1,2,10,3,5).collect(Collectors.toList());
		Integer maxNumber = objList.stream().max(Comparator.comparing(i -> i)).get();

	    System.out.println("Maximum number is " + maxNumber);
	
	Consumer<List<Integer>> smallest = inputList -> {
		int min = inputList.get(0);
		for (int iTmp = 0; iTmp < inputList.size(); iTmp++)
		{
			if (inputList.get(iTmp) < min)
			{
				min = inputList.get(iTmp);
			}

		}
		System.out.println(inputList);
		System.out.println("\nSmallest No.= " + min);

	};

	smallest.accept(arrList1);
}
}
