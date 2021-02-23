package models;

import java.util.ArrayList;

public interface RandomGenerator {

//Returns Random Element from stored Arraylist
    public abstract String random();
//Update currently stored Arraylist with new entities
    public abstract void update(ArrayList<String> list);
//Add a single element to stored Arraylist
    public abstract void addToGenerator(String toAdd);

}