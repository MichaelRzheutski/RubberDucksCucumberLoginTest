package stepdefs;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginStepdefs {
    @When("user types {string} in email field")
    public void user_types_in_email_field(String email) {
        $(By.name("email")).sendKeys(email);
    }

    @When("user types {string} in password field")
    public void user_types_in_password_field(String password) {
        $(By.name("password")).sendKeys(password);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        $(By.name("login")).click();
    }

    @Then("the {string} message appears")
    public void the_message_appears(String message) {
        $(By.id("notices")).shouldHave(Condition.text(message));
    }
}
