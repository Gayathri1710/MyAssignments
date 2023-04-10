package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LeafTapUpdateCompanyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver ed =new EdgeDriver();
		ed.manage().window().maximize();
			ed.get("https://leaftaps.com/opentaps/control/login");
			ed.findElement(By.id("username")).sendKeys("DemoCsr");
			ed.findElement(By.id("password")).sendKeys("crmsfa");
			ed.findElement(By.className("decorativesubmit")).click();
			ed.findElement(By.linkText("CRM/SFA")).click();
			ed.findElement(By.linkText("Leads")).click();
			ed.findElement(By.linkText("create Lead")).click();
			ed.findElement(By.id("createLeadForm_companyname")).sendKeys("TestLeaf.org");
			ed.findElement(By.id("createLeadForm_Firstname")).sendKeys("Gayathri Ravi");
			ed.findElement(By.id("createLeadForm_Lastname")).sendKeys("Ravi");
			ed.findElement(By.name("submitbutton")).click();
			ed.findElement(By.linkText("Edit")).click();
			WebElement Update =ed.findElement(By.id("updateLeadForm_companyName"));
			Update.clear();
			Update.sendKeys("org.TestLeaf");
			//ed.findElement(By.id("updateLeadForm_companyName")).sendkeys("org.TestLeaf");
			ed.findElement(By.name("submitButton")).click();
					
			


		}

	}

	


