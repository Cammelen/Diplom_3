package stellaburgerstests;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

@DisplayName("Регистрация")
public class RegistrationTests extends BaseTest {

    @Test
    @DisplayName("Успешная регистрация")
    public void registrationUser() {

        driver.findElement(loginPage.enterToAccount).click();
        driver.findElement(loginPage.registration).click();
        driver.findElement(registrationPage.enterName).sendKeys(name);
        driver.findElement(registrationPage.email).click();
        driver.findElement(registrationPage.enterEmail).sendKeys(email);
        driver.findElement(registrationPage.password).click();
        driver.findElement(registrationPage.enterPassword).sendKeys(password);
        driver.findElement(registrationPage.registrationUser).click();

        boolean isDisplayedEnter = driver.findElement(registrationPage.displayEnter).isDisplayed();
        assertTrue(isDisplayedEnter);
    }

    @Test
    @DisplayName("Регистрация с некорректным паролем")
    public void registrationWithNotCorrectPassword() {

        driver.findElement(loginPage.enterToAccount).click();
        driver.findElement(loginPage.registration).click();
        driver.findElement(registrationPage.enterName).sendKeys(name);
        driver.findElement(registrationPage.email).click();
        driver.findElement(registrationPage.enterEmail).sendKeys(email);
        driver.findElement(registrationPage.password).click();
        driver.findElement(registrationPage.enterPassword).sendKeys(notCorrectPassword);
        driver.findElement(registrationPage.registrationUser).click();

        boolean isDisplayedNotCorrectPassword = driver.findElement(registrationPage.displayNotCorrectPassword).isDisplayed();
        assertTrue(isDisplayedNotCorrectPassword);
    }
}
