package com.imastudio.belajardagger.DenganDagger2;

import dagger.Module;
import dagger.Provides;

@Module //The module
public class Training {
    IDN idn;
    IMASTUDIO imastudio;


    public Training(IDN idn, IMASTUDIO imastudio) {
        this.idn = idn;
        this.imastudio = imastudio;
    }

    @Provides
        //Provides IDN dependency
    IDN trainingIdn() {
        return idn;
    }

    @Provides
        //Provides IMASTUDIO dependency
    IMASTUDIO trainingImastudio() {
        return imastudio;
    }
}
