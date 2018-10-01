package lv.iljapavlovs.cucumber.util;

import cucumber.runtime.java.guice.ScenarioScoped;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.RandomStringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@ScenarioScoped
@Getter
@Setter
public class DataHolder {

    private String sharedVariable;
}