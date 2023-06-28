package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.ResultadosBusqueda.*;

public class SeleccionarPrecio {
    public static Performable precioMinMax() {
        return Task.where("{0} buscando items",
                Click.on(INPUT_PRECIO_MIN_MAX)
        );

    }
}
