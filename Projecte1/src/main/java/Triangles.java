import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, base, area;

        // dos entrades per teclat dels usuaris amb un numero per entrada

        altura = sc.nextInt();
        base = sc.nextInt();
        area = (altura*base)/2;

        // mostrar l'area del triangle
        System.out.println(area);

    }
}
