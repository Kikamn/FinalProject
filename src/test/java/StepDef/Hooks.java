package StepDef;

import io.cucumber.java.*;

import static Helper.Utility.*;

public class Hooks {
    @Before
    public void beforeTest(){
        openDriver();
    }

    @After
    public void afterTest() throws InterruptedException {
        closeDriver();
    }
}
