package com.imastudio.belajardagger.DenganDagger2;


import javax.inject.Inject;

public class PerangWalkerWithDI {

    private Alexandria alexandria;

    private TheKingdom theKingdom;
    //DI - getting dependencies from else where via constructor
    //contoh konstruktor DI
    @Inject
    public PerangWalkerWithDI(Alexandria alexandria1, TheKingdom theKingdom1){
        alexandria = alexandria1;
        theKingdom = theKingdom1;
    }
    public void persiapan(){
        alexandria.persiapanperang();
        theKingdom.persiapanperang();
    }

    public void istirahat(){
        alexandria.istirahat();
        theKingdom.istirahat();
    }


}