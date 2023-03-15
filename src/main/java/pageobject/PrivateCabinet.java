package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrivateCabinet {

    private final WebDriver webDriver;

    public PrivateCabinet(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public By displayCheckOrder = By.xpath("//button[contains (text(), 'Оформить заказ')]");
    public By enterPrivateCabinet = By.xpath("//*[contains(text(), 'Личный Кабинет')]");
    public By outPrivateCabinet = By.xpath("//*[contains(text(), 'Выход')]");
    public By displayProfile = By.xpath("//*[contains (text(), 'Профиль')]");
}
