import java.util.Scanner;
public class EtsJove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* covit entre joves de 18 a menys i ell te 28
        mostrar si si l'edat és de menys de 30 i no si és al contrari */
        // delarem variables
        int jove, noJove;
        jove = sc.nextInt();
        // condicions Mostrar si són joves o no

        if(jove<30&&jove>=0){
            System.out.println("SI");
        } else{
            System.out.println("NO");
        }
    }
}
