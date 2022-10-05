public class Booleans {
    public static void main(String[] args) {

        // declaro variables
        boolean esHome = true;
        boolean esDona = false;

        // Expressions que podem fer amb Booleans

        //Negació
        System.out.println(!esHome);
        System.out.println(!esDona);

        // Y lògica (and)
        System.out.println("Logica AND");
        System.out.println(esHome && esDona);
        System.out.println(esHome && !esDona);
        System.out.println(!esHome && esDona);
        System.out.println(!esHome && !esDona);

        // O lògica (OR)
        System.out.println("logica O");
        System.out.println(esHome || esDona);
        System.out.println(esHome || !esDona);
        System.out.println(!esHome || esDona);
        System.out.println(!esHome || !esDona);

        //Operacions relacionals
       int a = 25, b=4;
       int c = 5,d = 5;

       boolean diferents, comparar, menor, igual, major;
        igual= a == b;
        diferents = c!=d;
        major = a>b;
        menor = b<c;
        comparar = c >= d;

        /************/
        System.out.println(igual); // fals
        System.out.println(diferents); // fals
        System.out.println(major); //true
        System.out.println(menor); // true
        System.out.println(comparar);//true

        System.out.println(a==b || a>b && b !=b*4);
                            //  False || True &&  true)//
                            //false || true//
                            //  true//

    }
}
