package com.kodiapps.fast.free.secure.dagger2_pactices.classFile;

import android.app.Application;
import android.text.NoCopySpan;

import com.kodiapps.fast.free.secure.dagger2_pactices.component.DaggerLoginComponent;
import com.kodiapps.fast.free.secure.dagger2_pactices.component.LoginComponent;

public class MyApplicationClass extends Application {

    public  static LoginComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerLoginComponent
                .builder()
                .build();
    }
}
