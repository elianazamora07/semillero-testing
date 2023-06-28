package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarItem;
import com.amazon.tasks.SeleccionarComprarAhora;
import com.amazon.tasks.VerificarComprarAhora;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import static com.amazon.page.CabeceraPage.BUT_CARRITO;
import static com.amazon.page.ComprarAhora.INICIO_SESION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import static com.amazon.page.CarritoPage.LIST_ITEMS;

public class AgregarCarritoStepDefinitions {

    @Cuando("agrego un {string} al carrito")
    public void agregoUnItemAlCarrito(String item) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                BuscarItem.conEnvioColombia(item)
        );
    }

    @Entonces("debe verse {int} item(s) en el carrito de compras")
    public void verNumeroItemsEnCarrito(Integer numeroitems) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(BUT_CARRITO),
                Ensure.that(LIST_ITEMS).textValues().hasSize(numeroitems)
        );
    }

    @Cuando("{actor} agrega al carrito los items")
    public void agregarVariosItemsCarrito(Actor actor, io.cucumber.datatable.DataTable dataTable) {
        actor.attemptsTo(Open.url("https://www.amazon.com"));
        dataTable.asList().stream().forEach( item -> {
            actor.attemptsTo(BuscarItem.conEnvioColombia(item));
        });
    }

    @Cuando("busco un {string} y lo compro")
    public void buscoUnItemLoCompro(String item) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                BuscarItem.seleccionarItem(item),
                SeleccionarComprarAhora.comprarAhora()
        );
    }
    @Entonces("se muestra la pagina de <iniciarSesion>")
    public void seMuestraLaPaginaDeIniciarSesion() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(VerificarComprarAhora.localiza(INICIO_SESION), is(true))
        );

    }
}
