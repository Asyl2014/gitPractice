package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NavigationAndDropDOwn extends BaseTest {

    @Test
    void demo1() {
        driver.navigate().to("https://nambafood.kg/");
        driver.findElement(By.xpath("(//a[@href='/food'])[1]")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    @Test
    void demo2() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
//        WebElement selectCOlor = driver.findElement(By.id("oldSelectMenu"));
//
//        Select select = new Select(selectCOlor);
//        select.selectByVisibleText("Blue");
//        Thread.sleep(5000);
//
//        select.selectByValue("3");
//
//        select.selectByIndex(0);
//
//        List<WebElement> selectOption = select.getOptions();
//        for (WebElement options : selectOption) {
//            System.out.println(options.getText());
//            }
//
//        WebElement selectReact = driver.findElement(By.id("react-select-2-input"));
//        selectReact.sendKeys("Group 1, option 1");
//        Thread.sleep(5000);
//        selectReact.sendKeys(Keys.ENTER);
        WebElement selectReact = driver.findElement(By.id("withOptGroup"));
        WebElement inputClick = driver.findElement(By.xpath("//div[@aria-hidden='true']"));
        inputClick.click();

        List<WebElement> menuItem = selectReact.findElements(By.xpath("./div[2]"));
        List<WebElement> menuItemDiv = selectReact.findElements(By.xpath("react-select-2-option"));
        WebElement selectReactInput = driver.findElement(By.id("react-select-2-input"));
        List<String> menuItemValue = new ArrayList<>();
        String[] itemValue = new String[menuItem.size()];
        for (int i = 0; i < menuItem.size(); i++) {

            itemValue[i] = String.valueOf(menuItem.get(i).getText());

        }


        for (WebElement item : menuItem) {
            String text = item.getText();
            if (!text.equals("Group 1") && !text.equals("Group 2")) {
                menuItemValue.add(text);
            }
        }
        Random random = new Random();
        int numberOfItemsToSelect = random.nextInt(menuItemValue.size());

        selectReactInput.sendKeys(menuItemValue.get(numberOfItemsToSelect));
        selectReactInput.sendKeys(Keys.ENTER);
    }

    @Test
    public void selectRandomColor(Select select, List<WebElement> selectOption) throws InterruptedException {
        Random randomColor = new Random();
        int indexColor = randomColor.nextInt(selectOption.size());
        select.selectByIndex(indexColor);
        System.out.println(indexColor);
        Thread.sleep(5000);
    }


}
