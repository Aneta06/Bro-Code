public class Pocitani {

    public static void main (String[] args){

        int friends = 10;
        System.out.println(friends);

        friends -= 1;
        System.out.println(friends);

        friends *= 10;
        System.out.println(friends);

        friends /= 5;
        System.out.println(friends);

        friends %= 4;//Vysledek je 2, protoze modulus je zbytek 18/4 = 16 a zbyde 2
                        // Kdyz budu delit 18/3 tak vysledek bude 0, protoze to je beze zbytku je to 6 a nic nezbyde
        System.out.println(friends);

        friends++; //friends--;
        System.out.println(friends);

        friends = friends /2; // hodi mi to spatnej vysledek, beze zbytku, musela bych mit double a ne int double
        System.out.println(friends);

        double friend2 = 10; //musim si tu promennou ulozit znovu jako double a pak to jde
        friend2 /= 4;
        System.out.println(friend2);

    }
}
