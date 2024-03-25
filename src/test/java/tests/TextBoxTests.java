package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000


    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Anna");
        $("#userEmail").setValue("pomidor@mail.com");
        $("#currentAddress").setValue("1May");
        $("#permanentAddress").setValue("2May");
        $("#submit").click();

        $("#output #name").shouldHave(text("Anna"));
        $("#output #email").shouldHave(text("pomidor@mail.com"));
        $("#output #currentAddress").shouldHave(text("1May"));
        $("#output #permanentAddress").shouldHave(text("2May"));
    }

    @AfterAll
    static void afterAll(){
        closeWebDriver();
    }
}