package uk.co.autotrader.fundamentals3;

import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random random = new Random(); //
        int range = 2;
        int randomNumber = random.nextInt(range);
        System.out.println(randomNumber);


        String myChoice = "Rock";

        String computerChoice ="";

        switch (randomNumber) {
            case 0:
                computerChoice = "Rock";
                break;
            case 1:
                computerChoice = "Paper";
                break;
            case 2:
                computerChoice = "Scissors";
                break;
            default:
                System.out.println("Invalid");
        }

        System.out.println("My choice is " + myChoice);
        System.out.println("Computer choice is " + computerChoice);

        if (myChoice.equalsIgnoreCase(computerChoice)) { //because java is weird - similar to == in javascript
            System.out.println("Draw");
        }
        else if ((myChoice == "Rock" && computerChoice == "Scissors") ||
                (myChoice == "Paper"  && computerChoice == "Rock") ||
                (myChoice == "Scissors"  && computerChoice == "Paper")){
            System.out.println("I win");
        } else {
            System.out.println("I lose");
        }

    }
    }
