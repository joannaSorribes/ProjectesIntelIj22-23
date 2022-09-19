
import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        // 1 Declarar una variable de tipo Scanner
        Scanner scr = new Scanner(System.in);

        // Declaro variable per guardar valor
        int num;
        double real, suma;

        // 2 Llegir dades enteres i Guardem en una variable el valor que introdueix l'usuari
        System.out.println("Introdueix un valor enter entre 1 i 10:");
        num = scr.nextInt(); // espera q l'usuari introdueixi un valor
        if ((num > 10) || (num < 0)) {
            System.out.println("Error, el valor no esta entre 1-10");
        }

        System.out.println("Introdueix un numero real: ");
        real = scr.nextDouble();

        // 3 Treballem la variable de la maenra que volem. Usuari introduir valor

        System.out.println("El valor de la variable és: " + num);

        suma = num + real;
        System.out.println("La suma dels valors de " + num + " + " + real + " és: " + suma );


    }
}

