import java.util.Scanner;

/**
 * Created by joyapuryear on 7/5/17.
 */
public class BattingStatsApp {
    public static void main(String[] args) {

        int atBats = 0;

        //1. Ask user for the number of at bats(how many times you're up to bat)
        System.out.println("Enter the number of times at bat: ");
        Scanner scan = new Scanner(System.in);
        atBats = scan.nextInt();

        while (atBats < 0) {
            System.out.println("Invalid input!");
            atBats = scan.nextInt();
        }

        int[] batterStats = new int[atBats];
        //while ((atBats > 0 && atBats < 5)) ;

        //2. For each at bat ask the user for a number of bases earned by the batter)
        /* 0 = out
            1 = Single
            2 = Double
            3 = Triple
            4 = Home Run
         */


        System.out.println("Enter your at bat results:\n ex. 0 = out, 1 = single, 2 = double, 3 = triple, 4 = homerun");
        int numBases = 0;

        for (int i = 0; i < atBats; i++) {
            System.out.print("Result for at bat " + i + ":");
            numBases = scan.nextInt();

            while (numBases < 0 | numBases > 4) {
                System.out.println("Invalid input!");
                numBases = scan.nextInt();
            }
            batterStats[i] = numBases;
        }


        double hits = 0;

        for (int j = 0; j < batterStats.length; j++) {
            if (batterStats[j] > 0) {

                hits = hits + 1;

            }
        }
        //display slugging percentage of batter.
        System.out.println("Batting Average is: " + (hits / atBats));

        //calculate slugging percentage
        double sum = 0;

        for (int i = 0; i < batterStats.length; i++) {
            sum = sum + batterStats[i];
        }

        double sluggingPercentage = sum / batterStats.length;

        //print blank line for spacing.
        System.out.println(" ");

        //display slugging percentage of batter.

        System.out.println("Slugging Percentage is: " + sluggingPercentage);

        scan = new Scanner(System.in);
        String choice = "y";
        //boolean expression to check for equilty of a string
        while (choice.equalsIgnoreCase("y")) {

            // get some input from the user and do some stuff
            System.out.println("Another Batter? (y/n)");
            choice = scan.nextLine();


        }

        System.out.println("Goodbye");

    }


}







