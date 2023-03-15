package stellaburgerstests;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

@DisplayName("Переходы в личном кабинете")
public class PrivateCabinetTests extends BaseTest {

    @Test
    @DisplayName("Переход по клику на _Личный кабинет_")
    public void goToPrivateCabinet() {

        driver.findElement(loginPage.enterToAccount).click();
        driver.findElement(registrationPage.email).click();
        driver.findElement(registrationPage.enterEmail).sendKeys(existEmail);
        driver.findElement(registrationPage.password).click();
        driver.findElement(registrationPage.enterPassword).sendKeys(existPassword);
        driver.findElement(loginPage.enterFromLogin).click();
        driver.findElement(privateCabinet.enterPrivateCabinet).click();

        boolean isDisplayedProfile = driver.findElement(privateCabinet.displayProfile).isDisplayed();
        assertTrue(isDisplayedProfile);
    }

    @Test
    @DisplayName("Переход по клику на _Конструктор_ из личного кабинета")
    public void goToConstructor() {

        driver.findElement(loginPage.enterToAccount).click();
        driver.findElement(registrationPage.email).click();
        driver.findElement(registrationPage.enterEmail).sendKeys(existEmail);
        driver.findElement(registrationPage.password).click();
        driver.findElement(registrationPage.enterPassword).sendKeys(existPassword);
        driver.findElement(loginPage.enterFromLogin).click();
        driver.findElement(privateCabinet.enterPrivateCabinet).click();
        driver.findElement(constructor.enterConstructor).click();

        boolean isDisplayedConstructor = driver.findElement(constructor.displayConstructor).isDisplayed();
        assertTrue(isDisplayedConstructor);
    }

    @Test
    @DisplayName("Переход по клику на Логотип из личного кабинета")
    public void goToLogo() {

        driver.findElement(loginPage.enterToAccount).click();
        driver.findElement(registrationPage.email).click();
        driver.findElement(registrationPage.enterEmail).sendKeys(existEmail);
        driver.findElement(registrationPage.password).click();
        driver.findElement(registrationPage.enterPassword).sendKeys(existPassword);
        driver.findElement(loginPage.enterFromLogin).click();
        driver.findElement(privateCabinet.enterPrivateCabinet).click();
        driver.findElement(constructor.enterLogo).click();

        boolean isDisplayedConstructor = driver.findElement(constructor.displayConstructor).isDisplayed();
        assertTrue(isDisplayedConstructor);
    }

    @Test
    @DisplayName("Выход из личного кабинета")
    public void outFromPrivateCabinet() {

        driver.findElement(loginPage.enterToAccount).click();
        driver.findElement(registrationPage.email).click();
        driver.findElement(registrationPage.enterEmail).sendKeys(existEmail);
        driver.findElement(registrationPage.password).click();
        driver.findElement(registrationPage.enterPassword).sendKeys(existPassword);
        driver.findElement(loginPage.enterFromLogin).click();
        driver.findElement(privateCabinet.enterPrivateCabinet).click();
        driver.findElement(privateCabinet.outPrivateCabinet).click();

        boolean isDisplayedEnter = driver.findElement(registrationPage.displayEnter).isDisplayed();
        assertTrue(isDisplayedEnter);
    }
}
