package week3.day1;

public class BankingInfo extends AxisBank {
	public void saving() {
		System.out.println("the interest rate for the saving is 6%");
	}
public void fixed() {
	System.out.println("the interest rate for the fixed is 7%");
}
public void deposit() {
	System.out.println("the interest rate for the deposit is 7.1%");
}
	public static void main(String[] args) {
	
BankingInfo obj=new BankingInfo();
obj.deposit();
	}

}
