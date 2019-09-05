package Casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ashmvn1.drivers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CASE33 {

	
	WebDriver driver;
	//public void launching_the_app() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		//<a href="/register" class="ico-register">Register</a>
		
		
		
		
		@Given("Application is lauched by the guest user")
		public void application_is_lauched_by_the_guest_user() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
			
			driver=drivers.configureDriver("chrome");
			driver.manage().window().maximize();
			driver.get("http://demowebshop.tricentis.com/");
			
		}

		@When("User clicks on register link in the page")
		public void user_clicks_on_register_link_in_the_page() {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new cucumber.api.PendingException();
			driver.findElement(By.xpath("//a[@href='/register']")).click();
		}
/*
		@When("user provides required data and submits the daata")
		public void user_provides_required_data_and_submits_the_daata() {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new cucumber.api.PendingException();
			
			driver.findElement(By.id("gender-female")).click();
			driver.findElement(By.id("FirstName")).sendKeys("suma1");
			driver.findElement(By.id("LastName")).sendKeys("uddan1");
			driver.findElement(By.id("Email")).sendKeys("sumauddan@gmail11111.com");
			driver.findElement(By.id("Password")).sendKeys("123456");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
			driver.findElement(By.id("register-button")).click();
			
		}

		@Then("user logout from the demowebapp")
		public void user_logout_from_the_demowebapp() {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new cucumber.api.PendingException();
			driver.findElement(By.xpath("//a[@href='/logout']")).click();
			driver.findElement(By.xpath("//a[@href='/login']")).click();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ash1@gmail.com");
			   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password123");
			   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("diamond");
			   
			   driver.findElement(By.xpath("//input[@type='submit']")).click();
			   driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		}

		@Given("click on login link")
		public void click_on_login_link() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
			
			
		}
	}
	*/




/*
@When("enter gender {string} firstname {string} lastname {string} email {string} password {string} confirm password {string}")
public void enter_gender_firstname_lastname_email_password_confirm_password(String string, String string2, String string3, String string4, String string5, String string6) {
    // Write code here that turns the phrase above into concrete actions
  //  throw new cucumber.api.PendingException();
	
	
	
}
*/
		@When("enter  firstname {string} lastname {string} email {string} password {string} confirm password {string}")
		public void enter_firstname_lastname_email_password_confirm_password(String string, String string2, String string3, String string4, String string5) {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
			
			
			driver.findElement(By.id("gender-female")).click();
			driver.findElement(By.id("FirstName")).sendKeys(string);
			driver.findElement(By.id("LastName")).sendKeys(string2);
			driver.findElement(By.id("Email")).sendKeys(string3);
			driver.findElement(By.id("Password")).sendKeys(string4);
			driver.findElement(By.id("ConfirmPassword")).sendKeys(string5);
			driver.findElement(By.id("register-button")).click();
			
		}


@Then("user logout from the demowebapp")
public void user_logout_from_the_demowebapp() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//a[@href='/logout']")).click();
	driver.findElement(By.xpath("//a[@href='/login']")).click();
}

@Given("click on login link")
public void click_on_login_link() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	
}

@Then("enter username {string} password {string}")
public void enter_username_password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(string);
	   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(string2);
}

@Given("search items to be added to he cart")
public void search_items_to_be_added_to_he_cart() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new cucumber.api.PendingException();
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("diamond");
	   
	   
	   
}

@Then("click on search item")
public void click_on_search_item() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}

@Then("add the item to cart")
public void add_the_item_to_cart() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
}


}






















