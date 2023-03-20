package pageobject;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class PrivateCabinet {

    private final WebDriver webDriver;

    private By displayCheckOrder = By.xpath("//button[contains (text(), 'Оформить заказ')]");
    private By enterPrivateCabinet = By.xpath("//*[contains(text(), 'Личный Кабинет')]");
    private By outPrivateCabinet = By.xpath("//*[contains(text(), 'Выход')]");
    private By displayProfile = By.xpath("//*[contains (text(), 'Профиль')]");

    public PrivateCabinet(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @Step("Клик по кнопке _Личный кабинет_")
    public PrivateCabinet clickEnterToPrivateCabinet() {
        webDriver.findElement(enterPrivateCabinet).click();
        return this;
    }

    @Step("Проверка отображения кнопки _Оформить заказ_")
    public PrivateCabinet displayedCheckOrder() {
        boolean isDisplayedCheckOrder = webDriver.findElement(displayCheckOrder).isDisplayed();
        assertTrue(isDisplayedCheckOrder);
        return this;
    }

    @Step("Проверка отображения _Профиль_")
    public PrivateCabinet displayedProfile() {
        boolean isDisplayedProfile = webDriver.findElement(displayProfile).isDisplayed();
        assertTrue(isDisplayedProfile);
        return this;
    }

    @Step("Клик по кнопке _Выход_ из личного кабинета")
    public PrivateCabinet clickEnterOutFromPrivateCabinet() {
        webDriver.findElement(outPrivateCabinet).click();
        return this;
    }
}
