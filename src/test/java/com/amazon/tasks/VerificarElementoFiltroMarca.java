package com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.targets.Target;

public class VerificarElementoFiltroMarca implements Question<Boolean> {
    private Target filtroMarca;

    public VerificarElementoFiltroMarca(Target filtroMarca) {
        this.filtroMarca = filtroMarca;
    }

    public static VerificarElementoFiltroMarca seleccionado(Target filtroMarca) {
        return new VerificarElementoFiltroMarca(filtroMarca);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println("Verifying if element is selected: " + filtroMarca);
        ScrollToTarget scroll = new ScrollToTarget(filtroMarca);
        scroll.performAs(actor);
        boolean isSelected = filtroMarca.resolveFor(actor).isSelected();
        System.out.println("Is element selected? " + isSelected);
        return isSelected;
    }
}