package org.fi.in;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Program
{

	public static void main(String[] args)
	{

		ArrayList<Data> arrayList = new ArrayList<>();

		Data objData = new Data("Danny", 22);

		arrayList.add(objData);
		arrayList.add(new Data("Dhanajay", 22));
		arrayList.add(new Data("zutu", 19));
		arrayList.add(new Data("shyam", 54));
		Collections.sort(arrayList);
		Iterator<Data> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Data tmpData = iterator.next();
			System.out.println(tmpData);
		
		}
	}
}