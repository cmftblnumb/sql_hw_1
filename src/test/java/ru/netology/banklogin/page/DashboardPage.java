package ru.netology.banklogin.page;

import static com.codeborne.selenide.Condition.text;
import static com. codeborne.selenide. Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import com.codeborne. selenide. SelenideElement;

public class DashboardPage {
    private final SelenideElement heading = $("[data-test-id=dashboard]");

    public DashboardPage() {
        heading.shouldHave(text("Личный кабинет")).shouldBe(visible);
    }
}
