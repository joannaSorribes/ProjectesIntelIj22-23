import java.util.Scanner;
public class Quadrat {
    public static void main(String[] args) {
        //Declarem Variables
        Scanner scr = new Scanner(System.in);
        int area;

        //Llegir area del quadrat
        area = scr.nextInt(); // espera q l'usuari introdueixi un valor

        int resultat = area*area;

        System.out.println(resultat);

    }
}
