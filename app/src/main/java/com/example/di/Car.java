package com.example.di;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private Engine engine;

    @Inject
    Car(Engine engine){
        this.engine = engine;
    }

    public String startCar() {
        Log.d("car","Car started.");

        engine.startEngine();
       // obj.displayToast("Engine Started");
        return "Car Started";
    }
}
