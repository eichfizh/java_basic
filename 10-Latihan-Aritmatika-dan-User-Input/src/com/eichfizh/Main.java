package com.eichfizh;

// perumpamaannya, kita mau ambil library Scanner yang berada di folder utiliti dan folder java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // NILAI DI SET MANUAL
        // Membuat perhitungan untuk menghitung luas persegi panjang
        // luas = panjang * lebar
        // nilai 10 disebut dengan nilai literal
        // int panjang = 10;
        // int lebar = 4;
        // int luas = panjang * lebar;
        // System.out.println(luas);    
        
        //Scanner Untuk mengambil input dari user, kalau diterjemahkan kita punya nama variable user input dengan tipe data Scanner yang nilainya adalah object dari class Scanner
        // System.in adalah dia akan mengambil input
        Scanner userInput = new Scanner(System.in);

        int panjang, lebar, luas, tinggi, volume;
        // Membuat perhitungan menghitung luas persegi panjang
        // luas = panjang * lebar
        // NILAI DI SET OLEH USER
        System.out.println("MENGHITUNG LUAS");
        System.out.print("panjang = ");
        // userInput digunakan untuk menerima inputan user
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("volume = " + volume);
    }
}