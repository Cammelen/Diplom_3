package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Constructor {

    private final WebDriver webDriver;

    public Constructor(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public By enterConstructor = By.xpath("//*[contains(text(), 'Конструктор')]");
    public By enterLogo = By.xpath("//*[@xmlns = 'http://www.w3.org/2000/svg']");
    public By toFillings = By.xpath("//*[contains(text(), 'Начинки')]");
    public By toSauces = By.xpath("//*[contains(text(), 'Соусы')]");
    public By toRolls = By.xpath("//*[contains(text(), 'Булки')]");
    public By displayConstructor = By.xpath("//*[contains (text(), 'Соберите бургер')]");
    public By displayFillings = By.xpath("//*[@class='text text_type_main-medium mb-6 mt-10' and contains (text(), 'Начинки')]");
    public By displaySauces = By.xpath("//*[@class='text text_type_main-medium mb-6 mt-10' and contains (text(), 'Соусы')]");
    public By displayRolls = By.xpath("//*[@class='text text_type_main-medium mb-6 mt-10' and contains (text(), 'Булки')]");
}
