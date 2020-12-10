package co.com.choucair.pruebabancolombia.stepdefinitions;

import co.com.choucair.pruebabancolombia.model.PruebaBancolombiaData;
import co.com.choucair.pruebabancolombia.questions.Answer;
import co.com.choucair.pruebabancolombia.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class PruebaBancolombiaStepDefinions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than luis wants to create a new record in uTest$")
    public void thanLuisWantsToCreateANewRecordInUTest() {
        OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thePage());
    }

    @When("^he enter the information corresponding to the record$")
    public void heEnterTheInformationCorrespondingToTheRecord(List<PruebaBancolombiaData> pruebaBancolombiaData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(PersonalInformation.the(pruebaBancolombiaData.get(0).getStrFirstName(),
                pruebaBancolombiaData.get(0).getStrLastName(),pruebaBancolombiaData.get(0).getStrEmail(),
                pruebaBancolombiaData.get(0).getStrMonth(),pruebaBancolombiaData.get(0).getStrDay(),pruebaBancolombiaData.get(0).getStrYear()),
                Location.the(pruebaBancolombiaData.get(0).getStrCity(),pruebaBancolombiaData.get(0).getStrPostalCode()), Device.the(),
                LastStep.the(pruebaBancolombiaData.get(0).getStrPasword()));
    }

    @Then("^He will have a registered user within the uTest page$")
    public void heWillHaveARegisteredUserWithinTheUTestPage(List<PruebaBancolombiaData> pruebaBancolombiaData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(pruebaBancolombiaData.get(0).getStrText())));

    }
}
