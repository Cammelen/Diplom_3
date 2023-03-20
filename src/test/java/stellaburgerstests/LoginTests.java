package stellaburgerstests;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.ForgotPassword;
import pageobject.LoginPage;
import pageobject.PrivateCabinet;
import pageobject.RegistrationPage;

@DisplayName("Авторизация")
public class LoginTests extends BaseTest {

    @Test
    @DisplayName("Вход по кнопке _Войти в аккаунт_ на главной")
    public void enterToAccount() {

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
                .displayedCheckOrder();
    }

    @Test
    @DisplayName("Вход по кнопке _Личный кабинет_")
    public void enterToPrivateCabinet() {

        new PrivateCabinet(driver)
                .clickEnterToPrivateCabinet();

        new RegistrationPage(driver)
                .clickEmail()
                .enterEmail(existEmail)
                .clickPassword()
                .enterPassword(existPassword);

        new LoginPage(driver)
                .clickEnterFromLogin();

        new PrivateCabinet(driver)
                .displayedCheckOrder();
    }

    @Test
    @DisplayName("Вход по кнопке _Войти_ из формы регистрации")
    public void enterFromFormOfRegistration() {

        new LoginPage(driver)
                .clickEnterToAccount()
                .clickRegistration();

        new RegistrationPage(driver)
                .clickLoginFromRegistration()
                .enterEmail(existEmail)
                .clickPassword()
                .enterPassword(existPassword);

        new LoginPage(driver)
                .clickEnterFromLogin();

        new PrivateCabinet(driver)
                .displayedCheckOrder();
    }

    @Test
    @DisplayName("Вход по кнопке _Войти_ из формы восстановления пароля")
    public void enterFromFormOfForgotPassword() {

        new LoginPage(driver)
                .clickEnterToAccount()
                .clickRestorePassword();

        new ForgotPassword(driver)
                .clickLoginFromForgotPassword();

        new RegistrationPage(driver)
                .enterEmail(existEmail)
                .clickPassword()
                .enterPassword(existPassword);

        new LoginPage(driver)
                .clickEnterFromLogin();

        new PrivateCabinet(driver)
                .displayedCheckOrder();
    }
}
