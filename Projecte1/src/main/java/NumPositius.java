    /* Implementa un programa que llegeix n números enters i ens diu quants d’ells són positius.*/

    import java.util.Scanner;

    public class NumPositius {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n, i = 1, contNumPos = 0;
            int valor;
            n = sc.nextInt();

            // tractament de dades
            while (i <= n) { // aquest bucle indicara la quantitat de numeros q introduirem per fer el bucle
                valor = sc.nextInt();
                if (valor > 0) contNumPos++;
                i++;
            }
            System.out.println(contNumPos);
        }

    }


