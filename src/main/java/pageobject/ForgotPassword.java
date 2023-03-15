package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {

    private final WebDriver webDriver;

    public ForgotPassword(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public By loginFromForgotPassword = By.xpath("//*[contains(text(), 'Войти')]");
}
