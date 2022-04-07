package examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class Steprunner {
	WebDriver driver;
	public String URL = "https://demoapp.skillrary.com/login.php?type=login"; 

	@Given("open browser navigate to the login page")
	public void open_browser_navigate_to_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
	}
	@When("Enter username {string}")
	public void enter_username(String user) {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(user);
	    
	}
	@When("Enter password {string}")
	public void enter_password(String pwd) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pwd);
	}
	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//*[@id='last']")).click();
	}
	@Then("I should see username as {string}")
	public void i_should_see_username_as(String username) {
		if(username=="Harry Den") {
		WebElement ch =driver.findElement(By.partialLinkText("Harry Den"));
	    Assert.assertEquals(username, ch.getText());
	    System.out.println("user");
		}
		else if(username=="SkillRary Admin") {
			WebElement ch =driver.findElement(By.partialLinkText("SkillRary Admin"));
			Assert.assertEquals(username, ch.getText());
		}
	}

//	@Then("I should see usernames as {string}")
//	public void i_should_see_usernames_as(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//		WebElement ch =driver.findElement(By.partialLinkText("SkillRary Admin"));
//	    Assert.assertEquals(string, ch.getText());
//	}
	@Then("I should navigate to the page {string}")
	public void i_should_navigate_to_the_page(String string) {
		 Assert.assertEquals(string,driver.getTitle());
	}



	}
