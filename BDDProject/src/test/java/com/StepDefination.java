package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefination {
	WebDriver dr;
	
	@Given("^open browser$")
    public void open_browser() throws Throwable {
      dr= new ChromeDriver();
      System.setProperty("webdriver.chrome.driver", "/Users/sanchitapodder/Downloads/chromedriver");
      
    }

    @Given("^go to home page$")
    public void go_to_homepage() throws Throwable {
      dr.get("https://www.facebook.com");  
    }

    @When("^type email in user text box$")
    public void user_put_username() throws Throwable {
      dr.findElement(By.id("email")).sendKeys("my email");
    }

    @When("^type pass in password text box$")
    public void user_type_password() throws Throwable {
    	 dr.findElement(By.id("pass")).sendKeys("my pass"); 
    }

    @When("^click on login button$")
    public void user_click_on_submit() throws Throwable {
    	dr.findElement(By.id("")).click();
        
    }

    @Then("^user should be in his profile page$")
    public void user_inside_the_profile() throws Throwable {
    	Assert.assertTrue(dr.findElement(By.xpath("dfdg")).isDisplayed());
       
    }

}
