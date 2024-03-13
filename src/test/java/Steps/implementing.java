package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class implementing {
	
	WebDriver driver;
	
	@Given("user opens chrome browser and enters simpleform url")
	public void user_opens_chrome_browser_and_enters_simpleform_url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAN\\Documents\\Selenium Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://v1.training-support.net/selenium/simple-form");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Given("textbox should be Enabled or Not")
	public void textbox_should_be_enabled_or_not() {
		
		driver.findElement(By.id("firstName")).isEnabled();
		
	}

	@When("user can enter text in this fields firstname, lastname, Emailid, mobileno, textbox")
	public void user_can_enter_text_in_this_fields_firstname_lastname_emailid_mobileno_textbox() {
		
		driver.findElement(By.id("firstName")).sendKeys("saran");
		driver.findElement(By.id("lastName")).sendKeys("kumar");
		driver.findElement(By.id("email")).sendKeys("kumar@gmail.com");
		driver.findElement(By.id("number")).sendKeys("9876543210");
		driver.findElement(By.xpath("//textarea")).sendKeys("we are doing smoke testing");
	}

	@When("after entering valid_datas user can ablle to click a submit button")
	public void after_entering_valid_datas_user_can_ablle_to_click_a_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

	@Then("user can able to see pop window is display or not")
	public void user_can_able_to_see_pop_window_is_display_or_not() {
		
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    //driver.quit();
	}


}
