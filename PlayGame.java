import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class PlayGame {
    public static void main(String[] args) {
        int cwins = 0;
        int pwins = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Would you like to play rock, paper, scissors?(Y or N)");
        String choice = s.nextLine();
        if (choice.equals("N")){
            System.out.println("Okay. Goodbye!");
            System.exit(0);
        }

        while (true) {

            int min = 1; //1 = rock, 2 = paper, 3 = scissors
            int max = 3;
            int cpuChoice = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println("Enter 1 for rock, 2 for paper, or 3 for scissors.");
            int userChoice = s.nextInt();

            while (cpuChoice == userChoice) {
                cpuChoice = ThreadLocalRandom.current().nextInt(min, max + 1);
                System.out.println("Tie. Enter a new choice.");
                System.out.println("Enter 1 for rock, 2 for paper, or 3 for scissors.");
                userChoice = s.nextInt();
            }
            if ((userChoice > 3) || (userChoice < 1)) {
                System.out.println("Invalid choice. ");
                System.exit(0);
            } else if ((cpuChoice == 1) && (userChoice == 2)) {
                System.out.println("Computer chose rock.");
                System.out.println("You win! Thanks for playing!");
                pwins++;
            } else if ((cpuChoice == 2) && (userChoice == 3)) {
                System.out.println("Computer chose paper.");
                System.out.println("You win! Thanks for playing!");
                pwins++;
            } else if ((cpuChoice == 3) && (userChoice == 1)) {
                System.out.println("Computer chose scissors.");
                System.out.println("You win! Thanks for playing!");
                pwins++;
            } else if ((cpuChoice == 2) && (userChoice == 1)) {
                System.out.println("Computer chose paper.");
                System.out.println("You lose! Thanks for playing!");
                cwins++;
            } else if ((cpuChoice == 1) && (userChoice == 3)) {
                System.out.println("Computer chose rock.");
                System.out.println("You lose! Thanks for playing!");
                cwins++;
            } else if ((cpuChoice == 3) && (userChoice == 2)) {
                System.out.println("Computer chose scissors.");
                System.out.println("You lose! Thanks for playing!");
                cwins++;
            }
            System.out.println("Computer wins: "+ cwins);
            System.out.println("Your wins: "+pwins);

        }
    }

}
