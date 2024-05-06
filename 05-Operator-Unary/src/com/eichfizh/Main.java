package com.eichfizh;

public class Main {
    public static void main(String[] args) {
        // Operator Unary
        // Unary adalah operasi yang dilakukan pada satu variabel saja

        // Unary + dan -
        int angka = 1;
        System.out.printf("Unary '+', int %d menjadi %d",angka, +angka);
        System.out.printf("Unary '-', int %d menjadi %d",angka, -angka);

        // Unary Increment dan Decrement
        int angka2 = 10;
        angka2++;
        System.out.println("Nilai dengan '++' menjadi = " + angka2);
        angka2--;
        System.out.println("Nilai dengan '--' menjadi = " + angka2);

        // Prefix dan Postfix
        int a = 5;
        System.out.println("Nilai dengan '++' prefix menjadi = " + ++a);
        int b = 5;
        System.out.printf("Nilai dengan '++' postfix menjadi = %d ", b++);
        System.out.println("Nilai hasil dar postfix menjadi = " + b);

        // Unary boolean dengan ! untuk negasi
        boolean ucup = true;
        System.out.println("Nilai boolean = " + ucup);
        // ! namanya bang sign
        System.out.println("Nilai boolean = " + !ucup);
    }
}