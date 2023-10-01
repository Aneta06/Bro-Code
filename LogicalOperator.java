public class LogicalOperator {

    public static void main(String[] args) {

        //logical operators = used to connect two or more expressions
        //logické operátory používané ke spojení dvou nebo více výrazů

        //both condition must be true           && = (AND) obě podmínky musí být pravdivé
        //either condition must be true         || = (OR) jedna z podmínky musí být pravdivé
        //reverses boolean value of condition    ! = (NOT) obrátí booleovskou hodnotu podmínky z true na false a naopak

        int temp = 20;

        if (temp > 30) {
            System.out.println("In outside is hot");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("In outside is warm");

        } else{
            System.out.println("In outside is cold");
        }
    }
}
