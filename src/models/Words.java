package models;

import org.junit.Test;

public class Words{
    private final String[] ALPHABET = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k","l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private final String[] NUMBERS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private final String[] STATES = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Deleware", "Florida", " Georgia", "Hawaii", " Idaho", "Illnois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
    private String[] things = {"cancer", "car", "music", "race", "television", "computer", "phone", "pineapple", "basketball", "soccer"};
    private String[] verbs = {"racing", "watching", "running", "walking", "breathing", "driving", "reading", "using", "cleaning", "sitting", "sleeping", "cooking", "sleeping"};
    private String[] places = {"school", "work", "stadium", "home", "restaraunt", "arena", "gas station", "outside", "park", "beach"};
    private String[] animals = {"dog", "cat", "elephant", "bat", "cheeta", "squirl", "seagull", "bird", "bear", "owl", "deer"};
    private String[] peopleNames = {"jimmy", "matthew", "noah", "gavin", "dylan", "daniel", "emily", "kady", "kelli", "natalie", "sarah", "elissa", "liz", "justin", "jordan"};
    

    public Words(){
        //I Do Nothing
    }

    public String getRandomThing(){
        int numThing = things.length;

        int randIndex = (int) (Math.random() * numThing) - 1;
        return things[randIndex];
    }

    public String getRandomVerb(){
        int numVerbs = verbs.length;

        int randIndex = (int) (Math.random() * numVerbs);
        return verbs[randIndex];
    }
    public String getRandomPlace(){
        int numPlaces = places.length;

        int randIndex = (int) (Math.random() * numPlaces);
        return places[randIndex];
    }
    public String getRandomAnimal(){
        int numAnimals = animals.length;

        int randIndex = (int) (Math.random() * numAnimals);
        return animals[randIndex];
    }
    public String getRandomPersonName(){
        int numNames = peopleNames.length;

        int randIndex = (int) (Math.random() * numNames);
        return peopleNames[randIndex];
    }
    public String getRandomLetter(){
        int numLetters = ALPHABET.length;

        int randIndex = (int) (Math.random() * numLetters);
        return ALPHABET[randIndex];
    }
    public String getRandomNumber(){
        int randIndex = (int) (Math.random() * 10);

        return NUMBERS[randIndex];
    }
    public String getRandomUsState(){
        int numStates = STATES.length;

        int randIndex = (int) (Math.random() * numStates);

        return STATES[randIndex];
    }

}