package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.HRM.generic.fileutility.propertyfileutility;

public class loginhrm {
	@Test(groups="smoketest")
	public void Demo() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		propertyfileutility p = new propertyfileutility();

		String Url = p.getdatafromproperties("URL");
		String browser = p.getdatafromproperties("BROWSER");
		System.out.println(browser);
	String Uname = p.getdatafromproperties("USERNAME");
		String Pwd = p.getdatafromproperties("PASSWORD");
		driver.get(Url);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Uname);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
	@Test()
	public void Demo1()
	{
		System.out.println("Hello testng");
	}
}
