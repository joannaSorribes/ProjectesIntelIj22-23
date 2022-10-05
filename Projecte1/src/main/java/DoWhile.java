import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota, contNota = 0, excelent = 0;
// si saps que la condició ha d'entrar un cop es millor do while
        do {
            nota = sc.nextInt();
            if (nota >= 0 && nota <= 10) { // si la nota és major o menor=a10
                contNota++;
            }

            if (nota == 10) { // si es igual a 10 guardeem en una nova variable
                excelent++;
            }

        } while (nota != -1);
        System.out.println("TOTAL NOTES: " + contNota + " NOTES10: " + excelent);
    }


}

