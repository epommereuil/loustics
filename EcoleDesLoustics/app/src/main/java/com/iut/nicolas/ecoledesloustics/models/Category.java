package com.iut.nicolas.ecoledesloustics.models;

import java.util.ArrayList;

/**
 * Created by Eric Pommereuil on 26/03/2017.
 */

public class Category {
    public String id;
    public String name;
    public ArrayList<Level> levels;

    public String getName()
    {
        return name;
    }
}
