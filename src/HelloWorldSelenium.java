import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {

	public static void main(String[] args) {
		//Set property
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// Invoking browser
		WebDriver driver = new ChromeDriver();
		// Loads a new URL in the browser
		driver.get("http://www.google.com");
		
		// Gets the search input text
        WebElement queryInput = driver.findElement(By.name("q"));
        
        // Sets the text to the value of the URL
        queryInput.sendKeys(driver.getCurrentUrl());
        
        // 2 secs pause
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // Gets the search button
        WebElement btnSearch = driver.findElement(By.name("btnK"));
        btnSearch.click();
	}

}
