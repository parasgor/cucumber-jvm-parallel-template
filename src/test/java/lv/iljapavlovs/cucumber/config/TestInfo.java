package lv.iljapavlovs.cucumber.config;

import cucumber.api.Scenario;
import lombok.Data;


@Data
public class TestInfo {
    private Scenario currentScenario;
}
