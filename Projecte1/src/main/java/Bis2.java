import java.util.Scanner;
public class Bis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte inici, fi;

        System.out.println("Introdueix un valor per iniciar entre -128 i 127 ");
        inici = sc.nextByte();
        System.out.println("Introdueix un valor per acabar entre -128 i 127 ");
        fi = sc.nextByte();

        while (inici !=fi) {
            System.out.println(inici);
            if (inici%2 == 0) {
                System.out.println(" És parell");
            } else {
                System.out.println(" És imparell");

            }inici++;
        } 
        if (fi % 2 == 0) {
            System.out.print(fi + " És parell ");
        } else {
            System.out.print(fi + " És imparell ");
        }

    }
}
