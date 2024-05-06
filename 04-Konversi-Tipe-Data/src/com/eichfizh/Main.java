package com.eichfizh;

public class Main {
    public static void main(String[] args) {

        // Program Konversi Data

        int nilaiInt = 450; //32-bit
        System.out.println("Nilai int = " + nilaiInt);
        
        // Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("Nilai long = " + nilaiLong);

        // Memperkecil rentang ke tipe data yang lebih kecil
        // tanda kurung dan value tipe data disebut casting operator
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("Nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

        // casting pembagian
        float a = 10;
        int b = 4;
        float c = a/b;

        // %d untuk decimal
        // %f untuk float
        System.out.printf(" %f / %d = %f\n", a,b,c );

        int x = 10;
        int y = 4;

        float z = (float) x/y;
        System.out.printf(" %d / %d = %f\n", x,y,z );

    }
}