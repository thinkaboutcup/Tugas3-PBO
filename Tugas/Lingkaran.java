package Tugas;
import java.util.Scanner;
public class Lingkaran {
    public static void main (String [] args) {
        Scanner input = new Scanner  (System.in);
        float jari, keliling, luas;
        final float Pi = (float) 3.14;
        
        System.out.println("Masukkan jari-jari :");
        jari = input.nextFloat();
        
        luas = Pi*jari*jari;
        keliling = 2*Pi*jari;
        
        System.out.println("luas : " + luas + "Keliling : "+ keliling);
    }
}