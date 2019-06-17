package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HookStepDefinition {
    WebDriver driver;
    @Before
    public void setUp(){
//
//        System.setProperty("WebDriver.Chrome.driver","C:\\Users\\archana shetty\\Downloads\\chromedriver_win32\\chromedriver.exe")
//        driver= new ChromeDriver();
//        driver.get("www.freecrm.com");
        System.out.println("launch FF");
        System.out.println("enter url");
    }


    @After
    public void teardown(){
        System.out.println("Close Browser ");
        //driver.quit();
    }

    @Given("^User is on deals page$")
    public void user_is_on_deals_page() throws Throwable {
    System.out.println("User is on deals page");

    }

    @When("^user fills the deals form$")
    public void user_fills_the_deals_form() throws Throwable {
        System.out.println("create a deal");

    }

    @Then("^deal is created$")
    public void deal_is_created() throws Throwable {
        System.out.println("Deal created");
    }



}
