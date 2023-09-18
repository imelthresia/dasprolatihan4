import java.util.Scanner;

public class kelilingpersegipanjang {
    public static void main (String [] args){

        Scanner input =new Scanner(System.in);

        int panjang;
        int lebar;
        int keliling;

        System.out.println("masukkan panjang");
        panjang = input.nextInt();
        System.out.println("masukkan lebar");
        lebar = input.nextInt();

        keliling = panjang * lebar;
        System.out.println(keliling);

    } 
}