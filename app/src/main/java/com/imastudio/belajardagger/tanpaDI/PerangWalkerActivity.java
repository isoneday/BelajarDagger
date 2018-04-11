//package com.imastudio.belajardagger.tanpaDI;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//import com.imastudio.belajardagger.R;
//
//public class PerangWalkerActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_perang_walker);
//
//        Senjata senjata = new Senjata();
//        Sekutu sekutu = new Sekutu();
//        Alexandria alexandria = new Alexandria(senjata,sekutu);
//        TheKingdom theKingdom = new TheKingdom(senjata,sekutu);
//
//        PerangWalkerWithDI perangWalker = new PerangWalkerWithDI(alexandria,theKingdom);
//        perangWalker.persiapan();
//        perangWalker.istirahat();
//    }
//}
