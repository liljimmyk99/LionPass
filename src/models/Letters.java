package models;

import java.util.ArrayList;
import java.util.Arrays;

public class Letters implements RandomGenerator {
    private ArrayList<String> ALPHABET = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k","l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
    @Override
    public String random(){
        System.out.println("random function activated");
        int length = ALPHABET.size(); 
        int index = randomIndex(length);
        return ALPHABET.get(index);
    }

    @Override
    public void update(ArrayList<String> list){
        System.out.println("Letters update function activated");
        ALPHABET = list;
    } 

    @Override
    public void addToGenerator(String toAdd){
        System.out.println("Letters update function activated");
        ALPHABET.add(toAdd);

    }
    public int randomIndex(int length){
        return (int) (Math.random() * length); 
    }

}
