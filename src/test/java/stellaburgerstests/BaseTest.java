package stellaburgerstests;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    WebDriver driver;

    Random random = new Random();

    String name = "Jako" + random.nextInt(10000);
    String email = "jako" + random.nextInt(10000) + "@jako.ru";
    String password = "jakooo" + random.nextInt(100);
    String notCorrectPassword = "jako";
    String existEmail = "jakooo@jako.ru";
    String existPassword = "111111";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
