package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleItem {
    public static Target BUT_AGREGAR_CARRITO = Target.the("botón agregar carrito en detalle del item").located(By.id("add-to-cart-button"));
    public static Target TEXTO_CANTIDAD_EN_STOCK = Target.the("texto solo quedan unidades en stock").locatedBy("//div[@id='desktop_qualifiedBuyBox']//div[@id='availability']//span[contains(text(),'Solo queda(n)')]");
    public static Target TEXTO_DISPONIBLE = Target.the("texto Disponible").locatedBy("//div[@id='desktop_qualifiedBuyBox']//div[@id='availability']//span[contains(text(),'Disponible')]");
}
