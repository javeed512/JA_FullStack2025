package com.hexaware.junit5.test.suites;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//@SelectClasses({AdditionTest.class , SubstractionTest.class , MultiplicationTest.class})

@SelectPackages({"com.hexaware.junit5.test.suites"})

@IncludeTags({"MTag","AddTag","dev"})
//@IncludeTags("dev")
//@ExcludeTags("dev")
class CalculatorTestSuite {


	
}
