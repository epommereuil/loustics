package com.iut.nicolas.ecoledesloustics.models;

import com.orm.SugarRecord;

/**
 * Created by eric on 25/03/2017.
 */
public class Category extends SugarRecord {
    private String idCategory;
    private String name;

    public Category()
    {
    }

    public Category(String id,String name)
    {
        this.idCategory = id;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
