package week3.day2homeassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementinAnArray {

	public static void main(String[] args) {
	List<Integer>missing=new ArrayList<Integer>();
	missing.add(1);
	missing.add(2);
	missing.add(3);
	missing.add(4);
	missing.add(7);
	missing.add(6);
	missing.add(8);
	int size = missing.size();
	Collections.sort(missing);
	for(int i = 0; i < size; i++) {
		int j = i+1;
		if(missing.get(i)!=j) {
			System.out.println("missing element is :"+j);
			break;
		}
	}

	}

}
