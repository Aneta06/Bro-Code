public class MethodFcReturn {

    public static void main(String[] args) {

        // method = a block of code that is executed whenever it is called upon

        int x = 3;
        int y = 5;

       int z =  mySum(x,y); // muzu zapsat i jinym kratsim zpusobme, tohle tam vubec nebude

        System.out.println(z); // a sem dam System.out.println(add(x,y));


    }

    static int mySum(int a, int b){   // fce sem pojmenovala mySum  a nahore ulozim fce do zetka

        int c = a + b;   //muzu zapsat i jinym kratsim zpusobme, tohle tam vubec nebude
        return c;       // a sem dam return a + b;
    }
}
