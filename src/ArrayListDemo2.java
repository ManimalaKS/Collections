import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		ArrayList ad=new ArrayList();
		ad.addAll(al);
		//System.out.println(ad);
		al.removeAll(al);
		System.out.print(al);
		ad.removeAll(ad);
		System.out.print(ad);
		ArrayList arr=new ArrayList();
		arr.add(1);
		arr.add(1231);
		arr.add(12311);
		arr.add(1231111);
		arr.add(12322);
		// Ascending Order
		Collections.sort(arr);
		System.out.print(arr);//[1, 1231, 12311, 12322, 1231111]
		//Descending Order 
		Collections.sort(arr, Collections.reverseOrder());
		System.out.print(arr); //[1231111, 12322, 12311, 1231, 1]
		Collections.shuffle(arr);
		System.out.print(arr); //[1231, 1231111, 12311, 12322, 1]
	}

}
