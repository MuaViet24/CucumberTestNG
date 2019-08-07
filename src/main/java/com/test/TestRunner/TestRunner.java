package com.test.TestRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberFeatureWrapper;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleEventWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
		features="C:\\Stuff\\Reetu\\WorkSpace\\CucumberBDDTestNG\\src\\main\\java\\com\\test\\Feature\\TestNGDemo.feature",
		glue={"com/test/StepDefination"}
		)
	

public class TestRunner {
	
	TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun=true)
	public void setup(){
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(description="Run features", dataProvider="xxx")
	public void executeTest(PickleEventWrapper eventWrapper, CucumberFeatureWrapper rap) throws Throwable{
		
		testNGCucumberRunner.runScenario(eventWrapper.getPickleEvent());
	}
	
	@DataProvider(name="xxx")
	public Object[][] feature(){
		return testNGCucumberRunner.provideScenarios();
		
	}
	
	@AfterClass
	public void tearDown(){
		testNGCucumberRunner.finish();
	}

}
