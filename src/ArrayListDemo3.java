import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		String arr[]= {"dog", "cat", "monkey"};
		for(String value:arr)
		{
			System.out.println(value);
		}
		//Converting array to ArrayList
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);
	}

}
