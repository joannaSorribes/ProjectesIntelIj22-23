
public class Prog1 { // PascalCase Nom de classes
    // psvm abreviatura +intro
    public static void main(String[] args) {

        // Codi que escriurem
        /*                   */
        String a,b, data;
        a = "Hello,";
        b = " World!!";
        data = "La data acutal és: ";

        byte c = 34;
        short d = 50;
        int z = d + c;
        char f = 2255;
        int mes, dia, anyMes, g;
        g = 027;
        anyMes = 2022; // camelCase
        dia = 13;
        mes = 9;
        boolean p = true;


        System.out.println(a+b);
        System.out.println("El resultat de sumar " + c + " + " + d + " és: " + z);
        System.out.println("Valor tipus CHAR: " + f);
        System.out.println("Valor de número octal: " + g);
        System.out.println(data + anyMes + "/" + mes + "/" + dia);

        if (c < d) {
            System.out.println(p);

            if (c == d) {
                System.out.println("Tenen el mateix valor");
            }

        } else {
            System.out.println("És major");
        }


    }
}
