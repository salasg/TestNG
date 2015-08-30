package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterTest;

public class TestNG3 {
	
	
  @Test(priority=1)
  
public void Registration() throws Exception {
	  System.out.println("Customer Registration");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://webloadmpstore.com/");
	//  long currentTime = System.currentTimeMillis();
	    driver.findElement(By.linkText("LOGIN")).click();
	    driver.findElement(By.linkText("Register")).click();
	    driver.findElement(By.cssSelector("input[name=\"name\"]")).clear();
	    driver.findElement(By.cssSelector("input[name=\"name\"]")).sendKeys("gio100");
	    driver.findElement(By.cssSelector("input[name=\"email\"]")).clear();
	    driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("gio561@aol.com");
	    driver.findElement(By.name("phone")).clear();
	    driver.findElement(By.name("phone")).sendKeys("9735610074");
	    driver.findElement(By.name("login")).clear();
	    driver.findElement(By.name("login")).sendKeys("gio100");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("gio123");
	    driver.findElement(By.name("password2")).clear();
	    driver.findElement(By.name("password2")).sendKeys("gio123");
	    driver.findElement(By.name("Submit")).click();
	    Thread.sleep(3000);
	    driver.quit();
	    
  }
   @Test(priority=2)
  
public void Login() throws Exception {
	 System.out.println("Customer Log in");
	 WebDriver driver = new FirefoxDriver();
	  driver.get("http://webloadmpstore.com/");
	  driver.findElement(By.linkText("LOGIN")).click();
	 driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[2]/td[2]/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[2]/td[2]/input")).sendKeys("gio100");
	 driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[3]/td[2]/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[3]/td[2]/input")).sendKeys("gio123");
	 driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[6]/td/input")).click();
	 Thread.sleep(2000);
	 driver.quit();
	 
	    
  }
 @Test(priority = 3)
 
public void Demos() throws Exception {
	 System.out.println("Customer browse Demos Page");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://webloadmpstore.com/");
	  driver.findElement(By.linkText("Demos")).click();
	  driver.findElement(By.linkText("Debugging and Handling Dynamic Data")).click();
	  driver.findElement(By.xpath("//img[contains(@src,'http://www.webloadmpstore.com/media/images/products/sm_1.jpg')]")).click();
	  driver.findElement(By.xpath("//tr[4]/td/a/img")).click();
	  driver.findElement(By.linkText("Checkout>>")).click();
	  Thread.sleep(2000);
	  driver.quit();
	 
 }
 @Test(priority = 4)
 
public void Whitepapers() throws Exception {
	 System.out.println("Customer browse WhitePapers Page");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://webloadmpstore.com/");
	  driver.findElement(By.linkText("Whitepapers")).click();
	  driver.findElement(By.linkText("Best Practices and Methodologies for Increasing Confidence")).click();
	  driver.findElement(By.linkText("click to enlarge")).click();
	  driver.findElement(By.xpath("//tr[4]/td/a/img")).click();
	  // Please add to cart line here.
	  driver.findElement(By.linkText("Checkout>>")).click();
	  Thread.sleep(2000);
	  driver.quit();
 }
@Test(priority =5)
 
public void Manuals() throws Exception {
	 System.out.println("Customer browse Manuals Page");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://webloadmpstore.com/");
	  driver.findElement(By.linkText("Manuals")).click();
	  driver.findElement(By.linkText("WebLOAD Console User's Guide")).click();
	  driver.findElement(By.xpath("//img[contains(@src,'http://www.webloadmpstore.com/media/images/products/sm_2.jpg')]")).click();
	  driver.findElement(By.xpath("//tr[4]/td/a/img")).click();
	  driver.findElement(By.linkText("Checkout>>")).click();
	  Thread.sleep(2000);
	  driver.quit();
 }
 @Test(priority =6)
 
public void Webinars() throws Exception {
	 System.out.println("Customer browse Webniars Page");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://webloadmpstore.com/");
	  driver.findElement(By.linkText("Webinars")).click();
	  driver.findElement(By.linkText("Contrasting Black Box and White Box Performance Testing")).click();
	  driver.findElement(By.linkText("click to enlarge")).click();
	  driver.findElement(By.xpath("//tr[4]/td/a/img")).click();
	  driver.findElement(By.linkText("Checkout>>")).click();
	  Thread.sleep(2000);
	  driver.quit();
 }

 @BeforeTest
 public void beforeMethod()
 {
	 WebDriver driver = new FirefoxDriver();
	  driver.get("http://webloadmpstore.com/");
 }
 /*
  @BeforeMethod
public void beforeMethod(){
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://webloadmpstore.com/");
  }
  */
  
  @AfterTest
public void afterTest() {
  }

}
