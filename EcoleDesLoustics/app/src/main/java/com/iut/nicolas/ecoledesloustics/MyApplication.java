package com.iut.nicolas.ecoledesloustics;

import android.app.Application;
import android.os.Bundle;

import com.iut.nicolas.ecoledesloustics.models.Category;
import com.iut.nicolas.ecoledesloustics.models.StudentContext;
import com.orm.SugarContext;

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
        if(Category.find(Category.class,"id_category = ?",StudentContext.IDMath).size()==0)
        {
            Category category = new Category(StudentContext.IDMath,"Mathématique");
            category.save();
        }

        if(Category.find(Category.class,"id_category = ?",StudentContext.IDGeo).size()==0)
        {
            Category category = new Category(StudentContext.IDGeo,"Géographie");
            category.save();
        }

        if(Category.find(Category.class,"id_category = ?", StudentContext.IDFrancais).size()==0)
        {
            Category category = new Category(StudentContext.IDFrancais,"Francais");
            category.save();
        }
    }

}
