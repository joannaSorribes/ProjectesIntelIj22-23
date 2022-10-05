import java.util.Scanner;
public class BarretHogwarts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaració de variables
        String user;

        // Usuari intrdouir dades
        user = sc.nextLine();

        switch (user){
            case "Coratge":
                System.out.println("Gryffindor");
                break;
            case "Coneixement":
                System.out.println("Ravenclaw");
                break;
            case "Ambicio":
                System.out.println("Slytherin");
                break;
            default:
                System.out.println("Hufflepuff");

        }
    }
}
