import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GLCareerResultPage extends BasePage{

    By firstResultOnSearchPageLocator = By.xpath("//*[@id='carersearchpage']/div[2]/div/div[3]/div[2]/a/div/div/div[1]/p[1]");

    public GLCareerResultPage(WebDriver driver) {
        super(driver);
    }

    public void getFirst(){
        print(firstResultOnSearchPageLocator);
    }
}
