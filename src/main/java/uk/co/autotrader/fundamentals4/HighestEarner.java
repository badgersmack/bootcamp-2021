package uk.co.autotrader.fundamentals4;

public class HighestEarner {
    public static void main(String[] args) {
        displayHighestEarner("Dave", 35000);
        displayHighestEarner("Sally", 22000);
        displayHighestEarner("Steve", 45000);
        displayHighestEarner("Bertha", 60000);
        displayHighestEarner("Geraldine", 38000);
    }

    public static void displayHighestEarner(String name, int salary) {
        System.out.println(name +" got position " + calculateHighestEarnerPosition(salary) + " in the highest earners");
    }

    public static int calculateHighestEarnerPosition(int salary) {
        int position = 0;
        if(salary >= 50000){
            position = 1;
        }
        else if (salary >= 40000){
            position = 2;
        }
         else if (salary >= 30000){
            position = 3;
        }
         else if (salary >= 20000){
            position = 4;
        }
         else if (salary >= 10000){
            position = 5;
        }
        return position;
    }
}
