package com.jesus.practica1;

import android.app.Application;
import android.util.Log;

/**
 * Created by Usuario on 30/09/2017.
 */

public class Aplicacion extends Application {

    private static final String TAG = Aplicacion.class.getName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "Entro a la clase aplicacon");
    }
}
