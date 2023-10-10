package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsNumbaFood extends BaseTestHWNambaFood{

    @Test
    void partialLinkedText() throws InterruptedException {
        driver.get("https://nambafood.kg/");
        WebElement partialLinkFood = driver.findElement(By.partialLinkText("Еда"));
        System.out.println(partialLinkFood.getText());

        partialLinkFood.click();
        Thread.sleep(5000);

        WebElement nationalKitchen = driver.findElement(By.linkText("Национальная"));
        nationalKitchen.click();
        Thread.sleep(5000);

        WebElement faizaHyperLink = driver.findElement(By.xpath("//a[@data-id='530']"));

        faizaHyperLink.click();
        Thread.sleep(5000);

        WebElement ramenEggCountplusRamenEgg = driver.findElement(By.xpath("//div[@data-item-name='Рамен с яйцом']/div[2]/div[2]"));
        ramenEggCountplusRamenEgg.click();
        ramenEggCountplusRamenEgg.click();
        ramenEggCountplusRamenEgg.click();

        WebElement orderRamenEgg = driver.findElement(By.xpath("//div[@data-item-name='Рамен с яйцом']/button"));
        orderRamenEgg.click();
        Thread.sleep(5000);

        WebElement ramenCountplusChees = driver.findElement(By.xpath("//div[@data-item-name='Рамен с сыром']/div[2]/div[2]"));
        ramenCountplusChees.click();
        ramenCountplusChees.click();
        ramenCountplusChees.click();

        WebElement orderRamenChees = driver.findElement(By.xpath("//div[@data-item-name='Рамен с сыром']/button"));
        orderRamenChees.click();
        Thread.sleep(5000);

        WebElement cocaColaCount = driver.findElement(By.xpath("//div[@data-item-name='Coca-Cola 0,5 л']/div[2]/div[2]"));
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cocaColaCount);
        cocaColaCount.click();
        Thread.sleep(5000);

        WebElement orderCocaCola = driver.findElement(By.xpath("//div[@data-item-name='Coca-Cola 0,5 л']/button"));
        orderCocaCola.click();
        Thread.sleep(5000);


        WebElement orderBottom = driver.findElement(By.id("cart"));
        orderBottom.click();

        WebElement orderFormalizade = driver.findElement(By.xpath("//div/a/button"));
        orderFormalizade.click();

        WebElement fullName = driver.findElement(By.id("food_order_client_name"));
        String expectedFullName = "Marko Robio Gonzales";
        fullName.sendKeys(expectedFullName);

        WebElement fullAddress = driver.findElement(By.id("food_order_address"));
        String expectedFullAddress = "Shopokova 12";
        fullAddress.sendKeys(expectedFullAddress);

        WebElement fullAppartAndFlor = driver.findElement(By.id("food_order_door_code"));
        String expectedAppAndFlor = "55, 4";
        fullAppartAndFlor.sendKeys(expectedAppAndFlor);

        WebElement fieldPhone = driver.findElement(By.id("food_order_phone"));
        String expectedNumberPhone = "0707255264";
        fieldPhone.sendKeys(expectedNumberPhone);
        Thread.sleep(100000);

        WebElement orderAndPay = driver.findElement(By.xpath("//div/button[@id='payment_cash']"));
        orderAndPay.click();

    }
}
