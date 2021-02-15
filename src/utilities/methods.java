package utilities;

public class methods{

    public int getRandomInt(int lowerBound, int higherBound){
        int range = higherBound - lowerBound;
        return (int) (Math.random() * range) + lowerBound;
    }
}