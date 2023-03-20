package pageobject;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {

    private final WebDriver webDriver;

    private By loginFromForgotPassword = By.xpath("//*[contains(text(), 'Войти')]");

    public ForgotPassword(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @Step("Клик по кнопке _Войти_ из формы восстановления пароля")
    public ForgotPassword clickLoginFromForgotPassword () {
        webDriver.findElement(loginFromForgotPassword).click();
        return this;
    }
}
