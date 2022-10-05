import java.util.Scanner;

public class Bucle1 {
    /* */

    public static void main(String[] args) {
        // Demanar un enter a un usuari i mostrar la seqüència d'1 fins al numero introduit.
        byte num, comptador=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduiex un número enter qualsevol");

        // teclat espera introducció de dades
        num = sc.nextByte();

        // mostrar la sortida
        while (num>=comptador) {
            System.out.println(comptador);
            comptador++;
        }

    }
}
