package DEMO;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowseWindow extends BaseTest{

    @Test
    public void windowsTEst(){
        driver.get("");
        new WebDriverWait(driver, Duration.ofSeconds(4))
                .until(ExpectedCondition.elementToBeCli)
    }
}
