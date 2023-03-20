package stellaburgerstests;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.LoginPage;
import pageobject.RegistrationPage;

@DisplayName("Регистрация")
public class RegistrationTests extends BaseTest {

    @Test
    @DisplayName("Успешная регистрация")
    public void registrationUser() {

        new LoginPage(driver)
                .clickEnterToAccount()
                .clickRegistration();

        new RegistrationPage(driver)
                .enterName(name)
                .clickEmail()
                .enterEmail(email)
                .clickPassword()
                .enterPassword(password)
                .clickRegistrationUser()
                .displayedEnter();
    }

    @Test
    @DisplayName("Регистрация с некорректным паролем")
    public void registrationWithNotCorrectPassword() {

        new LoginPage(driver)
                .clickEnterToAccount()
                .clickRegistration();

        new RegistrationPage(driver)
                .enterName(name)
                .clickEmail()
                .enterEmail(email)
                .clickPassword()
                .enterPassword(notCorrectPassword)
                .clickRegistrationUser()
                .displayedNotCorrectPassword();
    }
}
