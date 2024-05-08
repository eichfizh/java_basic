package com.eichfizh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Switch case

        /*
         * switch (ekspresi) {
         *      case pilihan:
         *          statement
         *          break;
         *      default:
         *          break;
         * }
         */

        String input;

        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("panggil nama: ");
        input = inputUser.next();

        // Ekspresinya berupa satuan (int, long, byte, short), String, enum

        // Kalau switch case untuk elsenya dia menggunakan default
        // Kalau case tersebut true maka semua case dibawahnya akan tetap di jalankan sampe default makanya diperlukan namanya break
        // break berfungsi untuk keluar dari switch casenya

        switch (input) {
            case "hernando":
                System.out.println(input + " hadir pak");
                break;
            case "ucup":
                System.out.println(input + " hadir pak");
                break;
            default:
                System.out.println("Dia tidak hadir pak");
                break;
        }

        System.out.println("Selesai program");
    }
}
