package com.imastudio.belajardagger.DenganDagger2;

import dagger.Component;

@Component(modules = Training.class)
interface KomponenPerang {
    PerangWalkerWithDI perang();
    //adding more methods
    Alexandria getAlexandria();
    TheKingdom getThekingdom();
    IDN getIDN();
    IMASTUDIO getIMASTUDIO();


}
class Pertempuranwalker {
    //
   public static void main(String[] args){
////        Mannual DI
////        Starks starks = new Starks();
////        Boltons boltons = new Boltons();
////        War war = new War(starks,boltons);
////        war.prepare();
////        war.report();
//
////      Using Dagger 2 inject dan component

//       KomponenPerang component = DaggerKomponenPerang.create();
//    PerangWalkerWithDI perangwalker = component.perang();
//    perangwalker.persiapan();
//        perangwalker.istirahat();


       //using dagger 2 provider dan component
       IDN idn = new IDN();
       IMASTUDIO imastudio = new IMASTUDIO();

       KomponenPerang component = DaggerKomponenPerang
               .builder().training(new Training(idn, imastudio)).build();
       PerangWalkerWithDI perangWalkerWithDI = component.perang();
       perangWalkerWithDI.persiapan();
       perangWalkerWithDI.istirahat();
       //using cash and soldiers
       component.getIDN();
       component.getIMASTUDIO();
}

    }