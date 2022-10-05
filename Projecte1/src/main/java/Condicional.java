import  java.util.Scanner;
public class Condicional {
    public static void main(String[] args) {
        // Estructura condicional
        /* si una expressio booleana és true el programa s'executarà el codi
        si la expressio és false cintinuarà l'execucióa continuació de }*/


        // delcaro variables
        Scanner sc = new Scanner(System.in);
        int a,b;

        // demanem al user introduir dos valors
        System.out.println("introdueix dos numeros enters: ");
        a =  sc.nextInt();
        b = sc.nextInt();

        // Escrivim "Són divisibles" si els 2 numeros ho són i res sinó h són
        if (a%b==0){
            System.out.println("Són divisibles");
        }else{
            System.out.println("No són divisibles");
        }
    }
}
