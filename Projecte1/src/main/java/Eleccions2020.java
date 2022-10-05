
import java.util.Scanner;
public class Eleccions2020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarar variables
        int jiden, drump, banders;
        jiden = sc.nextInt();
        drump = sc.nextInt();
        banders = sc.nextInt();

        // Condició
        if (jiden > banders && jiden > drump) {
            System.out.println("Jiden");
        } else if (drump > jiden&&drump>banders) {
            System.out.println("Drump");
        } else {
            System.out.println("Banders");
        }
    }
}



