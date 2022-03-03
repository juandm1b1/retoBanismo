package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.BancolombiaData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.AccessThrough;
import tasks.OpenUp;
import tasks.SwitchToNewWindow;

import java.util.List;

public class invVirtualStepDefinitions {

    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast()); }

    @Given("^than Juan wants to see the Reglamento Inversion Virtual Bancolombia document$")
    public void thanJuanWantsToSeeTheReglamentoInversionVirtualBancolombiaDocument() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage());
    }

    @When("^he follows the route in the website$")
    public void heFollowsTheRouteInTheWebsite() {
        OnStage.theActorInTheSpotlight().attemptsTo(AccessThrough.theLinks());
        OnStage.theActorInTheSpotlight().attemptsTo(SwitchToNewWindow.switchToNewTab());
    }

    @Then("^he sees the document$")
    public void heSeesTheDocumentReglamentoInversionVirtualBancolombia(List<BancolombiaData> bancolombiaData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(bancolombiaData.get(0))));
    }
}
