package com.iut.nicolas.ecoledesloustics.models;

import com.orm.SugarRecord;

/**
 * Created by eric on 25/03/2017.
 */
public class Student extends SugarRecord {
    private String mName;
    private String mFirsName;
    private int mAge;

    public Student()
    {
    }

    public Student(String name, String firstName, int age)
    {
        setName(name);
        setFirsName(firstName);
        setAge(age);
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getFirsName() {
        return mFirsName;
    }

    public void setFirsName(String mFirsName) {
        this.mFirsName = mFirsName;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int mAge) {
        this.mAge = mAge;
    }
}
