package stepDefinitions;
 

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
WebDriver driver;

public class Steps {
@Given("^I am on the Discovery Search page$")
public void launch_discovery_website() throws Throwable
{
System.out.println("This Step open the chrome and launch the application.");
driver = new chromeDriver();
driver.get("https://discovery.com/")
}
 
@When("^I select a video and add it to the favourite list$")
public void select_and_add_a_video_to_the_favourite_list() throws Throwable
{
System.out.println("This step selects a video and adds it to the favourite.");
driver.get("https://go.discovery.com/tv-shows/contact/")
driver.findElement(By.className('my-favorites-button-container')).click();
}
 
@Then("^Go to the My Videos Page$")
public void go_to_my_videos_page() throws Throwable
{
System.out.println("This page goes to myVideo page");
driver.get("https://go.discovery.com/my-videos")
}

@Then("^I should see correct video title and description$")
public void correct_titel_and_description() throws Throwable
{
System.out.println("This shows the correct titel and description");
driver.findElement(By.id("xggw4p-0"));
Assert.assertEquals("Contact",title);
Assert.assertEquals("In this first-of-its-kind global investigation series, an international task force led by the United States",description)
}
}
