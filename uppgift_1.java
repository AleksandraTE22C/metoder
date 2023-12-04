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

        System.out.println("");
        System.out.println("Uppgift B");
        sum = minus (14, 34);
        System.out.println("14 - 34 = "+sum);
        sum = minus (1212, 333);
        System.out.println("1212 - 333 = "+sum);

    }
    static int addera(int tal1, int tal2){
            int summa = tal1+tal2;
            return summa;
    }
    static int minus(int tal1, int tal2){
            int summa = tal1-tal2;
            return summa;
    }

}