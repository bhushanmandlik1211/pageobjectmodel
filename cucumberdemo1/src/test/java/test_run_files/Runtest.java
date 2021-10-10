package test_run_files;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions 
(
	features="E:\\Bhushan\\cucumberdemo1\\src\\test\\java\\feature_files\\facebook.feature",
	glue="step_def_files",
	dryRun=false,
	monochrome=true,
	plugin={"pretty"	}
)
public class Runtest {

}
