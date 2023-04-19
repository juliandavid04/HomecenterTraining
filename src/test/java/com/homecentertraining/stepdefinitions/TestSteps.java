package com.homecentertraining.stepdefinitions;

import com.homecenter.search.HomePage;
import com.homecenter.search.RegistrationForm;
import com.homecentertraining.navigation.NavigateTo;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TestSteps{

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
	
	@Given("The {} is on the homecenter home page")
	public void theUserIsOnTheHomecenterPage(String actor) {
		theActorCalled(actor).attemptsTo(
				NavigateTo.theHomecenterHomePage()
				);
	}

	@When("The user clicks on my account button")
	public void theUserClicksOnMyAccountButton() {
		 theActorInTheSpotlight().attemptsTo(
				 Click.on(HomePage.MyAccount_button)
				 );
	}

	@When("The user clicks on create sodimac account button")
	public void theUserClicksOnCreateSodimacAccountButton() {
		 theActorInTheSpotlight().attemptsTo(
				 Click.on(HomePage.CreateAccount_button)
				 );
	}

	@When("The user inserts the name {} and surname {}")
	public void theUserInsertsTheNameAndSurname(String name, String surname) {
		 theActorInTheSpotlight().attemptsTo(
				 Enter.theValue(name).into(RegistrationForm.Name_input),
				 Enter.theValue(surname).into(RegistrationForm.Surname_input)
				 );
	}

	@When("The user selects the type of document {} and inserts the document {}")
	public void theUserSelectsTheTypeOfDocumentAndInsertsTheDocument(String typeOfDocument, String Document) {
		 theActorInTheSpotlight().attemptsTo(
				 Enter.theValue(typeOfDocument).into(RegistrationForm.Document_dropdown),
				 Enter.theValue(Document).into(RegistrationForm.Document_input)
				 );
	}

	@When("The user inserts the phone {} and selects the type of taxpayer {}")
	public void theUserInsertsThePhoneAndSelectsTheTypeOfTaxpayer(String phone, String taxpayer) {
		 theActorInTheSpotlight().attemptsTo(
				 Enter.theValue(phone).into(RegistrationForm.Phone_input),
				 Enter.theValue(taxpayer).into(RegistrationForm.TaxPayer_dropdown)
				 );
	}

	@When("The user inserts the email {} and password {}")
	public void theUserInsertsTheEmailAndPassword(String email, String password) {
		 theActorInTheSpotlight().attemptsTo(
				 Enter.theValue(email).into(RegistrationForm.Email_input),
				 Enter.theValue(password).into(RegistrationForm.Password_input)
				 );
	}

	@When("The user checks the terms and conditions")
	public void theUserChecksTheTermsAndConditions() {
		 theActorInTheSpotlight().attemptsTo(
				 Click.on(RegistrationForm.Points_checkBox),
				 Click.on(RegistrationForm.Terms_checkBox)
				 );
	}

	@When("The user clicks on create my account button")
	public void theUserClicksOnCreateMyAccountButton() {
		 theActorInTheSpotlight().attemptsTo(
				 Click.on(RegistrationForm.CreateAccount_button)
				 );
	}
/*
	@Then("The user validates the successful user creation")
	public void theUserValidatesTheSuccessfulUserCreation() {
		 System.out.println("GENIAL BUEN TRABAJO");
	}
*/
}