import java.util.Scanner;
public class Bis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte inici, fi;

        System.out.println("Introdueix un valor per iniciar entre -50 i 127 ");
        inici = sc.nextByte();
        System.out.println("Introdueix un valor per acabar entre -50 i 127 ");
        fi = sc.nextByte();

        while (inici !=fi) {
            System.out.println(inici);
            if (inici%2 == 0) {
                System.out.println(" És parell");
            } else {
                System.out.println(" És imparell");

            }inici++;
        }

    }
}
/*while (i <=n && i>=-50) {
        System.out.print(i);
        if (i%2 == 0) {
        System.out.println(" És parell");
        }else System.out.println(" És Imparell");
        i++;
*/

