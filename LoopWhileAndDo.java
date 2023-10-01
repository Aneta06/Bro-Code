import java.util.Scanner;

public class LoopWhileAndDo {

    public static void main(String[] args) {

        // while loop = execute a block of code as long as it's conditional remains true
        //            = spustit blok kódu tak dlouho, dokud jeho podmíněnost zůstane pravdivá

        Scanner keybord = new Scanner(System.in);

        String name = "";

          while(name.isBlank()) { // vypisuj dej jmeno dokud tam neco nezada
              System.out.print("Please enter your name: ");
              name = keybord.nextLine();

            }
         System.out.println("Hello " + name);
          }
}

// muzeme udelat i s do, delej neco doku a vzpadalo bz to takhle

//        while (name.isBlank()) {
//            do {
//                System.out.print("Please enter your name: ");
//                name = keybord.nextLine();
//            } while (name.isBlank());
//
//            System.out.println("Hello " + name);
//        }
//    }
//}

