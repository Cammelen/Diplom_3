package stellaburgerstests;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.Constructor;

@DisplayName("Переход по разделам конструктора")
public class ConstructorTests extends BaseTest {

    @Test
    @DisplayName("Переход к разделу _Начинки_")
    public void goToFillings() {

        new Constructor(driver)
                .goToFillings()
                .displayedFillings();
    }

    @Test
    @DisplayName("Переход к разделу _Соусы_")
    public void goToSauces() {

        new Constructor(driver)
                .goToSauces()
                .displayedSauses();
    }

    @Test
    @DisplayName("Переход к разделу _Булки_")
    public void goToRolls() {

        new Constructor(driver)
                .goToFillings()
                .goToRolls()
                .displayedRolls();
    }
}
