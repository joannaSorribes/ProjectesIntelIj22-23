import java.util.Scanner;
public class PaTomata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ingr1, ingr2;

        // Introduir els 2 ingredients
        ingr1 = sc.nextLine();
        ingr2 = sc.nextLine();

        // Mostrar 1r paraula "amb" la segona paraula
        System.out.println(ingr1+" amb "+ingr2);

    }

}
