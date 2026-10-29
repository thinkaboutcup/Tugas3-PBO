package Tugas3;

public class Persegi extends BangunDatar {
    float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    public float luas() {
        return sisi * sisi;
    }

    public float keliling() {
        return 4 * sisi;
    }
}