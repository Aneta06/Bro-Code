import java.util.ArrayList;

public class ArrayListNew {

    public static void main(String[] args) {


              // ArrayList = a resizable array
              //elements can be edit and removed after compilation phase store reference data types

              //            = pole s měnitelnou velikostí
              // prvky lze upravovat a odstraňovat po fázi kompilace ukládat referenční datové typy


        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");           // pridavam seznam do food
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "suschi"); // zmeni slovo na 0 indexu pizza za sushi
        food.remove(2);  //smaze druhej index coz je hotdog
        food.clear();         // smazde celej seznam

        for (int i = 0; i < food.size(); i++) { //aby se mi vsechny vytiskli
            System.out.println(food.get(i));
            
        }


    }
}
