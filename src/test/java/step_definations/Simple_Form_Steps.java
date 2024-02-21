package step_definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple_Form_Steps {

	WebDriver driver;
	@Given("User opens the browser and navigate to basictraining form website")
	public void user_opens_the_browser_and_navigate_to_basictraining_form_website() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://v1.training-support.net/selenium/simple-form");
		driver.manage().window().maximize();
	}

	@When("User Enters First name,Last name,Email")
	public void user_enters_first_name_last_name_email() {
		driver.findElement(By.id("firstName")).sendKeys("Test");
        driver.findElement(By.id("lastName")).sendKeys("User");
        driver.findElement(By.id("email")).sendKeys("Test_User@gmail.com");
	   
	}

	@When("User enters a Contact Number and Message")
	public void user_enters_a_contact_number_and_message() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("number")).sendKeys("7878784422");
	    driver.findElement(By.xpath("//div[@class='field']//textarea")).sendKeys("Test Message");

	}

	@When("User click on Submit")
	public void user_click_on_submit() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@value='submit']")).click();
	}

	@Then("Confirmation pop-up will displayed.")
	public void confirmation_pop_up_will_displayed() {
	    System.out.println("Script executed sucessfully");
	   
	}

	

}
