package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksExample {

    @Before(order = 0)
    public void globalSetup() {
        // e.g., start driver, load config
        System.out.println("Global setup");
    }

    @Before(order = 1)
    public void setupDb() {
        System.out.println("Db Setuop.....");
    }

//    @BeforeStep
//    public void beforeEachStep(Scenario scenario) {
//        // e.g., start step timer/logging
//    }
//
//    @AfterStep
//    public void afterEachStep(Scenario scenario) {
//        // e.g., capture screenshot on failure inside steps as needed
//    }

    @After(order = 2)
    public void teardown1() {
        System.out.println("closing the DB setup.....");
    }
    
    @After(order = 1)
    public void teardown2()
    {
    	System.out.println("Closing the Global setup.....");
    }
    
    
}