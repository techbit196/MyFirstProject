package Pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {
    LoginPage loginPage;
    WebDriver driver = null;

    @Given("User is on homepage")
    public void user_is_on_homepage()throws Throwable {
        loginPage.openBrowser();
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    @Given("Login as admin")
    public void login_as_admin() {
    }
    @Then("User navigate to dashboard")
    public void user_navigate_to_dashboard() {
    }


}
