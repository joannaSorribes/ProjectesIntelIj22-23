import java.util.Scanner;
public class LastDayDawn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Hem de diferenciar ente hores de dia i nit
        Declarem variables*/
        int s, dia, matiNit;
        s = sc.nextInt();

        //Mostrar el resultat Obtenim el dia
        dia = (s / 86400) + 1;

        // Saber si és nit o dia hem de fer %
        matiNit = s %= 86400;

        if (matiNit < 43200) {
            System.out.print("mati");
        } else {
            System.out.print("nit");
        }
        System.out.print(" del dia "+dia);
    }
}

