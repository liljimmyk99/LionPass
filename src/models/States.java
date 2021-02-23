package models;

import java.util.*;

public class States implements RandomGenerator {
    private ArrayList<String> STATES_FULL = new ArrayList<>(Arrays.asList("Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Deleware", "Florida", " Georgia", "Hawaii", " Idaho", "Illnois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"));
    
    private Map<String, String> americanAbbrToFullTemp = new HashMap<String, String>();
//     private Map<String, String> americanAbbrToFullTemp = Map.ofEntries(
//         entry("AL","Alabama"),
//         entry("AK","Alaska"),
//         entry("AZ","Arizona"),
//         entry("AR","Arkansas"),
//         entry("CA","California"),
//         entry("CO","Colorado"),
//         entry("CT","Connecticut"),
//         entry("DE","Delaware"),
//         entry("DC","District of Columbia"),
//         entry("FL","Florida"),
//         entry("GA","Georgia"),
//         entry("HI","Hawaii"),
//         entry("ID","Idaho"),
//         entry("IL","Illinois"),
//         entry("IN","Indiana"),
//         entry("IA","Iowa"),
//         entry("KS","Kansas"),
//         entry("KY","Kentucky"),
//         entry("LA","Louisiana"),
//         entry("ME","Maine"),
//         entry("MD","Maryland"),
//         entry("MA","Massachusetts"),
//         entry("MI","Michigan"),
//         entry("MN","Minnesota"),
//         entry("MS","Mississippi"),
//         entry("MO","Missouri"),
//         entry("MT","Montana"),
//         entry("NE","Nebraska"),
//         entry("NV","Nevada"),
//         entry("NH","New Hampshire"),
//         entry("NJ","New Jersey"),
//         entry("NM","New Mexico"),
//         entry("NY","New York"),
//         entry("NC","North Carolina"),
//         entry("ND","North Dakota"),
//         entry("OH","Ohio"),
//         entry("OK","Oklahoma"),
//         entry("OR","Oregon"),
//         entry("PA","Pennsylvania"),
//         entry("PR","Puerto Rico"),
//         entry("RI","Rhode Island"),
//         entry("SC","South Carolina"),
//         entry("SD","South Dakota"),
//         entry("TN","Tennessee"),
//         entry("TX","Texas"),
//         entry("VI","U.S. Virgin Islands"),
//         entry("UT","Utah"),
//         entry("VT","Vermont"),
//         entry("VA","Virginia"),
//         entry("WA","Washington"),
//         entry("WV","West Virginia"),
//         entry("WI","Wisconsin"),
//         entry("WY","Wyoming")
//  );

    
    
    
    @Override
    public String random(){
        System.out.println("random function activated");
        int length = STATES_FULL.size();
        int index = randomIndex(length);
        return STATES_FULL.get(index);
    }

    @Override
    public void update(ArrayList<String> list){
        System.out.println("States update function activated");
        STATES_FULL = list;
    } 

    @Override
    public void addToGenerator(String toAdd){
        System.out.println("States addToGenerator function activated");
        STATES_FULL.add(toAdd);
    }

    public int randomIndex(int length){
        return (int) (Math.random() * length); 
    }

    public String getAbbrivation(String state){
        System.out.println("getAbbrivation function activated");
        String result = americanAbbrToFullTemp.get(state);
        return result;
    }

}