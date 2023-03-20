package stellaburgerstests;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.Constructor;
import pageobject.LoginPage;
import pageobject.PrivateCabinet;
import pageobject.RegistrationPage;

@DisplayName("Переходы в личном кабинете")
public class PrivateCabinetTests extends BaseTest {

    @Test
    @DisplayName("Переход по клику на _Личный кабинет_")
    public void goToPrivateCabinet() {

        new LoginPage(driver)
                .clickEnterToAccount();

        new RegistrationPage(driver)
                .clickEmail()
                .enterEmail(existEmail)
                .clickPassword()
                .enterPassword(existPassword);

        new LoginPage(driver)
                .clickEnterFromLogin();

        new PrivateCabinet(driver)
                .clickEnterToPrivateCabinet()
                .displayedProfile();
    }

    @Test
    @DisplayName("Переход по клику на _Конструктор_ из личного кабинета")
    public void goToConstructor() {

        new LoginPage(driver)
                .clickEnterToAccount();

        new RegistrationPage(driver)
                .clickEmail()
                .enterEmail(existEmail)
                .clickPassword()
                .enterPassword(existPassword);

        new LoginPage(driver)
                .clickEnterFromLogin();

        new PrivateCabinet(driver)
                .clickEnterToPrivateCabinet();

        new Constructor(driver)
                .clickEnterToConstructor()
                .displayedConstructor();
    }

    @Test
    @DisplayName("Переход по клику на Логотип из личного кабинета")
    public void goToLogo() {

        new LoginPage(driver)
                .clickEnterToAccount();

        new RegistrationPage(driver)
                .clickEmail()
                .enterEmail(existEmail)
                .clickPassword()
                .enterPassword(existPassword);

        new LoginPage(driver)
                .clickEnterFromLogin();

        new PrivateCabinet(driver)
                .clickEnterToPrivateCabinet();

        new Constructor(driver)
                .clickLogo();

        new Constructor(driver)
                .clickEnterToConstructor()
                .displayedConstructor();
    }

    @Test
    @DisplayName("Выход из личного кабинета")
    public void outFromPrivateCabinet() {

        new LoginPage(driver)
                .clickEnterToAccount();

        new RegistrationPage(driver)
                .clickEmail()
                .enterEmail(existEmail)
                .clickPassword()
                .enterPassword(existPassword);

        new LoginPage(driver)
                .clickEnterFromLogin();

        new PrivateCabinet(driver)
                .clickEnterToPrivateCabinet()
                .clickEnterOutFromPrivateCabinet();

        new Constructor(driver)
                .clickEnterToConstructor()
                .displayedConstructor();
    }
}
