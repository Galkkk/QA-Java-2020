import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

/**
 * Класс EventList.
 * Реализует методы реагирования на
 * попытку
 * ввода, клика и
 * принятие оповещений
 * Вебдрайвером
 */

public class EventList implements WebDriverEventListener {
    public void beforeNavigateTo(String element, WebDriver webDriver) {
        System.out.println("Поиск элемента: " + element);
    }

    public void afterNavigateTo(String element, WebDriver webDriver) {
        System.out.println("Элемент " + element + " найден");
        System.out.println();

    }

    public void beforeNavigateBack(WebDriver webDriver) {

    }

    public void afterNavigateBack(WebDriver webDriver) {

    }

    public void beforeNavigateForward(WebDriver webDriver) {

    }

    public void afterNavigateForward(WebDriver webDriver) {

    }

    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {

    }

    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {

    }

    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Попытка кликнуть на элемент: " + webElement);

    }

    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Клик на элемент " + webElement + " выплнен успешно ");
        System.out.println();
    }

    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver) {
        System.out.println("Попытка написать текст в элемент " + webElement);
    }

    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver) {
        System.out.println("Текст введен успешно");
    }

    public void beforeScript(String s, WebDriver webDriver) {

    }

    public void afterScript(String s, WebDriver webDriver) {

    }

    public void onException(Throwable throwable, WebDriver webDriver) {

    }
}