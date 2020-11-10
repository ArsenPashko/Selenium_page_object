import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GlCareerPage extends BasePage {

    By searchFieldLocator = By.id("by_keyword");
    By buttonOfSearchLocator = By.xpath("//button[@class ='btn btn-primary find-btn']");
    String URL = "https://www.globallogic.com/ua/careers/";

    public GlCareerPage(WebDriver driver) {
        super(driver);

    }

    public void open(){
        get(URL);
    }


    public void fieldOfSearch(){
        sendKey("QA", searchFieldLocator);
    }

    public void clickOnSearchButton(){
        click(buttonOfSearchLocator);
    }


}
