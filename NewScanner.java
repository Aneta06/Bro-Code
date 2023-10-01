import java.util.Scanner;

public class NewScanner {

    public static void main (String[] args){

    Scanner keybord = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = keybord.nextLine();

        System.out.println("What is your age? ");
        int age = keybord.nextInt();

        keybord.nextLine();
        System.out.println("What is your favorite food?");
        String food = keybord.nextLine();

        System.out.println("Hello " + name +  ". You are " + age + " It is the best age!" + " Your favorite foood is " + food + ".");





    }
}
