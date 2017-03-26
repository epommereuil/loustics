package com.iut.nicolas.ecoledesloustics.models;

import com.orm.SugarRecord;

/**
 * Created by eric on 25/03/2017.
 */
public class Student extends SugarRecord {
    private String name;
    private String firstname;
    private int age;

    public Student()
    {
    }

    public Student(String name, String firstName, int age)
    {
        setName(name);
        setFirstname(firstName);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String mName) {
        this.name = mName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String mFirsName) {
        this.firstname = mFirsName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int mAge) {
        this.age = mAge;
    }
}
