package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarItem;
import com.amazon.tasks.SeleccionarInputEnvioGratis;
import com.amazon.tasks.VerificarElementoFiltroEnvioGratis;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.amazon.page.ResultadosBusqueda.FILTRO_ENVIO_GRATIS_INPUT;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class FiltroEnvioGratisStepDefinitions {

    @Cuando("aplico el filtro de {string} por Elegible para Envio Gratis")
    public void aplicoElFiltroDePorElegibleParaEnviGratis(String item) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                BuscarItem.conFiltroTodos(item),
                SeleccionarInputEnvioGratis.conFiltroEnvio()
        );
    }

    @Entonces("el filtro de <EnvioGratis> debe estar seleccionado")
    public void elFiltroDeEnvioGratisDebeEstarSeleccionado() {

        OnStage.theActorCalled("comprador").should(
                seeThat(VerificarElementoFiltroEnvioGratis.EnvioGratis(FILTRO_ENVIO_GRATIS_INPUT), is(true))
        );
    }
}


