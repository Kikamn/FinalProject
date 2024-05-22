package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static Helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebPage {
    //Home
    By navBar = By.id("nava");
    By phoneBtn = By.xpath("/html/body/div[5]/div/div[1]/div/a[2]");
    By laptopsBtn = By.xpath("/html/body/div[5]/div/div[1]/div/a[3]");
    By monitorBtn = By.xpath("/html/body/div[5]/div/div[1]/div/a[4]");
    By imgLaptop = By.xpath("//img[@src='imgs/sony_vaio_5.jpg']");
    By imgMonitor = By.xpath("//img[@src='imgs/apple_cinema.jpg']");
    By impPhone = By.xpath("//img[@src='imgs/galaxy_s6.jpg']");
    By titleProduct = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    //Contact
    By navContact = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
    By inpEmail = By.id("recipient-email");
    By inpName = By.id("recipient-name");
    By inpMassage = By.id("message-text");
    By btnSend = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");
    By btnClose = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]");
    By btnX = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button");
    //Log In
    By navLogIn = By.id("login2");
    By inpUsername = By.id("loginusername");
    By inpPassword = By.id("loginpassword");
    By btnLogIn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    By btnCloseLog = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]");
    // Sign Up
    By navSignUp = By.id("signin2");
    By inpNameSign = By.id("sign-username");
    By inpPassSign = By.id("sign-password");
    By btnSign = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    By btnCloseSign = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]");
    // Detail Product
    By imgProduct = By.xpath("//*[@id=\"imgp\"]/div/img");
    By titProduct = By.xpath("//*[@id=\"tbodyid\"]/h2");
    By priceProduct = By.xpath("//*[@id=\"tbodyid\"]/h3");
    By desProduct = By.id("more-information");
    By btnAddtoCart = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    //Cart
    By navCart = By.id("cartur");


    public void goToHome(){driver.get("https://www.demoblaze.com/");}

    public void userWillInHomeProductStore(){
        WebElement navbar1 = driver.findElement(navBar);
        assertTrue(navbar1.isDisplayed());
        assertEquals("PRODUCT STORE", navbar1.getText());
    }

    public void clickPhones(){
        driver.findElement(phoneBtn).click();
    }

    public void willShowAllTypePhone(){
        WebElement phone = driver.findElement(impPhone);
        assertTrue(phone.isDisplayed());
    }

    public void clickLaptops(){
        driver.findElement(laptopsBtn).click();
    }

    public void willShowAllTypeLaptop(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement laptop = driver.findElement(imgLaptop);
        assertTrue(laptop.isDisplayed());
    }

    public void clickNavContact () { driver.findElement(navContact).click(); }

    public void userFillContactEmail (String userEmail) { driver.findElement(inpEmail).sendKeys(userEmail); }

    public void userFillContactName (String userName) { driver.findElement(inpName).sendKeys(userName); }

    public void userFillMessage (String userMassage) { driver.findElement(inpMassage).sendKeys(userMassage); }

    public void clickButtonSendMessage () { driver.findElement(btnSend).click(); }

    public void clickOkeInAlert () { driver.switchTo().alert().getText(); driver.switchTo().alert().accept();}

    public void clickButtonClose () { driver.findElement(btnClose); }

    public void clickButtonX () { driver.findElement(btnX).click(); }

    public void clickNavLogIn () { driver.findElement(navLogIn).click(); }

    public void clickButtonCloseInLogIn () { driver.findElement(btnCloseLog).click(); }

    public void fillUsername (String username) { driver.findElement(inpUsername).sendKeys(username); }

    public void fillPassword (String password) { driver.findElement(inpPassword).sendKeys(password); }

    public void clickButtonLogIn () { driver.findElement(btnLogIn).click(); }

    public void logInWillBeSuccessful() { driver.get("https://www.demoblaze.com/index.html"); }

    public void willShowAlert () {
        driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
    }

    public void clickNavSignUp () { driver.findElement(navSignUp).click(); }

    public void fillUsernameSignUp (String username) { driver.findElement(inpNameSign).sendKeys(username); }

    public void fillPasswordSignUp (String password) { driver.findElement(inpPassSign).sendKeys(password); }

    public void clickButtonSignUp () { driver.findElement(btnSign).click(); }

    public void willShowAlertSignUp () {
        driver.switchTo().alert().accept();
    }

    public void clickButtonCloseSignUp () { driver.findElement(btnCloseSign).click(); }

    public void clickTitleProduct () { driver.findElement(titleProduct).click(); }

    public void willShowDetailProduct () { driver.get("https://www.demoblaze.com/prod.html?idp_=1"); }

    public void imageProduct (){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement image = driver.findElement(imgProduct);
        assertTrue(image.isDisplayed());
    }

    public void titleProduct(){
        WebElement title = driver.findElement(titProduct);
        assertTrue(title.isDisplayed());
        assertEquals("Samsung galaxy s6", title.getText());
    }

    public void priceProduct(){
        WebElement price = driver.findElement(priceProduct);
        assertTrue(price.isDisplayed());
        assertEquals("$360 *includes tax", price.getText());
    }

    public void descriptionProduct(){
        WebElement description = driver.findElement(desProduct);
        assertTrue(description.isDisplayed());
        assertEquals("Product description\n" +
                "The Samsung Galaxy S6 is powered by 1.5GHz octa-core Samsung Exynos 7420 processor and it comes with 3GB of RAM. The phone packs 32GB of internal storage cannot be expanded.", description.getText());
    }

    public void clickButtonAddToCart(){
        driver.findElement(btnAddtoCart).click();
    }

    public void clickOkeInAlerttoCart () throws InterruptedException{
        Alert alert = driver.switchTo().alert();
        String massageAlert = driver.switchTo().alert().getText();
        System.out.println(massageAlert);
        Thread.sleep(5000);
        alert.accept();
    }

    public void clickNavCart() { driver.findElement(navCart).click(); }

    public void willShowPurchasedProducts() { driver.get("https://www.demoblaze.com/cart.html"); }


}
