public class Array2DNew {

    public static void main(String[] args) {


        // jinej zapis Arrays 2D

        String[][] cars = {{"Camaro", "Corvete", "Silverado"},
                           {"Mustang", "Ranger", "F-50"},
                           {"Ferrari", "Lamborginy", "Tesla"}
                          };


        // kdyz chci jen vsechny z prvni rady tak dam do i loopy za .lenght-2
        // kdyz chci jen druhou, nebo treti radu, tak v prvni loope zmenim to od ceho i zacina int i = 1 a vytisknou se mi
        // jen rady jedna a dva, kdyz zacnu od i = 2 tiskne se jen posledni rada
        // kdyz chci prvni a druhej radek tak musim pozit if v druhy loope if (i != 1) { ta jednicka je ten radek 1.index
        // aby tam nebyla mezery tak dam do prvni loopy  if (i != 1)
        // aby zacinalo od shora ?
        // kdyz chci ze vsech rad jen 0 index a vytisknout jen jednou do sout dole dam [i][0] do loopy j dam za .lenght -2
        // kdyz chci vytisknout na 0 nultej, na prvnim prvni a na druhym druhej (diagonala)? Udelam jen jednu loopu a do
        // tisku dam (cars[i][i]) protoze se mi pokazde obe i zvednou
        //jina varianta zeptat se Bena?

        for (int i = 0; i < cars.length; i++) {

                System.out.println();

            for (int j = 0; j < cars[i].length; j++) {

                    System.out.print(cars[i][j] + " ");

            }
        }
    }
}
