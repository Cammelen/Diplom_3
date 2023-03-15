package stellaburgerstests;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

@DisplayName("Авторизация")
public class LoginTests extends BaseTest {

    @Test
    @DisplayName("Вход по кнопке _Войти в аккаунт_ на главной")
    public void enterToAccount() {

        driver.findElement(loginPage.enterToAccount).click();
        driver.findElement(registrationPage.email).click();
        driver.findElement(registrationPage.enterEmail).sendKeys(existEmail);
        driver.findElement(registrationPage.password).click();
        driver.findElement(registrationPage.enterPassword).sendKeys(existPassword);
        driver.findElement(loginPage.enterFromLogin).click();

        boolean isDisplayedCheckOrder = driver.findElement(privateCabinet.displayCheckOrder).isDisplayed();
        assertTrue(isDisplayedCheckOrder);
    }

    @Test
    @DisplayName("Вход по кнопке _Личный кабинет_")
    public void enterToPrivateCabinet() {

        driver.findElement(privateCabinet.enterPrivateCabinet).click();
        driver.findElement(registrationPage.email).click();
        driver.findElement(registrationPage.enterEmail).sendKeys(existEmail);
        driver.findElement(registrationPage.password).click();
        driver.findElement(registrationPage.enterPassword).sendKeys(existPassword);
        driver.findElement(loginPage.enterFromLogin).click();

        boolean isDisplayedCheckOrder = driver.findElement(privateCabinet.displayCheckOrder).isDisplayed();
        assertTrue(isDisplayedCheckOrder);
    }

    @Test
    @DisplayName("Вход по кнопке _Войти_ из формы регистрации")
    public void enterFromFormOfRegistratin() {

        driver.findElement(loginPage.enterToAccount).click();
        driver.findElement(loginPage.registration).click();
        driver.findElement(registrationPage.loginFromRegistration).click();
        driver.findElement(registrationPage.enterEmail).sendKeys(existEmail);
        driver.findElement(registrationPage.password).click();
        driver.findElement(registrationPage.enterPassword).sendKeys(existPassword);
        driver.findElement(loginPage.enterFromLogin).click();

        boolean isDisplayedCheckOrder = driver.findElement(privateCabinet.displayCheckOrder).isDisplayed();
        assertTrue(isDisplayedCheckOrder);
    }

    @Test
    @DisplayName("Вход по кнопке _Войти_ из формы восстановления пароля")
    public void enterFromFormOfForgotPassword() {

        driver.findElement(loginPage.enterToAccount).click();
        driver.findElement(loginPage.restorePassword).click();
        driver.findElement(forgotPassword.loginFromForgotPassword).click();
        driver.findElement(registrationPage.enterEmail).sendKeys(existEmail);
        driver.findElement(registrationPage.password).click();
        driver.findElement(registrationPage.enterPassword).sendKeys(existPassword);
        driver.findElement(loginPage.enterFromLogin).click();

        boolean isDisplayedCheckOrder = driver.findElement(privateCabinet.displayCheckOrder).isDisplayed();
        assertTrue(isDisplayedCheckOrder);
    }
}
