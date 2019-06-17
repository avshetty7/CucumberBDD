package stepDefinitions;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DealStepDefinition {
    WebDriver driver;
//    @Given("^User is already on login page$")
//    public void User_is_already_on_login_page() {
//        System.setProperty("webdriver.chrome.driver","C:/Users/archana shetty/Downloads/chromedriver_win32/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://classic.crmpro.com/login.cfm");
//    }
//    @When("^Title of login page is free CRM$")
//    public void Title_of_login_page_is_free_CRM() {
//        String title = driver.getTitle();
//        System.out.println("Title of the page: " + title);
//        Assert.assertEquals("CRMPRO Log In Screen",title);
//        // Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.",title);
//    }
//
//    @And("^User enters username and password$")
//    public void User_enters_Username_and_password(DataTable credentials) {
//        List<List<String>> data = credentials.raw();
//        driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//        driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//    }
//    @Then("^user clicks on Login Button$")
//    public void user_clicks_on_Login_Button(){
//        WebElement loginBtn= driver.findElement(By.xpath("//input[@type='submit']"));
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
////       JavascriptExecutor js= (JavascriptExecutor)driver;
////       js.executeScript("argument[0].click();",loginBtn);
//    }
//
//    @Then("^user is on home page$")
//    public void user_is_on_home_page(){
//        String title= driver.getTitle();
//        System.out.println("\nHomepage Title is: "+title);
//        Assert.assertEquals("CRMPRO",title);
//    }
//    @When("^User moves to deals page$")
//    public void user_is_on_new_contact_page() {
//        driver.switchTo().frame("mainpanel");
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//        driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//    }
//
//    @When("^user enters deals details$")
//    public void user_enters_deals_details(DataTable dealsData){
//        List<List<String>> dealValue = dealsData.raw();
//        driver.findElement(By.id("title")).sendKeys(dealValue.get(0).get(0));
//        driver.findElement(By.id("amount")).sendKeys((dealValue.get(0).get(1)));
//        driver.findElement(By.id("probability")).sendKeys(dealValue.get(0).get(2));
//        driver.findElement(By.id("commission")).sendKeys((dealValue.get(0).get(3)));
//
//    }
//
//        @Then("^click on save button$")
//    public void click_on_save_button() {
//        driver.findElement(By.xpath("//input[@type='submit' and @value ='Save']")).click();
//    }
//
//    @Then("^close the Browser$")
//    public void  close_the_Browser(){
//        driver.quit();
//    }




}
