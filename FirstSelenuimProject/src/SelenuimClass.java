import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenuimClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/home/masoud/eclipse-workspace/chromedriver");
		WebDriver driver=new ChromeDriver();  
		driver.get("http://demo-store.seleniumacademy.com/");
		Thread.sleep(10000);
		
		WebElement searchBox = driver.findElement(By.xpath("/html/body/div/div[2]/header/div/div[4]/form/div[1]/input"));
		searchBox.sendKeys("Phone");
		WebElement searchButton = driver.findElement(By.xpath("/html/body/div/div[2]/header/div/div[4]/form/div[1]/button[1]"));
		searchButton.click();
		Thread.sleep(10000);
		driver.quit();
		
	}

}
