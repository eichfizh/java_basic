package com.eichfizh;

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan if elseif
        int a = 10;

        System.out.println("Ini awal program");

        /*
         * Ini adalah contoh if-elseif
         * if (ekspresi_1){
         * statement_1
         * } else if (ekspresi_2){
         * statement_2
         * } else {
         * statement_default
         * }
         */

         if (a == 5) {
            System.out.println("Ini adalah aksi 1");
         } else if (a == 10) {
            System.out.println("Ini adalah aksi 2");
         } else if (a == 15) {
            System.out.println("Ini adalah aksi 3");
         } 
        //  Tambah lagi kondisi yang diperlukan
         else {
            System.out.println("Ini adalah aksi default");
         }

        System.out.println("Ini akhir program");
    }
}
