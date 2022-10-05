import java.util.Scanner;
public class Practica {
    /* demana al usuari introduir 2 numeros enters i donar true si son divisibles
    entre ells. En cas contrari que done false */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declaracio variables
        int num,num2;
        System.out.println("introdueix dos numeros enters: ");
        num =  sc.nextInt();
        num2 = sc.nextInt();

        boolean resultat;
        resultat= num%num2==0;
        System.out.println(resultat);
        System.out.println(num%num2==0);

    }
}
