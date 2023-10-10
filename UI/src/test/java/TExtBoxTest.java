import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TExtBoxTest extends BaseTest{
    @Test
    void fillUpTheFormTest() throws InterruptedException {


        driver.get("https://demoqa.com/text-box");
        textBoxPage.fillUpTheFullName("Asyl Grandor")
                .fillUpTheEmail("Google24@gmail.com")
                .fillUpCurrentAddress("Shopokova str 25")
                .fillPermanentAddressInput("Orto Sai 55")
                .submitForm();
        Thread.sleep(5000);
        WebElement fullNameTextOut = driver.findElement(By.xpath("//div[@ id= 'output']//p [@id = 'name']"));
        WebElement emailTextOut = driver.findElement(By.xpath("//div[@ id= 'output']//p [@id = 'email']"));
        WebElement currentAddressTextOut = driver.findElement(By.xpath("//div[@ id= 'output']//p [@id = 'currentAddress']"));
        WebElement permanentAddressTextOut = driver.findElement(By.xpath("//div[@ id= 'output']//p [@id = 'permanentAddress']"));

        Assert.assertEquals(fullNameTextOut.getText(), "Name:Asyl Grandor");
        Assert.assertEquals(emailTextOut.getText(), "Email:Google24@gmail.com");
        Assert.assertEquals(currentAddressTextOut.getText(), "Current Address :Shopokova str 25");
        Assert.assertEquals(permanentAddressTextOut.getText(), "Permananet Address :Orto Sai 55");

    }
}
