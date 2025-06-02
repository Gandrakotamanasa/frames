package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.HRM.generic.fileutility.excelfileutility;
import com.HRM.generic.fileutility.propertyfileutility;
import com.HRM.generic.javautility.Javautility;
import com.HRM.generic.webdriverutility.Webdriverutility;



public class leavetest  {
	@Test()
	public void Demo1() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Webdriverutility wu=new Webdriverutility();
		Javautility j=new Javautility();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wu.waitforpagetoload(driver);
		
		//propertyfileutility
		propertyfileutility p=new propertyfileutility();
	   String Url=p.getdatafromproperties("URL");
	  String browser=p.getdatafromproperties("BROWSER");
	  System.out.println(browser);
	  String Uname=p.getdatafromproperties("USERNAME");
	  String Pwd=p.getdatafromproperties("PASSWORD");
	  driver.get(Url);
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Uname);
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Pwd);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	//WebDrivver Utility
		WebElement element=driver.findElement(By.xpath("//a[text()='Leave Type']"));
		wu.mousemoveonelement(driver,element);
		/*Actions obj=new Actions(driver);
		obj.moveToElement(e).click().perform();*/
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Add Leave Type']")).click();

		
		//Excel Utility
		excelfileutility E=new excelfileutility();
	    String sh=E.getdatafromexcel("ALeave",1,0);
	    String sh1=E.getdatafromexcel("ALeave",1,1);
	     int count=E.getrowcount("ALeave");
	    System.out.println(count);
	    String sh2=E.setdataintoexcel("ALeave",1,2,"Manasa");
	    System.out.println(sh2);
	    System.out.println(j.getrandomnumber());


	     driver.findElement(By.xpath("//input[@id='leavetype']")).sendKeys(sh);
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(sh1);
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//button[@name='add']")).click();

				
	}
}
