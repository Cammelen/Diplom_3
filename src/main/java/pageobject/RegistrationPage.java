package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private final WebDriver webDriver;

    public RegistrationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public By loginFromRegistration = By.xpath("//*[contains(text(), 'Войти')]");
    public By enterName = By.xpath("//*[@name='name']");
    public By email = By.xpath("//*[@class='input__placeholder text noselect text_type_main-default' and contains(text(), 'Email')]");
    public By enterEmail = By.xpath("//label[text()='Email']/following::input[1]");
    public By password = By.xpath("//*[@class='input__placeholder text noselect text_type_main-default' and contains(text(), 'Пароль')]");
    public By enterPassword = By.xpath("//label[text()='Пароль']/following::input[1]");
    public By registrationUser = By.xpath("//*[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa' and contains(text(), 'Зарегистрироваться')]");
    public By displayEnter = By.xpath("//*[contains(text(), 'Вход')]");
    public By displayNotCorrectPassword = By.xpath("//*[contains(text(), 'Некорректный пароль')]");
}
