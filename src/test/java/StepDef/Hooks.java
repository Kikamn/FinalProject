package StepDef;

import org.junit.After;
import org.junit.Before;

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
