package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public By enterToAccount = By.xpath("//*[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']");
    public By enterFromLogin = By.xpath("//button[contains (text(), 'Войти')]");
    public By registration = By.xpath("//*[contains(text(), 'Зарегистрироваться')]");
    public By restorePassword = By.xpath("//*[contains(text(), 'Восстановить пароль')]");
}
