package projectWork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class ProjectWork2 {
	    @BeforeClass
	    void setUpClass() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\15148\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    // beforeclass action to link the driver
	    }
	    @Test
	    public void imagess() throws InterruptedException {
	        ChromeDriver driver =new ChromeDriver();

	        driver.get("http://thedemosite.co.uk/");
	        List<WebElement> listImages = driver.findElements(By.tagName("img"));
	        //creating the list for getting the number of elements
	        int figures = 0; //variable to count the images
	        for (WebElement image : listImages) { //loop
	            if ( image.isDisplayed()) { //condition for images
	                figures++;    //increment
	            }
	        }
	        System.out.println("No. of total displayed images: " + figures);
	        driver.close();
	    }
	    @Test
	    //this test is same as above just a tag is changed i.e. for buttons
	    public void buttons() throws InterruptedException {
	        ChromeDriver driver =new ChromeDriver();

	        driver.get("http://thedemosite.co.uk/");
	        List<WebElement> listButtons = driver.findElements(By.tagName("button"));

	        int counts = 0;
	        for (WebElement button : listButtons) {
	            if(button.getText().equals("buttonName")) {
	                counts++;
	            }
	        }
	        System.out.println("No. of total displyed buttons: " + counts);

	        driver.close();
	    }



	}
