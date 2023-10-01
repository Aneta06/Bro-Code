public class StatementIF {

    public static void main(String[] args) {

        int age = 13;

        if (age >= 18) {

            System.out.println("You are adult!");  //vytiskne se jen tohle. protoze if splnilo podminkiu a tim to ukoncilo

        } else if (age >= 75) { //Kdyz bych chtela vytitsknout boomra, musim ho dat nahoru do ifu!!
            System.out.println("Ok Boomer!");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are not adult!");
        }
    }
}
