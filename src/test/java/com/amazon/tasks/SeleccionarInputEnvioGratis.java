package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.ResultadosBusqueda.FILTRO_ENVIO_GRATIS_LABEL;


public class SeleccionarInputEnvioGratis {
     public static Performable conFiltroEnvio() {
          return Task.where("{0} buscando items",
                  Click.on(FILTRO_ENVIO_GRATIS_LABEL)
          );

     }
}