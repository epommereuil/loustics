package com.iut.nicolas.ecoledesloustics.models.db;

import com.orm.SugarRecord;

import org.json.JSONObject;

/**
 * Created by eric on 25/03/2017.
 */
public class Answer extends SugarRecord{
    Student student;
    String category;
    Integer level;
    String exercise;
    JSONObject data;

    public Answer()
    {
        data = new JSONObject();
    }

}
