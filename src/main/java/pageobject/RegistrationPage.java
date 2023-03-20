package pageobject;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;
public class RegistrationPage {

    private final WebDriver webDriver;

    private By loginFromRegistration = By.xpath("//*[contains(text(), 'Войти')]");
    private By enterName = By.xpath("//*[@name='name']");
    private By email = By.xpath("//*[@class='input__placeholder text noselect text_type_main-default' and contains(text(), 'Email')]");
    private By enterEmail = By.xpath("//label[text()='Email']/following::input[1]");
    private By password = By.xpath("//*[@class='input__placeholder text noselect text_type_main-default' and contains(text(), 'Пароль')]");
    private By enterPassword = By.xpath("//label[text()='Пароль']/following::input[1]");
    private By registrationUser = By.xpath("//*[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa' and contains(text(), 'Зарегистрироваться')]");
    private By displayEnter = By.xpath("//*[contains(text(), 'Вход')]");
    private By displayNotCorrectPassword = By.xpath("//*[contains(text(), 'Некорректный пароль')]");

    public RegistrationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @Step("Ввод name в поле _Name_")
    public RegistrationPage enterName (String str) {
        webDriver.findElement(enterName).sendKeys(str);
        return this;
    }

    @Step("Клик по кнопке _Зарегистрироваться_")
    public RegistrationPage clickRegistrationUser () {
        webDriver.findElement(registrationUser).click();
        return this;
    }

    @Step("Проверка отображения кнопки _Войти_")
    public RegistrationPage displayedEnter() {
        boolean isDisplayedRolls = webDriver.findElement(displayEnter).isDisplayed();
        assertTrue(isDisplayedRolls);
        return this;
    }

    @Step("Проверка отображения _Некорректный пароль")
    public RegistrationPage displayedNotCorrectPassword() {
        boolean isDisplayedotCorrectPassword = webDriver.findElement(displayNotCorrectPassword).isDisplayed();
        assertTrue(isDisplayedotCorrectPassword);
        return this;
    }

    @Step("Клик на поле _Email_")
    public RegistrationPage clickEmail () {
        webDriver.findElement(email).click();
        return this;
    }

    @Step("Ввод email в поле _Email_")
    public RegistrationPage enterEmail (String str) {
        webDriver.findElement(enterEmail).sendKeys(str);
        return this;
    }

    @Step("Клик на поле _Password_")
    public RegistrationPage clickPassword () {
        webDriver.findElement(password).click();
        return this;
    }

    @Step("Ввод password в поле _Password_")
    public RegistrationPage enterPassword (String str) {
        webDriver.findElement(enterPassword).sendKeys(str);
        return this;
    }

    @Step("Клик по кнопке _Войти_ из формы регистрации")
    public RegistrationPage clickLoginFromRegistration () {
        webDriver.findElement(loginFromRegistration).click();
        return this;
    }
}
