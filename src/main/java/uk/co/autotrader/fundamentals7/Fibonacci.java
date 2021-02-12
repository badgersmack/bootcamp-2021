package uk.co.autotrader.fundamentals7;

import java.util.ArrayList;
import java.util.Collections;

public class Fibonacci {
    public static ArrayList<Integer> main() {
       /*
        ArrayList<Integer> fibber = useFib(24);
        return fibber;

        System.out.println(Collections.unmodifiableList(useFib(24)));
*/
        //cant get the damn thing to output because i dont get Java
        return useFib(2);
    }
    public static ArrayList<Integer> useFib(Integer sequenceSize) {

        ArrayList<Integer> fibArray = new ArrayList<>();

        for(Integer i = 0; i < sequenceSize; i++){
            // Every number before reaches 2 is added to the array (0 and 1)
            if (i < 2){
                fibArray.add(i);
            }
            //Every number after the first 2 is a sum of 2 proceeding numbers
            else{
                fibArray.add(fibArray.get(i - 1) + fibArray.get(i - 2));
            }
        }
        //Return an array of fibonacci numbers.
        return fibArray;
    }

}
