package com.eichfizh;

public class Main {
    public static void main(String[] args) {
        // Operasi Aritmatika

        int variabel1 = 5;
        int variabel2 = 3;

        int hasil;

        // Penjumlahan (+)

        hasil = variabel1 + variabel2;
        System.out.println(variabel1 + " + " + variabel2 + " = " + hasil);

        // Pengurangan (-)

        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d \n", variabel1, variabel2, hasil);

        // Perkalian (*)

        hasil = variabel1 * variabel2;
        System.out.printf("%d * %d = %d \n", variabel1, variabel2, hasil);

        // Pembagian (/)

        hasil = variabel1 / variabel2;
        System.out.printf("%d / %d = %d \n", variabel1, variabel2, hasil);

        float a = 6;
        float b = 5;
        float hasilFloat = a/b;
        System.out.println(a + " / " + b + " = " + hasilFloat);

        // Modulus (%)
        hasil = variabel1 % variabel2;
        System.out.printf("%d %% %d = %d \n", variabel1, variabel2, hasil);
    }
}