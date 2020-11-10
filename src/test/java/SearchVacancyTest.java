import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
public class SearchVacancyTest {

    private static ChromeDriver driver;
    private static GlCareerPage careerPage;
    private static GLCareerResultPage careerResultPage;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "/home/arsen/IdeaProjects/drivers/chromedriver");

        driver = new ChromeDriver();
        careerPage = new GlCareerPage(driver);
        careerResultPage = new GLCareerResultPage(driver);
        careerPage.open();

        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,200)");

    }

    @Test
    public void testOfGetVacancy(){

        careerPage.fieldOfSearch();

        careerPage.clickOnSearchButton();

        careerResultPage.getFirst();
    }


}
