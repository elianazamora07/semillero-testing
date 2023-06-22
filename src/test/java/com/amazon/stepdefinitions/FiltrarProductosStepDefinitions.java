package com.amazon.stepdefinitions;


import com.amazon.tasks.BuscarItem;
import com.amazon.tasks.SeleccionarInput;
import com.amazon.tasks.VerificarElementosDeMarca;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.amazon.page.ResultadosBusqueda.FILTRO_MARCA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

;

public class FiltrarProductosStepDefinitions {


    @Cuando("{actor} aplica el filtro de {string} por marca {string}")
    public void aplicoElFiltroDeItemPorMarca(String item, String marca) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                BuscarItem.buscarConEnvioColombiaFiltro(item),
                SeleccionarInput.conFiltro(marca)
        );
    }

   /* @Entonces("{actor} puede ver el input de {string} seleccionado")
    public void debeVerseInputMarcaSeleccionado(Actor actor, String marcaSeleccionada) {
        OnStage.theActorCalled("comprador").should(
                seeThat(VerificarElementosDeMarca.seleccionado(FILTRO_MARCA.of(marcaSeleccionada)).answeredBy(actor), equalTo(true))
        );
    }     */
}
