package StepDef;

import Pages.WebPage;
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
    public void userWillInHomeProductStore() {
        webPage.userWillInHomeProductStore();

    }
}
