//package lv.iljapavlovs.cucumber.config;
//
//import ch.qos.logback.classic.Logger;
//
//import java.util.HashMap;
//import java.util.Map;
//
//
//public class ResourceManager {
//    private static Map<String, String> globalConfig;
//    private static Map<String, Map<String, String>> urlConfig;
//    private static Map<String, Map<String, Map<String, String>>> testDataConfig;
//
//    private static String Env;
//
//    private Map<String, Object> runtimeTestData = new HashMap<String, Object>();
//
//    /**
//     * return test data
//     */
//    public void setTestData(String name, Object object) {
//        runtimeTestData.put(name, object);
//    }
//
//    public Object getTestData(String name) throws Exception {
//        if (!runtimeTestData.containsKey(name)) {
//            throw new Exception(name + " does not exist. Please set data before get.");
//        }
//        return runtimeTestData.get(name);
//    }
//
//    public boolean hasTestData(String name) {
//        return runtimeTestData.containsKey(name);
//    }
//}