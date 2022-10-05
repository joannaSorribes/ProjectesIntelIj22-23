import java.util.Scanner;
public class HoraValida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m, s;

        // Entrada de dades
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
        // comprovar que les hores son correctes
        if(h>=0 && h<=23 && m>=0 && m<=59 && s>=0 && s<= 59){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}
