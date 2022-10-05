import java.util.Scanner;
public class NumerosContinguts {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if(a+1==b || b+1==a){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}
