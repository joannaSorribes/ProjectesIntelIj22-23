import java.util.Scanner;
public class multiplicar3 {
    public static void main(String[] args) {
        // Declarar variables
        Scanner scr = new Scanner(System.in);
        int num;

        //1r llegir un numero enter

        num = scr.nextInt(); // espera q l'usuari introdueixi un valor

        // 2n mostrar el numero * 3

        int resultat = num*3;
        System.out.println(resultat);
    }
}
