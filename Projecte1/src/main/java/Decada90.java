import java.util.Scanner;
public class Decada90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int any,resto;
        any = sc.nextInt();
        //obtenim els dos ultims digits al residu de dividir entre 100
        any = any%100;

        if(any>=90 && any<=99){
        System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}
