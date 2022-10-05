import java.util.Scanner;

public class BucleNota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = 0, contNota = 0, excelent = 0;


        // tractament de dades
        while (nota != -1) { // indiquem el numero que pararà el bucle
            nota = sc.nextInt();
            if (nota >= 0 && nota <= 10) { // si la nota és major o menor=a10
                contNota++;
            }

            if (nota == 10) { // si es igual a 10 guardeem en una nova variable
                excelent++;
            }


        }
        System.out.println("TOTAL NOTES: " + contNota + " NOTES10: " + excelent);

    }

}
