import com.difital.pages.MenuPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenuSimpleTest extends BaseTest {
    @Test
    public void testMainSimpleTest(){
        driver.navigate().to("https://demoqa.com/menu#");
        driver.findElement(By.xpath("//ul [@id='nav']/li[2]/a")).click();
        driver.findElement(By.xpath("//ul [@id='nav']/li[2]/ul/li[3]")).click();
        driver.findElement(By.xpath("//ul [@id='nav']/li[2]/ul/li[3]/ul/li[2]")).click();

    }

}
