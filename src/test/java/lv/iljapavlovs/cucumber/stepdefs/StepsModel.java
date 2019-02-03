package lv.iljapavlovs.cucumber.stepdefs;

import cucumber.api.Scenario;
//import lv.iljapavlovs.cucumber.config.ResourceManager;
import lv.iljapavlovs.cucumber.util.TestDataContext;


public class StepsModel {
    protected TestDataContext resourceManager;

    protected Scenario scenario;

    public StepsModel(TestDataContext resourceManager) throws Exception {
        this.resourceManager = resourceManager;
        this.scenario = resourceManager.testInfo.getCurrentScenario();

    }

    public StepsModel(){
        System.out.println("I am default constructor");
    }


}
