package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebPage {
    By navBar = By.id("nava");

    public void goToHome(){driver.get("https://www.demoblaze.com/");}

    public void userWillInHomeProductStore(){
        WebElement navbar1 = driver.findElement(navBar);
        assertTrue(navbar1.isDisplayed());
        assertEquals("PRODUCT STORE", navbar1.getText());
    }
}
