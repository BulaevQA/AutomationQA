package test.megaMenuTests.megaMenuLinks;

import base.BrowserConfig;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import net.bytebuddy.build.Plugin;
import org.junit.jupiter.api.*;

import java.util.Arrays;

import static core.classObjects.ClassObjects.*;

public class MegaMenuLinksTest extends BrowserConfig {

    @Test
    @Tag("MegaMenu")
    @Epic(value = "Тесты Мега-меню")
    @Description(value = "Тест страницы мега-меню")
    public void megaMenuLinksTest() {
        openLink.openUrl(testValues.url);
        click.clickButton("Все сервисы");
        Assertions.assertEquals(testValues.megaMenuArray, mainPage.checkMegaMenu());
    }
}
