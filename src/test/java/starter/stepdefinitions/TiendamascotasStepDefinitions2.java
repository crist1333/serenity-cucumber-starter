package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;
import starter.search.SearchForm;
import starter.search.WikipediaArticle;

public class TiendamascotasStepDefinitions2 {

    @Given("{actor} ingreso al sitio de mascotas")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.thePetStorePage());
    }

    @When("{actor} selecciono la categoria de la mascota")
    public void seleccionarCategoriaMascota(Actor actor) {
        actor.attemptsTo(
                LookForInformation.categoria()
        );
        
    }


   @And("{actor} selecciono la mascota que quiero")
   public void SeleccionarAnimal(Actor actor) {
    actor.attemptsTo(
            LookForInformation.animal()
    );
    
}
    

    @Then("{actor} se agrega al carrito de compras")
    public void AgregarCarritoDeCompras(Actor actor) {
        actor.attemptsTo(
        		LookForInformation.anadirCarrito(),
                Ensure.that(SearchForm.TITTLE_BY_CAR).isDisabled()
        );
    }
}
