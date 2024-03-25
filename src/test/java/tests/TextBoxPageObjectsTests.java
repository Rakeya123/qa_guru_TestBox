package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pageObjects.RegistrashionPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPageObjectsTests {

    RegistrashionPage registrashionPage = new RegistrashionPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000


    }

    @Test
    void registrashion() {
        registrashionPage.openPage()
                .setUserName("Anna")
                .setUserEmail("pomidor@mail.com")
                .setCurrentAdress("1May")
                .setPermanentAdress("2May")
                .clickSumbut();

registrashionPage.checkResults("Name:", "Anna")
        .checkResults("Email:","pomidor@mail.com" )
        .checkResults("Current Address :","1May" )
        .checkResults("Permananet Address :","2May" );

    }


}