import java.util.Scanner;

public class uppgift_1{
    public static void main(String args[]){
        Scanner tb = new Scanner(System.in);

        System.out.println("Uppgift A");
        int sum;
        sum = addera (14, 34);
        System.out.println("14 + 34 = "+sum);
        sum = addera (1212, 333);
        System.out.println("1212 + 333 = "+sum);

        System.out.println();
        System.out.println("Uppgift B");
        sum = minus (14, 34);
        System.out.println("14 - 34 = "+sum);
        sum = minus (1212, 333);
        System.out.println("1212 - 333 = "+sum);

        System.out.println();
        System.out.println("Uppgift C");
        
        double om;
        om = omkretsCirkel(9);
        System.out.println("Omkretsen av en cirkel med radien 9 är: "+om);
        om = omkretsCirkel(33);
        System.out.println("Omkretsen av en cirkel med radien 33 är: "+om);

        System.out.println();
        System.out.println("Uppgift D");
        ritaLinje(23);
        
        System.out.println();
        System.out.println("Uppgift E");
        ritaRektangel(20, 8);

        System.out.println();
        System.out.println("Uppgift F");
        tal_positivt(-3.232);
        tal_positivt(5.232); 

        System.out.println();
        System.out.println("Uppgift G");
        siffra('4');
        siffra('a');

        }

    static int addera(int tal1, int tal2){
            int summa = tal1+tal2;
            return summa;
    }
    static int minus(int tal1, int tal2){
            int summa = tal1-tal2;
            return summa;
    }
    static double omkretsCirkel( double radie ){
        double omkrets = radie * 2 * 3.1415;
        return omkrets;
    }
    static void ritaLinje(int längd){
        for(int i = 0; i < längd; i++){
            System.out.print("-");
            
        }
    }
    static void ritaRektangel (int höjd, int bredd){
        for(int i = 0; i < höjd; i++){
            for(int j = 0; j < bredd; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    static boolean tal_positivt(double tal){
        if(tal > 0 == true){
            System.out.println("Talet "+tal+" är positivt.");
        }
        else{
            System.out.println("Talet "+tal+" är negativt.");
        }
        return false;
    }
    static boolean siffra(char tecken){
        boolean svar = Character.isDigit(tecken);
        if (svar) {
            System.out.println(tecken+" är en siffra");
        } else {
            System.out.println(tecken+" är inte en siffra");
        }
        return svar;
    }

}