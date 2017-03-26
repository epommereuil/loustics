package com.iut.nicolas.ecoledesloustics.models;

import com.orm.SugarRecord;

import org.json.JSONObject;

/**
 * Created by eric on 25/03/2017.
 */
public class Answer extends SugarRecord{
    JSONObject mData;
    Exercise mExercice;
    Student mStudent;

    public Answer()
    {
        mData = new JSONObject();
    }

}
