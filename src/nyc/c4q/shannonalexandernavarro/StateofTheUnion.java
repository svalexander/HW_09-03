package nyc.c4q.shannonalexandernavarro;

import java.util.Scanner;

/**
 * Created by shannonalexander-navarro on 9/3/16.
 */
public class StateofTheUnion {

    public void maddening() {
        System.out.println("Well it's been 4 years since the last election and a lot has changed. \nThe cost of milk is up $1. Bread is X+1.49 and rice is certainly more than you'd like to pay.");
        System.out.println("The cost of gas is still rising and essentially the country has gone to pot.\n \nWhy don't we start electing candidates who will do something? \nReady for another election? Y/N");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        String finalAnswer = answer.toUpperCase();
        if (finalAnswer.equals("YES") || finalAnswer.equals("Y")) {
            finalAnswer = "Hope your vote counts this time...";
        } else {
            finalAnswer = "I know, I know but...";
        }
        System.out.println(finalAnswer);
    }
}
