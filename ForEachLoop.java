import java.util.ArrayList;

public class ForEachLoop {

    public static void main(String[] args) {

        // for-each = traversing technique to iterate through the elements in an array collection
        //          = less steps more readable
        //           = less flexible

        //              = technika procházení pro iteraci prvků v kolekci/pole
        //              = méně kroků čitelnější
        //              = méně flexibilní

         String[] animals = {"cat", "dog", "rat", "bird"};


         for (String i : animals) {          // vytisknou se  vsechny String indexu v array animals

            System.out.println(i);

        }

            ArrayList<String> animals2 = new ArrayList<String>();
            animals2.add("pig");
            animals2.add("horse");
            animals2.add("cow");

            for (String j : animals2) {    // vytisknou se vsechny String indexu v arrayList animals2

                System.out.println(j);
            }
        }
    }

