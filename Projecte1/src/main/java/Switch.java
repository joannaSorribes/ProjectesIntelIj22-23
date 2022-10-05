import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        // 3r Condicional SWITCH
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.println("Introdueix un numero enter entre  1 i 2");
        a = sc.nextInt();
        // Indicarem si el numero val 1 o 2
        switch(a){
            case 1: //Només podem tractar un sol valor en cada cas
                System.out.println("Has introduit un 1");
                break; //Opcional
            case 2:
                System.out.println("Has introduit un 2");
                break; //Opcional
            default:
                System.out.println("El numero introduit no està entre 1 i 2");

        }

    }
}
