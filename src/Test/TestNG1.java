package Test; 

import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TestNG1 {
  @Test
  
  public void first() {
	  System.out.println("This is the first test case");
  }
  @Test
  public void second() {
	  System.out.println("This is the second test case");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This prints first");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This prints after test");
  }

}
