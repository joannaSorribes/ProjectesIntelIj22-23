import java.util.Scanner;

public class sumaDos {
    public static void main(String[] args) {
        //declarar variables
        Scanner sc = new Scanner(System.in);
        int num1, num2, suma;

       // introduier 1 num enter en 2 entrades

        num1 = sc.nextInt();
        num2 = sc.nextInt();

      // sumar els dos num entrats
        suma = num1+num2;
        System.out.println(suma);
    }
}
