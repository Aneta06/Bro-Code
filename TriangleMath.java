import java.util.Scanner;

public class TriangleMath {

    public static void main (String[] args){

        double x;
        double y;
        double z;

        Scanner keybord = new Scanner(System.in);


        //vypocet trojuhelniku c = odmocnina a na druhou (a*a) + b na druhou (b*b)
        System.out.println("Enter side x: ");
        x = keybord.nextDouble();

        System.out.println("Enter side y: ");
        y = keybord.nextDouble();


       // (x*x) + (y*y)

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("The hypotenuse is: " + z);
    }
}
