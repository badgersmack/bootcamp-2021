package uk.co.autotrader.fundamentals7;

public class EverPresent {
    public static void main(String[] args) {
        boolean result = only1or4(new int[]{1, 4, 1, 4});
        System.out.println("result = {1, 4, 1, 4} -> " + result);

        result = only1or4(new int[]{1, 4, 3, 4});
        System.out.println("result = {1, 4, 3, 4} -> " + result);

        result = only1or4(new int[]{1, 1});
        System.out.println("result = {1, 1} -> " + result);
    }

    private static boolean only1or4(int [] numbers) {
        boolean only1or4Values = true;

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] != 4) && (numbers[i] != 1)) {
                only1or4Values = false;
                break;
            }
        }

        return only1or4Values;
    }
}
