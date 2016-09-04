package nyc.c4q.shannonalexandernavarro;

import java.util.Scanner;

/**
 * Created by shannonalexander-navarro on 9/3/16.
 */
public class Elected {

    public String electionProcess(String choice){
        Scanner scanner = new Scanner(System.in);
        String winningCandidate = choice ;
        String finalCandidate = winningCandidate.toUpperCase();
        if (finalCandidate.equals("A")  || finalCandidate.equalsIgnoreCase("CASE A") || finalCandidate.equals("casea")){
            winningCandidate = "candidate B!" ;
    } else {
        winningCandidate = "candidate A!";
        }
      return winningCandidate;
    }
}
