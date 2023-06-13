package com.amazon.tasks;


import static com.amazon.page.CabeceraPage.INPUT_BARRA_BUSQUEDA;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class BuscarItem {
    public static Performable conEnvioColombia(String item) {
        return Task.where("{0} buscando el item ´" + item + "´ con envío a Colombia",
                Enter.theValue(item).into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER),
                SeleccionarItems.conEnvioColombia()
        );
    }
}
