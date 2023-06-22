package com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.targets.Target;

public class VerificarElementosDeMarca implements Question<Boolean> {
    private Target filtroMarca;

    public VerificarElementosDeMarca(Target filtroMarca) {
        this.filtroMarca = filtroMarca;
    }

    public static VerificarElementosDeMarca seleccionado(Target filtroMarca) {
        return new VerificarElementosDeMarca(filtroMarca);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return filtroMarca.resolveFor(actor).isSelected();
    }
}