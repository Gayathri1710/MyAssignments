package week3.day2homeassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestList {

	public static void main(String[] args) {
		List<Integer>data=new ArrayList<Integer>();
		data.add(3);
		data.add(2);
		data.add(11);
		data.add(4);
		data.add(6);
		data.add(7);
		 int size = data.size();
		 Collections.sort(data);
		 for(int i = 0; i < size; i++) {
			 
		 }
System.out.println("The second largest number is:"+data.get(size-2));
	}

}
