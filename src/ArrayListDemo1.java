import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("101");
		al.add("Manimala");
		al.add("Al-C");
		al.add(10297.77);
		al.add(true);
		System.out.println(al);
		//Size of all elements in the ArrayList
		System.out.println("size is" +  al.size());
		al.remove(3);
		System.out.println("after removing the element" + al);
		al.add(2,"welcome");
		System.out.println(al);
		System.out.println(al.get(2));
		al.set(1, "Saro");
		System.out.println(al);
		//Searching
		boolean b=al.contains(false);
		System.out.print(b);
		boolean f=al.isEmpty();
		System.out.println(f);
		//Reading data using for loop
		/*System.out.println("Reading values using for loop");
		int total=al.size();
		for(int i=0;i<total;i++)
		{
			System.out.println(al.get(i));
		}*/
		/*System.out.println("Reading values using for - each  loop");
		for(Object e:al)
		{
			System.out.println(e);
		}
		*/
		System.out.println("Reading values using iterator method");
		Iterator it =al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
