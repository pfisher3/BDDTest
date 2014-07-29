package stepdefs.test;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.matchers.JUnitMatchers.containsString;

/**
 * Created with IntelliJ IDEA.
 * User: pfisher
 * To change this template use File | Settings | File Templates.
 */
public class amazonHome {
    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Given("^I Navigates to Amazon$")
    public void I_Navigates_to_Amazon() throws Throwable {
        driver.get("http://amazon.com");

    }
    @And("^I query for \"([^\"]*)\"$")
    public void I_query_for(String searchQuery) throws Throwable {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchQuery);
    }


    @When("^I click to search icon$")
    public void I_click_to_search() throws Throwable {
        driver.findElement(By.className("nav-submit-input")).click();
    }

    @Then("^I will be viewing \"([^\"]*)\"$")
    public void will_be_displayed(String message) throws Throwable {
        String actualTitle = driver.getTitle();
        Assert.assertThat(actualTitle, containsString(message));

    }




    @After
    public void teadDown(){
        driver.close();
    }



}
