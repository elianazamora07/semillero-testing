package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosBusqueda {
    public static Target ITEM_COMPRA_ENVIO_COLOMBIA = Target.the("item buscado con envio a Colombia").locatedByFirstMatching("//span[contains(text(),'Colombia')]/ancestor::div[@data-csa-c-type='item']//img");

    public static Target FILTRO_MARCA_LABEL = Target.the("label of input marca").locatedBy("//div[@id='brandsRefinements']//li[@id='p_89/HP']//label");
    public static Target FILTRO_MARCA_INPUT = Target.the("input marca").locatedBy("//div[@id='brandsRefinements']//li[@id='p_89/HP']//label//input");

}
