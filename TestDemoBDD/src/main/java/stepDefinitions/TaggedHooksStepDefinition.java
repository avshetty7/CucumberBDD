package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Archana Shetty on 26/05/2019.
 */
public class TaggedHooksStepDefinition {

    //Global hook + ordering can be defined
    @Before(order=0)
    public void setUp(){
        System.out.println("launch FF");
        System.out.println("enter url");
    }

    //Global hook
    @After(order=0)
    public void teardown(){
        System.out.println("Close Browser ");
    }

    @Before(order=0)
    public void setUp1(){
        System.out.println("launch FF");
        System.out.println("enter url");
    }

    //Global hook
    @After(order=1)
    public void teardown1(){
        System.out.println("Close Browser ");
    }

    //local hook for @First tag
    @Before("@First")
    public void beforefirst(){
        System.out.println("before only for @First");

    }

    //local hook @First tag
    @After("@First")
    public void afterfirst(){
        System.out.println("after only for @First ");
    }

    //local hook for @Second tag
    @Before("@Second")
    public void beforesecond(){
        System.out.println("before only for @Second");

    }

    //local hook @Second tag
    @After("@Second")
    public void afterSecond(){
        System.out.println("after only for @Second ");
    }
    //local hook for @Third tag
    @Before("@Third")
    public void beforeThird(){
        System.out.println("before only for @Third");

    }

    //local hook @Third tag
    @After("@Third")
    public void afterThird(){
        System.out.println("after only for @Third ");
    }


    @Given("^This is step1$")
    public void this_is_step() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^This is step2$")
    public void this_is_step2() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^This is step3$")
    public void this_is_step(int arg1) throws Throwable {

    }


}
