import java.util.Scanner;

public class kelilinglingkaran {
    public static void main (String [] args){

        Scanner input =new Scanner(System.in);

        int phi;
        int  jarijari;
        int keliling;

        System.out.println("masukkan phi");
        phi = input.nextInt();
        System.out.println("masukkan jarijari");
        jarijari = input.nextInt();

        keliling = 2 * phi * jarijari;
        System.out.println(keliling);

    } 
}