// MOstrar numeros parells imparells entre -50 i el introduit per l'usiari amb els dos inclósos
import java.util.Scanner;
public class ParellImparell2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte i =-50, n;
        // Inroduir un enter
        System.out.println("Introdueix un enter entre-50 i 127");
        n = sc.nextByte();

        while (i <=n && i>=-50) {
            System.out.print(i);
            if (i%2 == 0) {
                System.out.println(" És parell");
            }else System.out.println(" És Imparell");
                i++;
            }
        }
    }

