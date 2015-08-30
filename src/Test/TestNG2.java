package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterTest;

public class TestNG2 {
  @Test
  public void first() {
	  System.out.println("Print 2");
  }
  @Test
  public void Second() {
System.out.println("Print 3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Print 1");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("Print 4");
  }

}
