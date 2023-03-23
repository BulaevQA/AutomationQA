package pages.core;

import helpers.HashMaps;
import pages.adm.MainAdmPage;
import pages.trudvsem.mainPrr.MainNonAuthPage;
import pages.trudvsem.mainPrr.MainPage;
import pages.trudvsem.myResume.MyResumePage;
import pages.trudvsem.myVacancy.MyVacancyPage;
import test.auth.AuthTestCv;
import test.auth.AuthTestManager;

public class ClassObjects {

    public static AuthTestCv authTestCv = new AuthTestCv();
    public static AuthTestManager authTestManager = new AuthTestManager();
    public static MainPage mainPage = new MainPage();
    public static MainAdmPage mainAdmPage = new MainAdmPage();
    public static MainNonAuthPage mainNonAuthPage = new MainNonAuthPage();
    public static MyResumePage myResumePage = new MyResumePage();
    public static MyVacancyPage myVacancyPage = new MyVacancyPage();
    public static InfoBlockHealth infoBlockHealth = new InfoBlockHealth();
    public static InputValueField inputValueField = new InputValueField();
    public static InputIframe inputIframe = new InputIframe();
    public static InputValueDropDown inputValueDropDown = new InputValueDropDown();
    public static SelectDropDown selectDropDown = new SelectDropDown();
    public static ToggleSwitch toggleSwitch = new ToggleSwitch();
    public static ClickCheckbox clickCheckbox = new ClickCheckbox();
    public static ClickButton clickButton = new ClickButton();
    public static OpenLink openUrl = new OpenLink();
    public static SwitchWindow switchWindow = new SwitchWindow();
    public static MeatBalls meatBalls = new MeatBalls();
    public static HashMaps hashMaps = new HashMaps();

}
