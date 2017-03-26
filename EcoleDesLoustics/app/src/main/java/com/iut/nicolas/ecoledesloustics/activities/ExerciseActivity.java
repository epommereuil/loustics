package com.iut.nicolas.ecoledesloustics.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.iut.nicolas.ecoledesloustics.R;

public class ExerciseActivity extends AppCompatActivity {

    private TextView mNameCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
    }
}
