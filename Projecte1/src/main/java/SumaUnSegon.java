import java.util.Scanner;
public class SumaUnSegon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m, s;        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();

        s = s+1;

        if(s==60){
            m++; // afegim un minut al contador
            s=0; // reiniciem el contador de segons
            if(m == 60){
                h++;
                m=0;
                if(h==24){
                    h=0;
                }
            }
        } System.out.println(h+" "+m+" "+s);

    }

}

