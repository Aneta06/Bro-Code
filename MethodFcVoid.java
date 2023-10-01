public class MethodFcVoid {

    public static void main (String[] args){

        // method = a block of code that is executed whenever it is called upon
        //        = blok kódu, který se provede vždy, když je vyvolán


           String name = "Aneta";
           int age = 35;
           int phoneNumber = 1654684;


           hello(name, age, phoneNumber);    //metodu musime tady zavolat aby se dole vytiskla


    }
                // void nic nevraci!!!!!!!!!!!!!!!!!!!!!!!!!!!! void = prazdnota
    static void hello(String whatname, int whatage, int whatNumber){      // vytvorili jsme funkci, kterou musime zavolat nahore
        System.out.println("Hello " + whatname);                         // zavolat nahore v main, aby se dole vytiskla
        System.out.println("I am " + whatage);
        System.out.println("My number is " + whatNumber);
    }
}
