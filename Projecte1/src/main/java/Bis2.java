import java.util.Scanner;

public class Bis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte inici, fi, temporal;


        System.out.println("Introdueix un valor per iniciar entre -128 i 127 ");
        inici = sc.nextByte(); // variable de control
        System.out.println("Introdueix un valor per acabar entre -128 i 127 ");
        fi = sc.nextByte(); // variable de control

        //comprovo si numeroInicial es menor o igual que numeroFinal i sino intercancvio els numeros

        if (inici > fi){
            //Guardem el valor d'una de les variables a intercanviar a la varible temporal
            temporal = inici;
            //copiem el valor de la variable que no té copia (numeroFinal) a la que té copia (numeroInicial)
            inici = fi;

            //copiem el valor de numeroFinal a variable temporal
           inici = temporal;
        }

        while (inici !=fi) { // mentre el valor de inici sigue dif a fi
            System.out.print(inici); // mostra el numero inici

            if (inici%2 == 0) { // si el valor de inici es residu 0 mostra parell si no imparell
                System.out.println(" És parell");
            } else {
                System.out.println(" És imparell");

            }
            inici++; // augmenta el valor d'inici per arribar al valor indicat de fi
        }
        if (fi % 2 == 0) {// si fi es residu 0 de fi mostra si es parell o imparell
            System.out.print(fi + " És parell ");
        } else {
            System.out.print(fi + " És imparell ");
        }
    }
}










