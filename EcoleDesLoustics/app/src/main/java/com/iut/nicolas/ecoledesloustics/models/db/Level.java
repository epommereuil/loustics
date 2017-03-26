package com.iut.nicolas.ecoledesloustics.models.db;

import com.orm.SugarRecord;

/**
 * Created by eric on 25/03/2017.
 */
public class Level extends SugarRecord {
    Student student;
    String category;

    public Level()
    {
    }
}
