package com.imastudio.belajardagger.DenganDagger2;


import javax.inject.Inject;

public class Alexandria implements Rumah {

    //Field injection
    @Inject
    Senjata senjata;

    //Constructor injection
    @Inject
    public Alexandria() {
    }
    //Constructor injection
    public Alexandria(Senjata senjata, Sekutu sekutu) {

    }
    //Method injection
    @Inject
    @Override
    public void persiapanperang() {
        System.out.println(this.getClass().getSimpleName()+" persiapan perang");

    }

    @Override
    public void istirahat() {
        System.out.println(this.getClass().getSimpleName()+" istirahat");

    }
}
