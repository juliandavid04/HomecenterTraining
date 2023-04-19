package com.homecentertraining.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/com/homecentertraining/features/Test.feature",
	glue={"com.homecentertraining.stepdefinitions"},
	tags="@TestJulian",
	snippets = SnippetType.CAMELCASE)
public class TestRunner {

}