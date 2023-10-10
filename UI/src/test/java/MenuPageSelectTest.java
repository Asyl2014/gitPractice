import com.difital.pages.MenuPage;
import org.testng.annotations.Test;

public class MenuPageSelectTest extends BaseTest{
    @Test
    public void testMenuDropDownSelectHW (){
        driver.get("https://demoqa.com/menu#");
        menuPage.selectClickSubSubMenu();
    }
}
