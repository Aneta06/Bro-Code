public class StringAbout {

    public static void main(String[] args) {

        //String = reference data type that can store one or more characters
        //         reference that the types have access to useful methods
        //         referenční datový typ, který může uložit jeden nebo více znaků,
        //         odkaz na to, že typy mají přístup k užitečným metodám


        String name = "Aneta";

        //slovo resault si vymyslel jako novou promennou a to pak tisknul!!!!!!!!!!!!!!!!


        boolean result = name.equalsIgnoreCase("aneta"); // kdyz dam tohle, tak ignoruje male pismeno
                                                                     // a napise taky true a bere to tak ze to jestejny

        // int result = name.length(); // tohle vypise delku slova, pocet pismen tady to bude 5

        // char result = name.charAt(0); // tohle vypise podle toho kolikatej index zadam to urcity pismenno

        // int result = name.indexOf("t"); // vypise mi na kolikatym indexu je pismeno t, tady to bude na tretim

       // boolean result = name.isEmpty(); // napise mi jestli promenna name je prazdna (true/flse)

       // String result = name.toUpperCase(); // zmeni vsechny pismena na velky

       // String result = name.toLowerCase(); // zmeni vsechny pismena na maly

       // String result = name.trim(); // kdyz tam mam mezery "   Aneta   ", tak je odmaze

       // String result = name.replace('e', 'i'); // zmeni z puvodniho pismena na jiny, vsechy stejne pismena

      // String result = name.concat("a"); // prida pismeno na konec slova

        System.out.println(result);

        //dalsi priklad

         String example = "In a dishwasher far, far away";

        //zmenit slovo dishwasher na galaxy

        // slovo example jsem si vymyslela

        example = example.replace("dishwasher", "galaxy");

        System.out.println(example);  // vysledek In a galaxy far, far away

    }
}
