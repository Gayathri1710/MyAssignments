package week3.day1;

public class Calculator {
public int add(int a, int b) {
	return a+b;
}
public void add() {
	int a = 17, b =10 , c ;
	System.out.println(c =a+b);
}
public void mul() {
	int a =10;
	double b =15;
	System.out.println(a*b);
}

public double mul(double a, double b) {
	return a*b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		System.out.println(cal.add(12, 24));
		cal.add();
		cal.mul();
System.out.println(cal.mul(25, 10));
	}

}
