import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Program//Q1
{

	public static void main(String[] args)
	{
		ArrayList<String> arrayList=new ArrayList<>();
		ArrayList<String> arrayList1=new ArrayList<>();
		
		arrayList.add("Blue");
		arrayList.add("Black");
		arrayList.add("Pink");
		arrayList.add("Yellow");
		arrayList.add("Red");
		//arrayList.add(0, "Golden");//Q2
	//arrayList.set(0, "silver");//Q4
		//arrayList.remove(3);//Q5
		Collections.sort(arrayList);//Q7
		System.out.println(arrayList);
		int index=Collections.binarySearch(arrayList, "yellow",Collections.reverseOrder());//Q6
		//Collections.copy(arrayList1,arrayList);//Q8 shows Error
		Collections.shuffle(arrayList);//Q9
		Collections.reverse(arrayList);//Q10
		Iterator<String> iterator= arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		System.out.println(index);
		System.out.println(arrayList.get(2));//Q3
		
		

	}

}
