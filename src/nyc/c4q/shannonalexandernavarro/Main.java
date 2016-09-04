package nyc.c4q.shannonalexandernavarro;

//Accept input from the user with a Scanner object.
//        At least one if/else-if/else type control structure and one switch statement.
//        At least one while loop and one for loop.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        while (true) {
            System.out.println("Welcome to the Election Zone!\n \n*Insert unsettling music here*");
            System.out.println("It's another election year and it's time to do your duty as a citizen of Payasoland and vote.\nA little bit about your choices: \nCandidate A: \nCandidate B: ");
            System.out.println("Who do you choose? Candidate A, B or none?");
            Scanner scanner = new Scanner(System.in);
            String candidate = scanner.nextLine();
            String finalCandidate = candidate.toUpperCase();
            if (finalCandidate.equals("A") || finalCandidate.equals("CANDIDATE A") || finalCandidate.equals("CANDIDATEA")) {
                System.out.println("You voted for that clown? Well good luck!");
            } else if (finalCandidate.equals("B") || finalCandidate.equals("CANDIDATE B") || finalCandidate.equals("CANDIDATEB")) {
                System.out.println("You voted for that clown? Well good luck!");
            } else {
                System.out.println("I know, I know, why bother?");
            }
            Elected winningCandidate = new Elected();
            System.out.println("Time to find out who won. Results are in and it looks like the new chief of Payasoland is " + winningCandidate.electionProcess(finalCandidate));
            System.out.println("I know, I know-you probably didn't vote for 'em right? Go ahead, feel free to vent your frustrations.");
            System.out.println("Do you: \n a) Tweet about it, those 140 characters are sure to do some good \n b) Spend all day re-posting  and responding to clever memes on Facebook because that's bound to make a difference \n c) do nothing, this country is going to pot anyway");
            Scanner response = new Scanner(System.in);
            String responseChoice = response.nextLine();
            String finalResponse = responseChoice.toUpperCase();

            switch (finalResponse) {
                case "A":
                    System.out.println("Wow! The impact you've had, is just amazing! A whole 5 of your friends re-tweeted your indignation. Keep up the good work. \n");
                    break;
                case "B":
                    System.out.println("Wow! The impact you've had, is just amazing! A whole 5 of your friends re-posted your indignation. Keep up the good work. \n");
                    break;
                default:
                    System.out.println("Don't have the impetus to voice your 1 very important opinion? That's ok, not like it would have done much. \n");
            }
            StateofTheUnion partyTime = new StateofTheUnion();
            partyTime.maddening();

        }
    }

}
