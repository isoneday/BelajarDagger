package com.imastudio.belajardagger.DenganDagger2;


import javax.inject.Inject;

public class TheKingdom implements Rumah {

    @Inject
    public TheKingdom() {
    }

    public TheKingdom(Senjata senjata, Sekutu sekutu) {

    }

    @Override
    public void persiapanperang() {
        System.out.println(this.getClass().getSimpleName()+" persiapan perang");

    }

    @Override
    public void istirahat() {
        System.out.println(this.getClass().getSimpleName()+" istirahat");

    }
}
