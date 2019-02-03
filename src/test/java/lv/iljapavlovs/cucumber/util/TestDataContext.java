package lv.iljapavlovs.cucumber.util;

import cucumber.api.Scenario;
import lombok.Getter;
import lombok.Setter;
import lv.iljapavlovs.cucumber.config.TestInfo;
import org.apache.commons.lang3.RandomStringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@Getter
@Setter
public class TestDataContext {

    private static final TestDataContext INSTANCE = new TestDataContext();
    private Map<String, Object> testDataMap = new HashMap<>();
    public TestInfo testInfo = new TestInfo();

    public TestDataContext() {
        this.testDataMap.put("Test", "Test");
    }

    public static TestDataContext getInstance() {
        return INSTANCE;
    }

    public void setTestData(String name, Object object){
        testDataMap.put(name, object);
    }

    public Object getTestData(String name) throws Exception{
        if(!testDataMap.containsKey(name)){
            throw new Exception(name + " does not exist. Please set data before get.");
        }
        return testDataMap.get(name);
    }
}