package com.iut.nicolas.ecoledesloustics.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.iut.nicolas.ecoledesloustics.R;
import com.iut.nicolas.ecoledesloustics.models.Student;

/**
 * Created by eric on 25/03/2017.
 */

public class RegisterActivity extends AppCompatActivity {
    private Button mSave;
    private TextView mFirstName;
    private TextView mName;
    private TextView mAge;



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mSave = (Button) findViewById(R.id.save);
        mFirstName =(TextView) findViewById(R.id.inputFirstName);
        mName = (TextView) findViewById(R.id.inputName);
        mAge = (TextView) findViewById(R.id.inputAge);

        mSave.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(!TextUtils.isEmpty((mName.getText())) && !TextUtils.isEmpty((mFirstName.getText())) && !TextUtils.isEmpty((mAge.getText())))
                    saveStudent(mName.getText().toString(),mFirstName.getText().toString(),mAge.getText().toString());
            }

        });


    }

    public void saveStudent(String name, String firstName, String age)
    {
        Student student = new Student(name,firstName,Integer.parseInt(age));
        student.save();
        finish();
    }

}
