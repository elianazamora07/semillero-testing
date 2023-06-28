package com.amazon.tasks;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.amazon.page.CabeceraPage.*;

public class BuscarItem {
    public static Performable conEnvioColombia(String item) {
        return Task.where("{0} buscando el item ´" + item + "´ con envío a Colombia",
                Enter.theValue(item).into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER),
                SeleccionarItem.conEnvioColombia()
        );
    }

    public static Performable buscarItemConEnvioColombia(String item) {
        return Task.where("{0} buscando el item ´" + item + "´ con envío a Colombia",
                Enter.theValue(item).into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER)
        );
    }

    public static Performable conFiltroTodos(String item) {
        return Task.where("{0} buscando el item ´" + item,
                Click.on(INPUT_TODOS),
                Click.on(SELECT_TODOS),
                Enter.theValue(item).into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER)

        );
    }

    public static Performable seleccionarItem(String item) {
        return Task.where("{0} buscando el item ´" + item + "´ con envío a Colombia",
                Enter.theValue(item).into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER),
                SeleccionarItem.itemEnvioColombia()
        );
    }

}
