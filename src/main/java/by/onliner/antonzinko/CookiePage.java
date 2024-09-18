package by.onliner.antonzinko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CookiePage {
    WebDriver driver;

    public CookiePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonCloseCookie() {
        Waiters.waitFor(1);
        By buttonCloseCookieBy = By.xpath(CookiePageXPath.BUTTON_CLOSE_COOKIE_XPATH);
        WebElement buttonClose = driver.findElement(buttonCloseCookieBy);
        buttonClose.click();
    }
}
