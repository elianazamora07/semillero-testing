package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultadosBusqueda {
    public static Target ITEM_COMPRA_ENVIO_COLOMBIA = Target.the("item buscado con envio a Colombia").locatedByFirstMatching("//span[contains(text(),'Colombia')]/ancestor::div[@data-csa-c-type='item']//img");

    public static Target FILTRO_MARCA_LABEL = Target.the("label of input marca").locatedBy("//div[@id='brandsRefinements']//li[@id='p_89/HP']//label");
    public static Target FILTRO_MARCA_INPUT = Target.the("input marca").locatedBy("//div[@id='brandsRefinements']//li[@id='p_89/HP']//label//input");
    public static Target INPUT_PRECIO_MIN_MAX = Target.the("input precio minimo").locatedBy("//li[@id='p_36/14674875011']//span[contains(text(),'150')]");
    public static Target FILTRO_ENVIO_GRATIS_LABEL = Target.the("input precio minimo").locatedBy("//li[@id='p_n_is_free_shipping/10236242011']//label");
    public static Target FILTRO_ENVIO_GRATIS_INPUT = Target.the("input marca").locatedBy("//li[@id='p_n_is_free_shipping/10236242011']//label//input");
}
