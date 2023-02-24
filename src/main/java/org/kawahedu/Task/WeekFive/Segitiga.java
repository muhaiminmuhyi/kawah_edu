package org.kawahedu.Task.WeekFive;

public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;

    float sisi1;
    float sisi2;
    float sisi3;

    @Override
    float luas() {
        float luas = 1/2f * (alas * tinggi);
        System.out.println("Luas Segitiga adalah : " + luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = sisi1 + sisi2 + sisi3;
        System.out.println("Keliling Segitiga adalah : " + keliling);
        return keliling;
    }
}
