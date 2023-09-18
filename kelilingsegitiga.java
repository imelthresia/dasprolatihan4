import java.util.Scanner;

public class kelilingsegitiga {
    public static void main (String [] args){

        Scanner input =new Scanner(System.in);

        int a;
        int b;
        int c;
        int keliling;

        System.out.println("masukkan sisi a");
        a = input.nextInt();
        System.out.println("masukkan sisi b");
        b = input.nextInt();
        System.out.println("masukkan sisi c");
        c = input.nextInt();

        keliling = a + b + c;
        System.out.println(keliling);

    } 
}