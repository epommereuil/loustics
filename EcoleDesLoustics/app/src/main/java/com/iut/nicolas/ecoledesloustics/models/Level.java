package com.iut.nicolas.ecoledesloustics.models;

import com.orm.SugarRecord;

/**
 * Created by eric on 25/03/2017.
 */
public class Level extends SugarRecord {
    Student student;
    Category category;

    public Level()
    {
    }
}
