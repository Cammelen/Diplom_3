package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class Constructor {

    private final WebDriver webDriver;

    private By enterConstructor = By.xpath("//*[contains(text(), 'Конструктор')]");
    private By enterLogo = By.xpath("//*[@xmlns = 'http://www.w3.org/2000/svg']");
    private By toFillings = By.xpath("//*[contains(text(), 'Начинки')]");
    private By toSauces = By.xpath("//*[contains(text(), 'Соусы')]");
    private By toRolls = By.xpath("//*[contains(text(), 'Булки')]");
    private By displayConstructor = By.xpath("//*[contains (text(), 'Соберите бургер')]");
    private By displayFillings = By.xpath("//*[@class='text text_type_main-medium mb-6 mt-10' and contains (text(), 'Начинки')]");
    private By displaySauces = By.xpath("//*[@class='text text_type_main-medium mb-6 mt-10' and contains (text(), 'Соусы')]");
    private By displayRolls = By.xpath("//*[@class='text text_type_main-medium mb-6 mt-10' and contains (text(), 'Булки')]");

    public Constructor(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @Step("Клик на раздел _Начинки_")
    public Constructor goToFillings() {
        webDriver.findElement(toFillings).click();
        return this;
    }

    @Step("Проверка отображения _Начинки_")
    public Constructor displayedFillings() {
        boolean isDisplayedFillings = webDriver.findElement(displayFillings).isDisplayed();
        assertTrue(isDisplayedFillings);
        return this;
    }

    @Step("Клик на раздел _Соусы_")
    public Constructor goToSauces() {
        webDriver.findElement(toSauces).click();
        return this;
    }

    @Step("Проверка отображения _Соусы_")
    public Constructor displayedSauses() {
        boolean isDisplayedSauces = webDriver.findElement(displaySauces).isDisplayed();
        assertTrue(isDisplayedSauces);
        return this;
    }

    @Step("Клик на раздел _Булки_")
    public Constructor goToRolls() {
        webDriver.findElement(toRolls).click();
        return this;
    }

    @Step("Проверка отображения _Булки_")
    public Constructor displayedRolls() {
        boolean isDisplayedRolls = webDriver.findElement(displayRolls).isDisplayed();
        assertTrue(isDisplayedRolls);
        return this;
    }

    @Step("Клик на раздел _Конструктор_")
    public Constructor clickEnterToConstructor() {
        webDriver.findElement(enterConstructor).click();
        return this;
    }

    @Step("Проверка отображения _Соберите бургер_")
    public Constructor displayedConstructor() {
        boolean isDisplayedRolls = webDriver.findElement(displayConstructor).isDisplayed();
        assertTrue(isDisplayedRolls);
        return this;
    }

    @Step("Клик на логотип")
    public Constructor clickLogo () {
        webDriver.findElement(enterLogo).click();
        return this;
    }
}
