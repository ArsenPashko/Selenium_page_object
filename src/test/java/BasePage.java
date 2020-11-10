import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public String firstResult;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void get(String URL){
        driver.get(URL);
    }


    public void sendKey(String key, By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(key);

    }

    public void click(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void print(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        firstResult = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
        System.out.println(firstResult);
    }


}
