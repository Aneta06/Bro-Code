public class OverLoadedMethods {

    public static void main(String[] args) {

        // overloaded methods = methods that share the same name but have different parameters
        //                    = method name + parameters = method signature
        //                    = metody, které sdílejí stejný název, ale mají různé parametry
        //                    = název metody + parametry = podpisu metody

        int x = add(1, 2);  // kdyz mam 2 cisla vytiskne se mi fc 1 , kdyz 3 cisla tak fce 2
                                  // a kdyz 4 cisla tak fce3
        System.out.println(x);

        double y = add(1.0,2.0, 3.0); // fce s doublem

        System.out.println(y);

    }

    public static int add(int a, int b) {
        System.out.println("This is overloaded method # 1");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("This is overloaded method # 2");
        return a + b + c;
    }

    public static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method # 3");
        return a + b + c + d;
    }

    public static double add(double a, double b) {
        System.out.println("This is overloaded method # 4");
        return a + b;
    }

    public static double add(double a, double b, double c) {
        System.out.println("This is overloaded method # 5");
        return a + b + c;
    }

    public static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method # 6");
        return a + b + c + d;
    }
}
