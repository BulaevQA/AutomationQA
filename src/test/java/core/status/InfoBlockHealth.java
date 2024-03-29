package core.status;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$x;

public class InfoBlockHealth {

    private final SelenideElement errorInfoBlock = $x("//div[@class='ib-error']");

    ///////////////// Логика взаимодействия cо страницей \\\\\\\\\\\\\\\\\\\

    /**
     * === Метот поиска кранов на странице ===
     */
    @Step(value = "Проверка наличия упавших инфоблоков на странице")
    public SelenideElement errorInfoBlock() {
        return errorInfoBlock.shouldNot(exist);
    }
}
