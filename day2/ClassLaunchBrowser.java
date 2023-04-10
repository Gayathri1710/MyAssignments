package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://login.salesforce.com/");
driver.manage().window().maximize();
Thread.sleep(7000);
driver.close();
	}

}
