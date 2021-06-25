package projectWork;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ProjectWork1 {
	    public void testNGAsserts() throws Exception{
	       

	        //To Open with Chrome Driver
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\15148\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();

	        //Test Condition 1: If Page title matches with actualTitle then it finds email title and enters the value which we pass
	        driver.get("http://thedemosite.co.uk/");
	        String actualTitle = "FREE example PHP code and online MySQL database - example username password protected site";
	        String expectedTitle = driver.getTitle();
	        Assert.assertEquals(expectedTitle, actualTitle);
	        System.out.println("TestCase pass");
            //statement if it is correct
           Thread.sleep(1000);
           driver.close(); //to close the driver
	    }
	}