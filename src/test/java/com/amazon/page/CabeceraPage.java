package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CabeceraPage {
    public static Target INPUT_BARRA_BUSQUEDA = Target.the("barra de busqueda").located(By.id("twotabsearchtextbox"));
    public static Target BUT_CARRITO  = Target.the("boton carrito").located(By.id("nav-cart"));

    public static Target INPUT_TODOS  = Target.the("boton Todos").located(By.id("nav-search-dropdown-card"));

    public static Target SELECT_TODOS  = Target.the("select Todos").locatedBy("//select[@id='searchDropdownBox']//option[contains(text(),'Insumos para mascotas')]");
}
