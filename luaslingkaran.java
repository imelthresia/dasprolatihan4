import java.util.Scanner;

public class luaslingkaran {
    public static void main (String [] args){

        Scanner input =new Scanner(System.in);

        int phi;
        int  jarijari;
        int luas;

        System.out.println("masukkan phi");
        phi = input.nextInt();
        System.out.println("masukkan jarijari");
        jarijari = input.nextInt();

        luas = phi * jarijari * jarijari;
        System.out.println(luas);

    } 
}