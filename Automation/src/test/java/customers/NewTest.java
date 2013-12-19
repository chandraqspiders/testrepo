package customers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("This runs");
	  //code goes here
	  WebDriver driver = new FirefoxDriver();	  
  }
}
