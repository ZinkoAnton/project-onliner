package by.onliner.antonzinko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    public void clickButton() {
        By buttonLoginBy = By.xpath(HomePageXPath.BUTTON_LOGIN_XPATH);
        WebElement buttonLoginWebElement = driver.findElement(buttonLoginBy);
        buttonLoginWebElement.click();
    }
}
