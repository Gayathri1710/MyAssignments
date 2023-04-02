package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       int firstnumber=1,secondnumber=1,seriesnumber=10;
       int thirdnumber;
       System.out.println("the fibonacci series of given number is:");
       System.out.println(firstnumber+"\n"+secondnumber);
       for(int i=3;i<=seriesnumber;i++) {
	thirdnumber=firstnumber+secondnumber;
	System.out.println("thirdnumber");
	firstnumber=secondnumber;
	secondnumber=thirdnumber;
}
 	}
}

