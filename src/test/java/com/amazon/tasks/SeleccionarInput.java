package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.ResultadosBusqueda.FILTRO_MARCA;

public class SeleccionarInput {
    public static Performable conFiltro(String marca) {
        return Task.where("{0} buscando items",
                Click.on(FILTRO_MARCA.of(marca))
        );

    }
}
