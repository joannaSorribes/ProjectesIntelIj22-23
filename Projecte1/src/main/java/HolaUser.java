import java.util.Scanner;

public class HolaUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nom, salutacio;
        nom = sc.nextLine();
        salutacio = "Hola, ";

        System.out.println(salutacio + nom);



    }
}
