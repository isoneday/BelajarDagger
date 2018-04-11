//package com.imastudio.belajardagger;
//
//
//import javax.inject.Inject;
//
//import dagger.Component;
//import dagger.Provides;
//
//@Component
//interface DoSomething2 {
//    Makanan getdata();
//}
//
//public class BelajarDagger2 {
//
//    @Provides
//    @Inject
//    public  void main(String[] args){
//
//        //manual DI
//        Lauk lauk = new Lauk();
//        Nasi nasi = new Nasi();
//        Makanan makanan = new Makanan(lauk,nasi);
//        makanan.aksimakanpagi();
//        makanan.aksimakansiang();
//
//
//        //menggunakan Dagger2
//     //   DoSomething2 something2 =
//    }
//
//}
