package week2.day1;
import java.lang.reflect.Array;
import java.util.Arrays;
public class MissingElementsInAArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,4,7,6,8};
Arrays.sort(arr);
for(int i=1;i<arr.length + 1;i++){
	if(i!=arr[i-1]) {
		System.out.println("the missing number is"+i);
		break;
	}
		
}
	}

}
