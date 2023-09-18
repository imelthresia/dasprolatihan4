import java.util.Scanner;

public class luaspersegipanjang {
    public static void main (String [] args){

        Scanner input =new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;

        System.out.println("masukkan panjang");
        panjang = input.nextInt();
        System.out.println("masukkan lebar");
        lebar = input.nextInt();

        luas = panjang * lebar;
        System.out.println(luas);

    } 
}