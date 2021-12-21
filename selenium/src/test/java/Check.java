import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Класс Test.
 *
 * Реализует тесткейс на странице
 * https://translate.yandex.ru/
 */

public class Check {
    private WebDriver driver;

    Check(final WebDriver driver1) {
        this.driver = driver1;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"fakeArea\"]")
    private WebElement inputField;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/a[1]")
    private WebElement siteButton;

    @FindBy(xpath = "//input[@id='urlInput']")
    private WebElement siteInput;

    @FindBy(xpath = "//*[@id=\"url\"]/span[2]")
    private WebElement translateButton;



    //Метод ввода в поля
    void inputText(final String text) {
        final Wait<WebDriver> wait = new WebDriverWait(driver, 300, 2000);
        wait.until(ExpectedConditions.visibilityOf(inputField)).sendKeys(text);
    }

    void inputUrl(final String text) {
        final Wait<WebDriver> wait = new WebDriverWait(driver, 300, 2000);
        wait.until(ExpectedConditions.visibilityOf(siteInput)).sendKeys(text);
    }

    void clickSiteButton() {
        final Wait<WebDriver> wait = new WebDriverWait(driver, 300, 2000);
        wait.until(ExpectedConditions.elementToBeClickable(siteButton)).click();
    }

    void clickTranslateButton(){
        final Wait<WebDriver> wait = new WebDriverWait(driver, 300, 2000);
        wait.until(ExpectedConditions.elementToBeClickable(translateButton)).click();
    }

}
