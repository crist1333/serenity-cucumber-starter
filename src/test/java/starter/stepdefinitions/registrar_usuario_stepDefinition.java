package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;
import starter.search.WikipediaArticle;

public class registrar_usuario_stepDefinition {

    @Given("{actor} ingresar petstore")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theWikipediaHomePage());
    }

    @When("{actor} selecciona texto sign in {string}")
    public void SingIn(Actor actor, String term) {
        actor.attemptsTo(
                LookForInformation.signIn()
        );
    }

    @And("{actor} selecciona boton register now {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                LookForInformation.register()
        );
    }

    public void llenarCampo(Actor actor, String term) {
        actor.attemptsTo(
                LookForInformation.UserId()
        );
    }


    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(WikipediaArticle.HEADING).hasText(term)
        );

    }
}
