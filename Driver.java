/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author -------
 * @version --------
 */
public class Driver {
    public static void main(String args[]) {
        Randomizer<Integer> instance = new Randomizer<Integer>();
        Map<Integer, Double> numProbs = new HashMap<Integer, Double>();
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        Integer out = 0;
        for (int i = 1; i < 100; i ++) {
            numProbs.put(i, .01);
            counts.put(i, 0);
        }
        
        
        int size = 10000;
        
        for (int i = 0; i < size; i++) {
            out = instance.randNum(numProbs);
            counts.put(out, counts.get(out)+1);
            System.out.println(out);
        }
        
        ArrayList<Integer> list = instance.getReplayList();
        
        System.out.println(list.size());
        
        for (Integer key : counts.keySet()) {
            System.out.println(key + " : " + counts.get(key) + " : " + ((double)counts.get(key) / (double)size));
        }
        
        
    }
}
