package com.iut.nicolas.ecoledesloustics.models;

import com.iut.nicolas.ecoledesloustics.models.db.Student;

/**
 * Created by eric on 25/03/2017.
 */

public class StudentContext {
    private static StudentContext mInstance = new StudentContext();

    public static String IDMath = "MATH";
    public static String IDFrancais = "FRANCAIS";
    public static String IDGeo = "GEO";

    private Exercises mExercises;

    private Student mStudent;
    private Category mCategory;
    private Exercise mExercise;

    public static StudentContext getInstance()
    {
        return mInstance;
    }

    public void setCurrentStudent(Student student)
    {
        mStudent = student;
    }

    public Student getCurrentStudent()
    {
        return mStudent;
    }

    public void setCategory(Category category){mCategory=category;}

    public void setExercises(Exercises exercises)
    {
        mExercises = exercises;
    }

    public Exercises getExercises()
    {
        return mExercises;
    }
}
