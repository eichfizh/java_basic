package com.eichfizh;

// perumpamaannya, kita mau ambil library Scanner yang berada di folder utiliti dan folder java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /// Kesimpulan perkalian dan pembagian akan dieksekusi terlebih dahulu
        /* Tingkatan Prioritas 
            1. Pengelompokan operasi dengan ()
            2. Perkalian Pembagian
            3. Penjumlah Pengurangan        
        */   
        // int hasil = 2 * 5 + 10; // 20
        // int hasil = 10 + 2 * 5; // 20
        // int hasil = 10 / 2 + 2 * 5; // 15

        /// Perkalian dan pembagian setara jadi akan dieksekusi yang dahulu dari kiri ke kanana
        // int hasil = 10 / 2 * 5; // 25
        int hasil = 5 * 10 / 2; // 25
        System.out.println(hasil);

        /// Penjumlahan dan pengurangan setara jadi akan dieksekusi yang dahulu dari kiri ke kanana
        hasil = 5 - 10 + 1; // 25
        System.out.println(hasil);

        // Pengelompokan operasi dengan ( )
        hasil = 120 / (2 + 10);
        System.out.println(hasil);


        /// Contoh soal
        Scanner userInput = new Scanner(System.in);
        // Perhitungan persamaan kuadrat
        System.out.println("/nMenghitung Persamaan Kuadrat");

        int m,x,c;
        System.out.print("Nilai x = ");
        x = userInput.nextInt();
        System.out.print("Gradient m = ");
        m = userInput.nextInt();
        System.out.print("Bias c = ");
        c = userInput.nextInt();

        int y = (m * x * x) + c;

        System.out.println("Nilai Y = " + y);
    }
}