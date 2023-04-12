package week3.day2homeassignment;

public class Automation extends MultipleLanguage{


public void java() {
		System.out.println("learning java course");
		
	}

	public void Selenium() {
		System.out.println("java using selenium tool");
		
	}
public void ruby() {
	System.out.println("ruby is java related");
}
public static void main(String[] args) {
	Automation auto = new Automation();
	auto.java();
	auto.python();
	auto.ruby();
	auto.Selenium();
}
}