package org.kawahedu.Task.WeekFive;


public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();

        Persegi persegi = new Persegi();
        persegi.sisi = 5;

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 7;

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 5;
        persegiPanjang.lebar = 10;

        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 10;
        mSegitiga.tinggi = 7;
        mSegitiga.sisi1 = 8;
        mSegitiga.sisi2 = 9;
        mSegitiga.sisi3 = 10;

        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        mSegitiga.luas();
        mSegitiga.keliling();
    }
}
