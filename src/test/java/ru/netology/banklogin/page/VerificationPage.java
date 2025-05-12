package ru.netology.banklogin.page;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import com.codeborne. selenide. SelenideElement;


public class VerificationPage {
    private final SelinideElement codeField = $("[data-test-id=code] input");
    private final SelinideElement verifyButton = $("[data-test-id=action-verify]");
    private final SelinideElement errorNotification = $("[data-test-id='error-notification'] .notification__content");

    public VerificationPage() {
        codeField.shouldBe(visible);
    }

    public void verifyErrorNotification(String expectedText) {
        errorNotification.shouldHave(exactText(expectedText)).shouldBe(visible);
    }

    public DashboardPage validVerify(String verificationCode) {
        verify(verificationCode);
        return new DashboardPage();
    }

    public void verify(String verificationCode) {
        codeField.setValue(verificationCode);
        verifyButton.click();
    }
}

