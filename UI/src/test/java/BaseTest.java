import com.difital.driver.Driver;
import com.difital.pages.AlertPage;
import com.difital.pages.MenuPage;
import com.difital.pages.PracticeFormPage;
import com.difital.pages.TextBoxPage;
import com.difital.utils.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public WebDriver driver;
    public TextBoxPage textBoxPage;

    public PracticeFormPage practiceFormPage;

    public FakeDataProvider fakeDataProvider;
    public AlertPage alertPage;
    public MenuPage menuPage;


    @BeforeClass (alwaysRun = true)
    public void setUpBrowser(){
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();
        practiceFormPage = new PracticeFormPage();
        fakeDataProvider = new FakeDataProvider();
        alertPage = new AlertPage();
        menuPage = new MenuPage();


    }
    @AfterClass(alwaysRun = true)
    public void tearDown(){
        Driver.closeDriver();
    }
}
