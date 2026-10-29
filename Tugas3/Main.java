
package Tugas3;

public class Main {
    public static void main(String[] args) {
        
        BangunDatar persegi = new Persegi(5.0f);
        BangunDatar lingkaran = new Lingkaran(7.0f);
        BangunDatar persegiPanjang = new PersegiPanjang(10.0f, 5.0f);
        BangunDatar segitiga = new Segitiga(6.0f, 8.0f);

        System.out.println(">>> PERSEGI <<<");
        System.out.println("Luas     : " + persegi.luas());
        System.out.println("Keliling : " + persegi.keliling());
        System.out.println();
        
        System.out.println(">>> LINGKARAN <<<");
        System.out.println("Luas     : " + lingkaran.luas());
        System.out.println("Keliling : " + lingkaran.keliling());
        System.out.println();
        
        System.out.println(">>> PERSEGI PANJANG <<<");
        System.out.println("Luas     : " + persegiPanjang.luas());
        System.out.println("Keliling : " + persegiPanjang.keliling());
        System.out.println();
        
        System.out.println(">>> SEGITIGA <<<");
        System.out.println("Luas     : " + segitiga.luas());
        System.out.println("Keliling : " + segitiga.keliling());
    }
}
