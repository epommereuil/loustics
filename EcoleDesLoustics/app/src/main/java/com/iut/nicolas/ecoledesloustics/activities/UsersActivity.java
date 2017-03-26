package com.iut.nicolas.ecoledesloustics.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.iut.nicolas.ecoledesloustics.R;
import com.iut.nicolas.ecoledesloustics.adapters.UserAdapter;
import com.iut.nicolas.ecoledesloustics.models.db.Student;
import com.iut.nicolas.ecoledesloustics.models.StudentContext;

import java.util.List;

public class UsersActivity extends AppCompatActivity {
    private Button mNewStudent;
    private ListView mListViewStudents;
    private Button mGuest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        mNewStudent = (Button) findViewById(R.id.newStudent);
        mListViewStudents = (ListView) findViewById(R.id.listStudents);
        mGuest = (Button) findViewById(R.id.guest);

        mNewStudent.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                newStudent();
            }
        });

        mGuest.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(UsersActivity.this,CategoryActivity.class);
                startActivity(intent);
            }
        });

        mListViewStudents.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student currentStudent = (Student) parent.getItemAtPosition(position);

                StudentContext.getInstance().setCurrentStudent(currentStudent);
                Intent intent = new Intent(UsersActivity.this,CategoryActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onResume()
    {
        super.onResume();
        updateListUsers();
    }

    private void newStudent()
    {
        // lancer l'activity register
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }

    private void updateListUsers()
    {
        //RECUPERATION PAR LA BDD DES STUDENTS INSCRITS
        List<Student> mListStudents = Student.listAll(Student.class);
        //GESTION DE LA LISTE DES USERS
        UserAdapter adapter = new UserAdapter(UsersActivity.this,mListStudents);
        mListViewStudents.setAdapter(adapter);

    }
}
