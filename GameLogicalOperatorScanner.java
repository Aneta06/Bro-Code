import java.util.Scanner;

public class GameLogicalOperatorScanner {

    public static void main(String[] args) {

        //logical operators = used to connect two or more expressions

        //both condition must be true             && = (AND)
        //either condition must be true           || = (OR)
        //reverses boolean value of condition     ! = (NOT)

        Scanner keybord = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit.");

        String player = keybord.next();

        if (player.equals("q") || player.equals("Q")) {
            System.out.println("You are quit the game");
        } else {
            System.out.println("You are in the game");

            //muzeme to prohodit a pouzit !

            // if (!player.equals("q") && !player.equals("Q")) {
            //    System.out.println("You are in the game");
            //    } else {
            //  System.out.println("You are quit the game");
        }
    }
}


