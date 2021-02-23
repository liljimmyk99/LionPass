package models;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class Words implements RandomGenerator{
    
    private static ArrayList<String> things = new ArrayList<>(Arrays.asList("cancer", "car", "music", "race", "television", "computer", "phone", "pineapple", "basketball", "soccer"));
    private static ArrayList<String> verbs = new ArrayList<>(Arrays.asList("racing", "watching", "running", "walking", "breathing", "driving", "reading", "using", "cleaning", "sitting", "sleeping", "cooking", "sleeping"));
    private static ArrayList<String> places = new ArrayList<>(Arrays.asList("school", "work", "stadium", "home", "restaraunt", "arena", "gas station", "outside", "park", "beach"));
    private static ArrayList<String> animals = new ArrayList<>(Arrays.asList("dog", "cat", "elephant", "bat", "cheeta", "squirl", "seagull", "bird", "bear", "owl", "deer"));
    private static ArrayList<String> peopleNames = new ArrayList<>(Arrays.asList("jimmy", "matthew", "noah", "gavin", "dylan", "daniel", "emily", "kady", "kelli", "natalie", "sarah", "elissa", "liz", "justin", "jordan"));
    private static ArrayList<ArrayList<String>> categories = new ArrayList<>(Arrays.asList(things, verbs, places, animals, peopleNames));

    public Words(){
        //I Do Nothing
    }
    /*
    *
    *  Needed to implement RandomGenerator Interface
    *
    */

    
    public String random(){
        System.out.println("random function activated");
        int randList = randomIndex(categories.size());
        ArrayList<String> rand = categories.get(randList);
        int length = randomIndex(rand.size());
        return rand.get(length);
    }

    @Override
    public void update(ArrayList<String> list){
        System.out.println("Words update function activated");
        //Mutliple Lists????????????
        System.out.println("Implementation is in progress");
    } 

    @Override
    public void addToGenerator(String toAdd){
        System.out.println("Words update function activated");
        //Multiple Paramters?  How differentiate List
    }

    public int randomIndex(int length){
        return (int) (Math.random() * length); 
    }


    public String getRandomThing(){
        int length = things.size();

        int randIndex = randomIndex(length);
        return things.get(randIndex);
    }

    public String getRandomVerb(){
        int length = verbs.size();

        int randIndex = randomIndex(length);
        return verbs.get(randIndex);
    }
    public String getRandomPlace(){
        int length = places.size();

        int randIndex = randomIndex(length);
        return places.get(randIndex);
    }
    public String getRandomAnimal(){
        int length = animals.size();

        int randIndex = randomIndex(length);
        return animals.get(randIndex);
    }
    public String getRandomPersonName(){
        int length = peopleNames.size();

        int randIndex = randomIndex(length);
        return peopleNames.get(randIndex);
    }

}