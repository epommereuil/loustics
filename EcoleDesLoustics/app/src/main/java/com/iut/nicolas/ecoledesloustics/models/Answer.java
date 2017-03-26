package com.iut.nicolas.ecoledesloustics.models;

import com.orm.SugarRecord;

import org.json.JSONObject;

/**
 * Created by eric on 25/03/2017.
 */
public class Answer extends SugarRecord{
    JSONObject data;
    Exercise exercise;
    Student student;

    public Answer()
    {
        data = new JSONObject();
    }

}
