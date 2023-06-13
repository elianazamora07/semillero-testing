package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.DetalleItem.BUT_AGREGAR_CARRITO;
import static com.amazon.page.ResultadosBusqueda.ITEM_COMPRA_ENVIO_COLOMBIA;

public class SeleccionarItems {

    public static Performable conEnvioColombia() {
        return Task.where("{0} buscando items con envío a Colombia",
                Click.on(ITEM_COMPRA_ENVIO_COLOMBIA),
                Click.on(BUT_AGREGAR_CARRITO)
        );
    }
}
