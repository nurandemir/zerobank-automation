package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue="com/zerobank/step_definitions",
        features="src/test/resources/features",
        dryRun=false,
        strict=false,
        tags="@download_statement",
        plugin = {
            "html:target/default-report",
            "json:target/cucumber1.json",
            "rerun:target/rerun.txt"
        }
)

public class CukesRunner {
}
