package automation.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    private WebDriver driver;
    @Given("User in the Login Page Para Bank application")
    public void userInTheLoginPageParaBankApplication() {

        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://parabank.parasoft.com/parabank/index.htm");

    }

    @When("User enter valid credentials")
    public void userEnterValidCredentials() {
        driver.findElement(By.name("username")).sendKeys("testerram");
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.xpath("//input[@class='button']")).click();
        //driver.findElement(By.xpath("//input[@class='button']")).


    }

    @Then("User should be on Welcome page of the application")
    public void userShouldBeOnWelcomePageOfTheApplication() throws InterruptedException {
    Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[@class='title']")).isDisplayed();
        String message = driver.findElement(By.xpath("//h1[@class='title']")).getText();
        System.out.println("Title displayed :" + message);
       // Assert.assertTrue();
    }
}
