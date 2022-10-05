import java.util.Locale;
import java.util.Scanner;

public class DimensioDiverssa {
    public static void main(String[] args) {
        // Canviem l'idioma del programa
        Locale.setDefault(Locale.ENGLISH);
        // atribuim variable a l entrada del usuari
        Scanner ent = new Scanner(System.in);
        double num;
        num = ent.nextDouble();
        // mostrem per pantalla el resultat
        System.out.println(1/num);

        }
    }

