package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosBusqueda {
    public static Target ITEM_COMPRA_ENVIO_COLOMBIA = Target.the("item buscado con envio a Colombia").locatedByFirstMatching("//span[text()='Con envíos a Colombia']/ancestor::div[@data-csa-c-type='item']//img");
}
