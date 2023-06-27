package com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class VerificarDisponiblidadItem implements Question<Boolean> {
    private Target opt1;
    private Target opt2;

    public VerificarDisponiblidadItem(Target opt1) {
        this.opt1 = opt1;
    }

    public VerificarDisponiblidadItem(Target opt1, Target opt2) {
        this.opt1 = opt1;
        this.opt2 = opt2;
    }

    public static VerificarDisponiblidadItem visible (Target opt1) {
        return new VerificarDisponiblidadItem(opt1);
    }

    public static VerificarDisponiblidadItem visible (Target opt1, Target opt2) {
        return new VerificarDisponiblidadItem(opt1, opt2);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean isVisibleOpt1 = opt1.resolveFor(actor).isVisible();

        if(opt2 != null) {
            boolean isVisibleOpt2 = opt2.resolveFor(actor).isVisible();
            return isVisibleOpt1 || isVisibleOpt2;
        }
        return isVisibleOpt1;
    }
}