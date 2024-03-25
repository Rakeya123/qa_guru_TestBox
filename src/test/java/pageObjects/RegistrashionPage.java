package pageObjects;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrashionPage {
    private SelenideElement UserNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAdressInput = $("#currentAddress"),
            permanentAdressInput = $("#permanentAddress"),
            sumbitButtonClik = $("#submit"),
    outputUserName = $("#output #name"),
    outputUserEmail = $("#output #email"),
    outputCurrentAddress = $("#output #currentAddress"),
    outputPermanentAddress = $("#output #permanentAddress");

    public RegistrashionPage openPage() {
        open("/text-box");
        return this;
    }

    public RegistrashionPage setUserName(String value) {
        UserNameInput.setValue(value);
        return this;

    }

    public RegistrashionPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrashionPage setCurrentAdress(String value) {
        currentAdressInput.setValue(value);
        return this;
    }

    public RegistrashionPage setPermanentAdress(String value) {
        permanentAdressInput.setValue(value);
        return this;
    }
    public RegistrashionPage clickSumbut() {
        sumbitButtonClik.click();
        return this;
    }

    public RegistrashionPage checkResults(String key, String value) {
        $(".border").$(byText(key)).parent().shouldHave(text(value));
        return this;
    }


}