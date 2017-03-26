package com.iut.nicolas.ecoledesloustics.models;

import com.orm.SugarRecord;

/**
 * Created by eric on 25/03/2017.
 */
public class Exercise extends SugarRecord{
    String mName;
    Category mCategory;

    public Exercise()
    {

    }

    public Exercise(String name)
    {
        mName = name;
    }
}
