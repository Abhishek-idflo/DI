package com.example.di;

import android.util.Log;

public class Car {
    MainActivity obj= new MainActivity();

    public String startCar() {
        Log.d("car","Car started.");

        Engine engine=new Engine();

        engine.startEngine();
       // obj.displayToast("Engine Started");
        return "Car Started";
    }
}
