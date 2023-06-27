package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarItem;
import com.amazon.tasks.SeleccionarItem;
import com.amazon.tasks.VerificarDisponiblidadItem;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.amazon.page.DetalleItem.TEXTO_CANTIDAD_EN_STOCK;
import static com.amazon.page.DetalleItem.TEXTO_DISPONIBLE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class VerificarDisponibilidadItemStepDefinitions {
    @Cuando("realizo una busqueda de un item {string}")
    public void realizo_una_busqueda_de_un_item(String item) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                BuscarItem.buscarItemConEnvioColombia(item),
                SeleccionarItem.itemEnvioColombia()

        );
    }


    @Entonces("el item tiene una etiqueta <disponible> indicando que esta en stock")
    public void el_item_tiene_una_etiqueta_indicando_que_esta_en_stock() {
        OnStage.theActorCalled("comprador").should(
                seeThat(VerificarDisponiblidadItem.visible(TEXTO_DISPONIBLE, TEXTO_CANTIDAD_EN_STOCK), is(true))
        );
    }
}
