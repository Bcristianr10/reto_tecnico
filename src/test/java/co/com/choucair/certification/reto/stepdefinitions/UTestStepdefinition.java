package co.com.choucair.certification.reto.stepdefinitions;

import co.com.choucair.certification.reto.model.UTestData;
import co.com.choucair.certification.reto.questions.Answer;
import co.com.choucair.certification.reto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UTestStepdefinition {

    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());}

    @Given("^Brandon wants to join the tester community$")
    public void brandonWantsToJoinTheTesterCommunity() {
        OnStage.theActorCalled("brandon").wasAbleTo(OpenUp.thePage());
    }


    @When("^fill in the fields of each section on the UTest page$")
    public void fillInTheFieldsOfEachSectionOnTheUTestPage(List<UTestData> uTestData) throws Exception {


        OnStage.theActorInTheSpotlight()
                .attemptsTo(StepOne.thePage(uTestData.get(0).getPersonalData()),
                            StepTwo.thePage(uTestData.get(0).getPersonalLocation()),
                            StepThree.thePage(uTestData.get(0).getComputerData(),
                                              uTestData.get(0).getMobileDeviceData()),
                            StepFour.thePage(uTestData.get(0).getStrPassword())
        );


    }

    @Then("^successful registration$")
    public void successfulRegistration(List<UTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer
                .toThe(uTestData.get(0).strConfirmWelcome())));
    }
}
