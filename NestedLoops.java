import java.util.Scanner;

public class NestedLoops {

    public static void main(String[] args) {
        // nested loop = a loop inside of the loop

        Scanner keybord = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = keybord.nextInt();

        System.out.println("Enter # of columsn: ");
        columns = keybord.nextInt();

        System.out.println("Enter symbol to use: ");
        symbol = keybord.next();


        for (int i = 1; i <= rows; i++){
            System.out.println();

            for (int j = 1; j <= columns; j++){
                System.out.print(symbol);
            }
        }



    }


}
