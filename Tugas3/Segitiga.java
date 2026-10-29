package Tugas3;

public class Segitiga extends BangunDatar {
    float alas, tinggi;
    float sisiA, sisiB, sisiC;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = alas;
        this.sisiB = (float) Math.sqrt((alas/2)*(alas/2) + (tinggi*tinggi));
        this.sisiC = this.sisiB;
    }

    public float luas() {
        return 0.5f * alas * tinggi;
    }

    public float keliling() {
        return sisiA + sisiB + sisiC;
    }
}