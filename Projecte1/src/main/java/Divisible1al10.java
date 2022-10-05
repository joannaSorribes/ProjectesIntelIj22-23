import java.util.Scanner;
public class Divisible1al10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        // saber si N es divisible per 1,2,3,4,5,6,7,8 i9
        // tot numero es divisble per 1, 9 és 3 x 3 per lo qual tm és divisible, si es divisible per 8 2 i 4 tmb
        // mirarem 9 8 7 5
        if (n%9==0 && n%8==0 && n%7==0 && n%5==0){
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }

    }
}
