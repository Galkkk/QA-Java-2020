import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.junit.Before;
import org.junit.Test;

/**
 * Класс MainTest.
 * Запускает тесткейс на сайте
 * https://translate.yandex.ru/
 * с помощью ChromeDriver
 *
 * @author Брякова Галина
 * Апрель, 2020.
 */

public class MainTest {
    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void beforeTest() {
        driver = new ChromeDriver();


        EventFiringWebDriver eventDriver
                = new EventFiringWebDriver(driver); //Wrapper

        EventList eventList = new EventList();
        eventDriver.register(eventList);
        driver = eventDriver;

        driver.get("https://translate.yandex.ru/"); //Переход на страницу Яндрекс-переводчика
    }

    @Test
    public void mainTest() {
        Check check = new Check(driver);
        check.inputText("текст для проверки");
        check.clickSiteButton();
        check.inputUrl("https://github.com/");
        check.clickTranslateButton();
    }

    @AfterClass
    public static void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}