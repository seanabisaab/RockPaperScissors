import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class PlayGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = 1; //1 = rock, 2 = paper, 3 = scissors
        int max = 3;
        int cpuChoice = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println("Enter 1 for rock, 2 for paper, or 3 for scissors.");
        int userChoice = s.nextInt();

        while(cpuChoice == userChoice) {
            cpuChoice = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println("Tie. Enter a new choice.");
            System.out.println("Enter 1 for rock, 2 for paper, or 3 for scissors.");
            userChoice = s.nextInt();
        }
        if((userChoice > 3) || (userChoice < 1)) {
            System.out.println("Invalid choice. ");
            System.exit(0);
        }
        else if ((cpuChoice == 1) && (userChoice == 2)) {
            System.out.println("Computer chose rock.");
            System.out.println("You win! Thanks for playing!");
        }
        else if ((cpuChoice == 2) && (userChoice == 3)) {
            System.out.println("Computer chose paper.");
            System.out.println("You win! Thanks for playing!");
        }
        else if ((cpuChoice == 3) && (userChoice == 1)) {
            System.out.println("Computer chose scissors.");
            System.out.println("You win! Thanks for playing!");
        }
        else if ((cpuChoice == 2) && (userChoice == 1)) {
            System.out.println("Computer chose paper.");
            System.out.println("You lose! Thanks for playing!");
        }
        else if ((cpuChoice == 1) && (userChoice == 3)) {
            System.out.println("Computer chose rock.");
            System.out.println("You lose! Thanks for playing!");
        }
        else if ((cpuChoice == 3) && (userChoice == 2)) {
            System.out.println("Computer chose scissors.");
            System.out.println("You lose! Thanks for playing!");
        }

    }

}
