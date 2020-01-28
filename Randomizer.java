import java.util.*;
import java.lang.Math;
/**
 * Picks a random number based on an associative array of numbers
 * and respective probabilities
 * 
 * @author Cade Mack
 * @version January 28, 2020
 */
public class Randomizer<T extends Object> {
    
    private ArrayList<T> replay;
    
    /**
     * Default constructor, initializes the replay ArrayList
     */
    public Randomizer() {
        replay = new ArrayList();
    }
    
    /**
     * This constructor provides a parameter to set the initial size of the replay list
     * @param memorySize 
     */
    public Randomizer(int memorySize) {
        replay = new ArrayList(memorySize);
    }
    
    /**
     * Generates a random number based on a map of integers to their respective probabilities
     * @param map The map that connects integers to their probabilities of being outputted
     * @return the integer that is generated
     */
    public T randNum(Map<T, Double> map) {
        double rand = Math.random(); //Random Double value, from 0.0 to 0.99999
        T out = null; //Placeholder value
        /*
        Assuming that the probabilities in the map add up to 1,
        then this zero should never be returned.
        */
        for (T i : map.keySet()) {
            /*
            So each probability is subtracted from the random double until it is negative
            Then the last probability to make it negative is correlated to the number to be returned
            
            */
            out = i;
            rand -= map.get(i);
            if (rand <= 0) {
                //Once it is negative, the loop should stop
                break;
            }
        }
        //Adding the number to the replay list
        replay.add(out);
        
        //Returning the number
        return out;
    }
    
    /**
     * This resets the replay list
     */
    public void clearReplayList() {
        replay.clear();
    }
    
    /**
     * This returns the list of all the generated numbers
     * @return the list of generated numbers
     */
    public ArrayList<T> getReplayList() {
        return replay;
    }
}
