package com.amazon.stepdefinitions;


import com.amazon.tasks.BuscarItem;
import com.amazon.tasks.SeleccionarInput;
import com.amazon.tasks.VerificarElementoFiltroMarca;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import static com.amazon.page.ResultadosBusqueda.FILTRO_MARCA_INPUT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

;

public class FiltrarProductosStepDefinitions {


    @Cuando("aplico el filtro de {string} por marca")
    public void aplicoElFiltroDeItemPorMarca(String item) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                BuscarItem.buscarItemConEnvioColombia(item),
                SeleccionarInput.conFiltro()
        );
    }

    @Entonces("el filtro de <MarcaSeleccionada> debe estar seleccionado")
    public void debeVerseInputMarcaSeleccionado() {
        OnStage.theActorCalled("comprador").should(
                seeThat(VerificarElementoFiltroMarca.seleccionado(FILTRO_MARCA_INPUT), is(true))
        );
    }
}
