package com.eichfizh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek untuk menangkap input dari user 
        Scanner inputUser = new Scanner(System.in);

        //Sebuah program menebak angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukkan nilai tebakan anda = ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai tebakan anda adalah = " + nilaiTebakan);

        // Operasi Logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda " + statusTebakan);

        // Operasi aljabar boolean ( and (&&) / or (||))
        System.out.print("Masukkan nilai diantara 3 dan 10 = ");
        nilaiTebakan = inputUser.nextInt();
        /* 
         * Logika and (&&)
         * a | b | c
         * 0   0   0
         * 0   1   0
         * 1   0   0 
         * 1   1   1
        */
        statusTebakan = (nilaiTebakan > 3) && (nilaiTebakan < 10);
        System.out.println("Tebakan anda " + statusTebakan);

        System.out.print("Masukkan nilai diantara 3 dan 10 = ");
        nilaiTebakan = inputUser.nextInt();
        /* 
         * Logika or (||)
         * a | b | c
         * 0   0   0
         * 0   1   1
         * 1   0   1 
         * 1   1   1
        */
        statusTebakan = (nilaiTebakan > 3) || (nilaiTebakan < 10);
        System.out.println("Tebakan anda " + statusTebakan);

    }
}
