package com.iut.nicolas.ecoledesloustics;

import android.app.Application;
import android.util.Log;

import com.google.gson.GsonBuilder;
import com.iut.nicolas.ecoledesloustics.models.Exercises;
import com.iut.nicolas.ecoledesloustics.models.StudentContext;
import com.orm.SugarContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by eric on 25/03/2017.
 */
public class MyApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        SugarContext.init(MyApplication.this);

        init();
    }


    public void init()
    {
        String json = loadJSONFromAsset("exercises.json");
        StudentContext.getInstance().setExercises(new GsonBuilder().create().fromJson(json, Exercises.class));
        Log.d("toto","");
    }

    private String loadJSONFromAsset(String name) {
        String json = null;
        try {
            InputStream is = getAssets().open(name);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
