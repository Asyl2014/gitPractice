import com.difital.pages.MenuPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MenuPageSelectTest extends BaseTest{
    @Test
    public void testMenuDropDownSelectHW () throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement selectColorMenu = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
        Select select = new Select(selectColorMenu);
        select.selectByVisibleText("Purple");
        Thread.sleep(5000);

        WebElement selectValue = driver.findElement(By.xpath
                ("//div[@id='selectMenuContainer']/div[2]/div/div"));
        Select select1 = new Select(selectValue);
        select1.selectByValue("Group 1,option 2");
    }
}
