package com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class VerificarElementoFiltroPrecio implements Question<Boolean> {
    private Target filtroPrecio;

    public VerificarElementoFiltroPrecio(Target filtroPrecio) {
        this.filtroPrecio = filtroPrecio;
    }

    public static VerificarElementoFiltroPrecio precioSelect(Target filtroPrecio) {
        return new VerificarElementoFiltroPrecio(filtroPrecio);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String classAttributeValue = filtroPrecio.resolveFor(actor).getAttribute("class");
        return classAttributeValue.contains("bold");
    }
}