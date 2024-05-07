package com.eichfizh;

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan nested if
        int a = 2;
        int b = 10;

        System.out.println("Ini awal program");

        /*
         * Ini adalah contoh nested if
         * if (ekspresi_1){
         * if (ekspresi_2){
         * statement_2
         * } else {
         * statement_default_2
         * }
         * } else {
         * statement_default_1
         * }
         */

        if (a == 5) {
            if (b == 10) {
                System.out.println("Ini adalah dimana a = 5 dan b = 10");
            } else {
                System.out.println("ini adalah default 2, dimana a = 5 dan b bukan 10");
            }
        } else {
            System.out.println("Ini adalah default dimana a dan b salah");
        }

        System.out.println("Ini akhir program");
    }
}
