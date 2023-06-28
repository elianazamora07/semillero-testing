package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarItem;
import com.amazon.tasks.SeleccionarPrecio;
import com.amazon.tasks.VerificarElementoFiltroPrecio;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static com.amazon.page.ResultadosBusqueda.INPUT_PRECIO_MIN_MAX;
import static org.hamcrest.Matchers.is;

public class FiltrarPorPrecioStepDefinitions {

    @Cuando("busco {string} y aplico el filtro de rango por precio")
    public void aplico_el_filtro_de_rango_por_precio_de_a(String item) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                BuscarItem.buscarItemConEnvioColombia(item),
                SeleccionarPrecio.precioMinMax()
        );
    }

    @Entonces("el filtro de <PrecioSeleccionado> debe estar seleccionado")
    public void se_muestran_solo_items_que_se_encuentran_dentro_del_rango_de_precios_especificado() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(VerificarElementoFiltroPrecio.precioSelect(INPUT_PRECIO_MIN_MAX), Matchers.is(true))
        );
    }
}
