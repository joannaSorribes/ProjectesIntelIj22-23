import java.util.Scanner;
public class caramelos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int candy, nens, resto;

        // indica el nombre de caramels i de nens

        candy = sc.nextInt();
        nens = sc.nextInt();
        resto = candy%nens;
        // Mostrar caramels que sobren
        System.out.println(resto);
    }
}
