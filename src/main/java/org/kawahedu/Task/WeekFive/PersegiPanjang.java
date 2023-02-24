package org.kawahedu.Task.WeekFive;

public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    @Override
    float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang adalah :" + luas);
        return luas;
    }

    @Override
    float keliling(){
        float kll = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang adalah : " + kll);
        return kll;
    }
}
