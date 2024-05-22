package StepDef;

import Pages.WebPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WebStep {
    WebPage webPage;
    public  WebStep() {
        this.webPage = new WebPage();
    }

    @Given("Open link PRODUCT STORE")
    public void openLinkPRODUCTSTORE() {
        webPage.goToHome();
    }

    @Then("User will in home Product Store")
    public void userWillInHomeProductStore() { webPage.userWillInHomeProductStore();}

    @And("Click Phones")
    public void clickPhones() {
        webPage.clickPhones();
    }

    @Then("Will show all type phone")
    public void willShowAllTypePhone() {
        webPage.willShowAllTypePhone();
    }

    @And("Click Laptops")
    public void clickLaptops() {
        webPage.clickLaptops();
    }

    @Then("Will show all type laptop")
    public void willShowAllTypeLaptop() {
        webPage.willShowAllTypeLaptop();
    }

    @And("Click Monitors")
    public void clickMonitors() {
    }

    @Then("Will show all type monitor")
    public void willShowAllTypeMonitor() {
    }

    @And("Click nav contact")
    public void clickNavContact() {
        webPage.clickNavContact();
    }

    @And("User fill Contact Email {string}")
    public void userFillContactEmail(String userEmail) {
        webPage.userFillContactEmail(userEmail);
    }

    @And("User fill Contact Name {string}")
    public void userFillContactName(String userName) {
        webPage.userFillContactName(userName);
    }

    @And("User fill Message {string}")
    public void userFillMessage(String userMasage) {
        webPage.userFillMessage(userMasage);
    }

    @And("Click button Send message")
    public void clickButtonSendMessage() {
        webPage.clickButtonSendMessage();
    }

    @And("Click oke in alert")
    public void clickOkeInAlert() {
        webPage.clickOkeInAlert();
    }

    @Then("Will back home")
    public void willBackHome() {
        webPage.userWillInHomeProductStore();
    }

    @And("Click button Close")
    public void clickButtonClose() {
        webPage.clickButtonClose();
    }

    @And("Click button X")
    public void clickButtonX() {
        webPage.clickButtonX();
    }

    @And("Click nav Log in")
    public void clickNavLogIn() {
        webPage.clickNavLogIn();
    }

    @And("Click button Close in Log in")
    public void clickButtonCloseInLogIn() {
        webPage.clickButtonCloseInLogIn();
    }

    @And("Fill Username {string}")
    public void fillUsername(String userName) {
        webPage.fillUsername(userName);
    }

    @And("Fill password {string}")
    public void fillPassword(String password) {
        webPage.fillPassword(password);
    }

    @And("Click button Log in")
    public void clickButtonLogIn() {
        webPage.clickButtonLogIn();
    }

    @Then("Log in will be successful")
    public void logInWillBeSuccessful() {
        webPage.logInWillBeSuccessful();
    }

    @Then("Will show alert")
    public void willShowAlert() {
        webPage.willShowAlert();
    }

    @And("Click nav Sign up")
    public void clickNavSignUp() {
        webPage.clickNavSignUp();
    }

    @And("Fill Username Sign up {string}")
    public void fillUsernameSignUp(String username) {
        webPage.fillUsernameSignUp(username);
    }

    @And("Fill password Sign up {string}")
    public void fillPasswordSignUp(String password) {
        webPage.fillPasswordSignUp(password);
    }

    @And("Click button sign up")
    public void clickButtonSignUp() {
        webPage.clickButtonSignUp();
    }

    @Then("Will show alert sign up")
    public void willShowAlertSignUp() {
        webPage.willShowAlert();
    }

    @And("Click button close sign up")
    public void clickButtonCloseSignUp() { webPage.clickButtonCloseSignUp(); }

    @And("Click title product")
    public void clickTitleProduct() {
        webPage.clickTitleProduct();
    }

    @Then("Will show detail product")
    public void willShowDetailProduct() {
        webPage.willShowDetailProduct();
    }

    @Then("Image product")
    public void imageProduct() {
        webPage.imageProduct();
    }

    @Then("Title product")
    public void titleProduct() {
        webPage.titleProduct();
    }

    @Then("Price product")
    public void priceProduct() { webPage.priceProduct(); }

    @Then("Description product")
    public void descriptionProduct() {
        webPage.descriptionProduct();
    }

    @Then("Click Button Add to Cart")
    public void clickButtonAddToCart() {
        webPage.clickButtonAddToCart();
    }

    @And("Click oke in alert to cart")
    public void clickOkeInAlerttoCart() throws InterruptedException{ webPage.clickOkeInAlerttoCart(); }

    @And("Click Nav Cart")
    public void clickNavCart() { webPage.clickNavCart(); }

    @Then("Will show purchased products")
    public void willShowPurchasedProducts() {
        webPage.willShowPurchasedProducts();
    }

}
