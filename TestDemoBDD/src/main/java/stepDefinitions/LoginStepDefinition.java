package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.prefs.Preferences;

public class LoginStepDefinition {
          WebDriver driver;
//     @Given("^User is already on login page$")
//     public void User_is_already_on_login_page() {
//        System.setProperty("webdriver.chrome.driver","C:/Users/archana shetty/Downloads/chromedriver_win32/chromedriver.exe");
//           driver = new ChromeDriver();
//        driver.get("https://classic.crmpro.com/login.cfm");
//     }

//     @When("^Title of login page is free CRM$")
//   public void Title_of_login_page_is_free_CRM() {
//        String title = driver.getTitle();
//        System.out.println("Title of the page: " + title);
//        Assert.assertEquals("CRMPRO Log In Screen",title);
//       // Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.",title);
//     }

    //With Hard code values
//     @And("^User enters username and password$")
//    public void User_enters_Username_and_password() {
//        driver.findElement(By.name("username")).sendKeys("cucumber11");
//        driver.findElement(By.name("password")).sendKeys("test123");


    //With Examples and Without Examples keyword
    // 1. "(.*)"


//    @And("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
//       public void User_enters_Username_and_password(String un, String pwd) {
//       driver.findElement(By.name("username")).sendKeys(un);
//       driver.findElement(By.name("password")).sendKeys(pwd);
//   }
//
//
//    @Then("^user clicks on Login Button$")
//            public void user_clicks_on_Login_Button(){
//       WebElement loginBtn= driver.findElement(By.xpath("//input[@type='submit']"));
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
////       JavascriptExecutor js= (JavascriptExecutor)driver;
////       js.executeScript("argument[0].click();",loginBtn);
//   }

//    @Then("^user is on home page$")
//    public void user_is_on_home_page(){
//                String title= driver.getTitle();
//                System.out.println("\nHomepage Title is: "+title);
//                Assert.assertEquals("CRMPRO",title);
//    }
//
//    @When("^User is on new contact page$")
//    public void user_is_on_new_contact_page() {
//        driver.switchTo().frame("mainpanel");
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//        driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//    }


//    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//    public void user_enters_firstname_lastname_position(String FN, String LN, String position){
//        driver.findElement(By.id("first_name")).sendKeys(FN);
//        driver.findElement(By.id("surname")).sendKeys(LN);
//        driver.findElement(By.id("company_position")).sendKeys(position);
//    }
//
//
//    @Then("^click on save button$")
//    public void click_on_save_button() {
//        driver.findElement(By.xpath("//input[@type='submit' and @value ='Save']")).click();
//    }

//    @Then("^close the Browser$")
//    public void  close_the_Browser(){
//        driver.quit();
//    }


}


