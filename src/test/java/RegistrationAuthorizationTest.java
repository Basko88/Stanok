import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegistrationAuthorizationTest {
    public static WebDriver driver;

    @Test
    public void RegistrationAuthorization() {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Xiaomi/OneDrive/Документы/QA/AutomatedTesting/IntelijIDE/Stanok/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://stanok-qa.ossystem.ua/ru/login");

        By email = By.name("email");
        String emailValue = "test@gmail.com";
        clickClearAndSendKeys(email, emailValue);

        By password = By.name("password");
        String passwordValue = "123456Bd!";
        clickClearAndSendKeys(password, passwordValue);
    }
    public void clickClearAndSendKeys(By locator, String value) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
    }


}


