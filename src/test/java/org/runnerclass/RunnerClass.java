package org.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\EcommerceEtsy.feature",glue="org.stepdefinitiion", dryRun=false)
                                                                                   
public class RunnerClass {
}

	