package models;

import java.util.ArrayList;
import java.util.Arrays;

public class Numbers implements RandomGenerator {
    private ArrayList<String> NUMBERS = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
    
    @Override
    public String random(){
        System.out.println("random function activated");
        int length = NUMBERS.size(); 
        int index = randomIndex(length);
        return NUMBERS.get(index);
    }

    @Override
    public void update(ArrayList<String> list){
        System.out.println("Numbers update function activated");
        NUMBERS = list;
    } 

    @Override
    public void addToGenerator(String toAdd){
        System.out.println("Numbers addToGenerator function activated");
        NUMBERS.add(toAdd);
    }

    public int randomIndex(int length){
        return (int) (Math.random() * length); 
    }
}
