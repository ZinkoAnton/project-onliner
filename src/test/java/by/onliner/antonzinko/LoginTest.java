package by.onliner.antonzinko;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;
    final String BASE_URL = "https://www.onliner.by/";

    @Test
    public void testLoginWithEmptyData() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);

        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLoggin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickButtonEnter();

        CookiePage cookiePage = new CookiePage(driver);
        cookiePage.clickButtonCloseCookie();
    }
}
