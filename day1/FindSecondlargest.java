package week2.day1;
import java.util.Arrays;
public class FindSecondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] data= {3,2,11,4,6,7,8};
Arrays.sort(data);
int num=data.length;
System.out.println("second largest number:"+data[num - 2]);
	}

}
