package com.iut.nicolas.ecoledesloustics.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.iut.nicolas.ecoledesloustics.R;
import com.iut.nicolas.ecoledesloustics.adapters.CategoryAdapter;
import com.iut.nicolas.ecoledesloustics.models.Category;
import com.iut.nicolas.ecoledesloustics.models.StudentContext;

import java.util.List;

public class CategoryActivity extends AppCompatActivity {
    private TextView mWelcomMessage;
    private ListView mListViewCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        mWelcomMessage = (TextView) findViewById(R.id.welcomeMessage);
        mListViewCategories = (ListView) findViewById(R.id.listCategories);

        if(StudentContext.getInstance().getCurrentStudent()!=null){
            mWelcomMessage.setText("Bienvenue "+StudentContext.getInstance().getCurrentStudent().getFirstname()+" !");
        }

        mListViewCategories.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Category currentCategory = (Category) parent.getItemAtPosition(position);

                StudentContext.getInstance().setCategory(currentCategory);
                Intent intent = new Intent(CategoryActivity.this,ExerciseActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onResume()
    {
        super.onResume();
        updateListCategories();
    }

    private void updateListCategories()
    {
        //GESTION DE LA LISTE DES USERS
        CategoryAdapter adapter = new CategoryAdapter(CategoryActivity.this,StudentContext.getInstance().getExercises().categories);
        mListViewCategories.setAdapter(adapter);

    }
}
