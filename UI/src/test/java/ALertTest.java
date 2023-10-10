import org.testng.annotations.Test;

public class ALertTest extends BaseTest{
    @Test
    public void testAlertPageHW (){
        driver.get("https://demoqa.com/alerts");
        alertPage.clickAlertBtn()
                .clickTimerAlertBtn()
                .clickConfirmButton()
                .clickPromtButton();
    }
}
