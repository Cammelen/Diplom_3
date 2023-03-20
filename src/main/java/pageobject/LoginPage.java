package pageobject;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver webDriver;

    private By enterToAccount = By.xpath("//*[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']");
    private By enterFromLogin = By.xpath("//button[contains (text(), 'Войти')]");
    private By registration = By.xpath("//*[contains(text(), 'Зарегистрироваться')]");
    private By restorePassword = By.xpath("//*[contains(text(), 'Восстановить пароль')]");

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @Step("Клик по кнопке _Войти в аккаунт_ на главной")
    public LoginPage clickEnterToAccount () {
        webDriver.findElement(enterToAccount).click();
        return this;
    }

    @Step("Клик по кнопке _Войти_ из формы авторизации")
    public LoginPage clickEnterFromLogin () {
        webDriver.findElement(enterFromLogin).click();
        return this;
    }

    @Step("Клик по кнопке _Регистрация_ из формы авторизации")
    public LoginPage clickRegistration () {
        webDriver.findElement(registration).click();
        return this;
    }

    @Step("Клик по кнопке _Восстановить пароль_ из формы авторизации")
    public LoginPage clickRestorePassword () {
        webDriver.findElement(restorePassword).click();
        return this;
    }
}
