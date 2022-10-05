import java.util.Scanner;

public class SumaPatates {
    public static void main(String[] args) {
        //La primera línia indica els casos de prova a considerar Cada cas compta amb 1 linea amb diversos números.
        // El primer nombre de camions que arriben, k. Després hi haurà k nombres, que és les patates que du cada camió

        Scanner sc = new Scanner(System.in);
        int cas, counter = 0;

        cas = sc.nextInt(); // indiquem els casos que itruduirem

        while (counter <= cas) {

            // tractar cas de proba n2 camions
            int n2, counter2 = 1;
            int pataques, suma = 0;

            // lectura de dades
            n2 = sc.nextInt();

            // tractar cas de proba
            while (counter2 <= n2) {
                pataques = sc.nextInt();
                suma = suma + pataques;
                counter2++;
            }
            System.out.println( suma );
            counter++;
        }

    }

}



