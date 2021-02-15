package uk.co.autotrader.fundamentals7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseInt {
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> testArray) {
        /*
        ArrayList<Integer> expectedArray = new ArrayList<>();

        expectedArray = testArray;

        int arr = expectedArray.toArray().length;

        for (int i = 0; i < arr; i++) {
            if (expectedArray.get(i) < expectedArray.get(i - 1)) {
                expectedArray.set(i, expectedArray.get(0));
            }
        }

        return expectedArray;
        //bullshit code that wastes everyone's time
        */

        ArrayList<Integer> expectedArray = new ArrayList<>();

        expectedArray = testArray;

        Collections.sort(expectedArray, Collections.reverseOrder());

        return expectedArray;

    }
}
