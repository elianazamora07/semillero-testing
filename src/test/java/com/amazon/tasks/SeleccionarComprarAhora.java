package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.DetalleItem.BOTON_COMPRAR_AHORA;

public class SeleccionarComprarAhora {
    public static Performable comprarAhora() {
        return Task.where("{0} buscando items",
                Click.on(BOTON_COMPRAR_AHORA)
        );

    }
}
