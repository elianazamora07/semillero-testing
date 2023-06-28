package com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.targets.Target;

public class VerificarElementoFiltroEnvioGratis implements Question<Boolean> {
    private Target filtroEnvioGratis;

    public VerificarElementoFiltroEnvioGratis(Target filtroEnvioGratis) {
        this.filtroEnvioGratis = filtroEnvioGratis;
    }

    public static VerificarElementoFiltroEnvioGratis EnvioGratis(Target filtroEnvioGratis) {
        return new VerificarElementoFiltroEnvioGratis(filtroEnvioGratis);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        ScrollToTarget scroll = new ScrollToTarget(filtroEnvioGratis);
        scroll.performAs(actor);
        boolean isSelected = filtroEnvioGratis.resolveFor(actor).isSelected();
        return isSelected;
    }
}