package stellaburgerstests;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

@DisplayName("Переход по разделам конструктора")
public class ConstructorTests extends BaseTest {

    @Test
    @DisplayName("Переход к разделу _Начинки_")
    public void goToFillings() {

        driver.findElement(constructor.toFillings).click();

        boolean isDisplayedFillings = driver.findElement(constructor.displayFillings).isDisplayed();
        assertTrue(isDisplayedFillings);
    }

    @Test
    @DisplayName("Переход к разделу _Соусы_")
    public void goToSauces() {

        driver.findElement(constructor.toSauces).click();

        boolean isDisplayedSauces = driver.findElement(constructor.displaySauces).isDisplayed();
        assertTrue(isDisplayedSauces);
    }

    @Test
    @DisplayName("Переход к разделу _Булки_")
    public void goToRolls() {

        driver.findElement(constructor.toFillings).click();
        driver.findElement(constructor.toRolls).click();

        boolean isDisplayedRolls = driver.findElement(constructor.displayRolls).isDisplayed();
        assertTrue(isDisplayedRolls);
    }
}
