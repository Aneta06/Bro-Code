import java.util.Arrays;

public class ArrayNew {

    public static void main(String[] args) {


        String[] cars = new String[3]; // vytvori mi 3 elementy Stringovy

        cars[0] = "BMW";
        cars[1] = "Volvo";
        cars[2] = "Audi";

        System.out.println(Arrays.toString(cars)); // takhle vytisknu vsechny Stringy vedle sebe [BMW, Volvo, Audi]

        for (int i = 0; i < cars.length; i++) { // loopou vytisknu Stringy pod sebe
            System.out.println(cars[i]);
        }
    }

}
