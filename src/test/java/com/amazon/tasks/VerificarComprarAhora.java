package com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class VerificarComprarAhora implements Question<Boolean> {

    private Target inicioSesion;

    public VerificarComprarAhora(Target inicioSesion) {
        this.inicioSesion = inicioSesion;
    }


    public static   VerificarComprarAhora localiza(Target inicioSesion) {
        return new VerificarComprarAhora(inicioSesion);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean isVisible = inicioSesion.resolveFor(actor).isVisible();
        return isVisible;
    }
}
