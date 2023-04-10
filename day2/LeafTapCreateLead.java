package week2.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapCreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cd=new ChromeDriver();
	cd.manage().window().maximize();
		cd.get("https://leaftaps.com/opentaps/control/login");
		cd.findElement(By.id("username")).sendKeys("DemoCsr");
		cd.findElement(By.id("password")).sendKeys("crmsfa");
		cd.findElement(By.className("decorativesubmit")).click();
		cd.findElement(By.linkText("CRM/SFA")).click();
		cd.findElement(By.linkText("Leads")).click();
		cd.findElement(By.linkText("create Lead")).click();
		cd.findElement(By.id("createLeadForm_companyname")).sendKeys("TestLeaf.org");
		cd.findElement(By.id("createLeadForm_Firstname")).sendKeys("Gayathri Ravi");
		cd.findElement(By.id("createLeadForm_Lastname")).sendKeys("Ravi");
		cd.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gayathriravi017@gmail.com");
		cd.findElement(By.id("createLeadForm_primaryphonenumber")).sendKeys("9952963921");
		cd.findElement(By.name("submitbutton")).click();
		


	}

}
