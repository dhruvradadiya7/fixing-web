
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownPrec {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\testing\\chromedriver.exe");
		
		//Initiating your chrome driver
		WebDriver driver = new ChromeDriver();
		
		//open browser with desired URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		Select deprCity = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']")));
		deprCity.selectByIndex(1);
		deprCity.selectByValue("ATQ");
		Select arrivCity = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_destinationStation1']")));
		arrivCity.selectByIndex(10);
		arrivCity.selectByValue("AMD");
		
		WebElement departDate = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		departDate.sendKeys("2810");
		
		//Select numOfPass = new Select(driver.findElement(By.xpath("//div[@id='divpaxinfo']")));
		//numOfPass.selectByIndex(0);
		//WebElement plusNum = driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
		//plusNum.click();
		
		Select currency = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		currency.selectByIndex(2);
		

		Thread.sleep(3000);
		driver.quit();
	}

}
