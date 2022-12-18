package org.fi.Transaction;

import java.util.ArrayList;

public class Program
{

	public static void main(String[] args)
	{
     ArrayList<Transaction> arrayList=new ArrayList();
     arrayList.add(new Transaction(101, 5500f, false, true));
     arrayList.add(new Transaction(102, 11500f, true, false));
     arrayList.add(new Transaction(103, 7500f, false, true));
     arrayList.add(new Transaction(104, 1500f, true, true));
     arrayList.add(new Transaction(105, 2500f, false, false));
     System.out.println(arrayList);
     System.out.println("*******************");
     //TransactionFilter filter = originalList ->
     {
    	 
     }

	}

}
