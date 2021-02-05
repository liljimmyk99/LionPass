package models;
public class Words{
    private final String[] ALPHABET = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k","l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private final String[] NUMBERS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private final String[] STATES = {"Alaska", "Alabama"};
    private String[] things;
    private String[] verbs;
    private String[] places;
    private String[] animals;
    private String[] peopleNames;
    

    public Words(String[] things, String[] verbs, String[] places, String[] animals, String[] peopleNames){
        this.things = things;
        this.verbs = verbs;
        this.places = places;
        this.animals = animals;
        this.peopleNames = peopleNames;
    }

    public String getRandomThing(){
        return things[0];
    }

    public String getRandomVerb(){
        return verbs[0];
    }
    public String getRandomPlace(){
        return places[0];
    }
    public String getRandomAnimal(){
        return animals[0];
    }
    public String getRandomPersonName(){
        return peopleNames[0];
    }

    public String getRandomLetter(){
        return ALPHABET[0];
    }
    public String getRandomNumber(){
        return NUMBERS[0];
    }
    public String getRandomUsState(){
        return STATES[0];
    }
}