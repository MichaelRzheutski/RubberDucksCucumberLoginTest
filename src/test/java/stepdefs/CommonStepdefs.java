package stepdefs;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.open;

public class CommonStepdefs {
    @Given("user is on main page")
    public void user_is_on_main_page() {
        Configuration.browserSize = "1920x1080";
        open("https://litecart.stqa.ru/en/");
    }
}
