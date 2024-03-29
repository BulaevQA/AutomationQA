package pages.trudvsemPages.megaMenu.guideInformation.workForStudentPage;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class WorkForStudentsPage {

    private final SelenideElement pageTitle = $x("//h1[@class][text()[normalize-space()='Трудоустройство студентов']]");

    /**
     === Провека заголовка страницы ===
     */
    @Step(value = "Проверка заголовка страницы")
    public boolean pageTitle() {
        return pageTitle.should(visible).exists();
    }
}
