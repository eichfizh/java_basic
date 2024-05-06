package com.eichfizh;

public class Main {
    public static void main(String[] args) {
        // Operator Bitwise --> operator untuk melakukan operasi pada nilai bit

        byte a = 3;
        byte b, c;
        String a_bits, b_bits, c_bits;

        // Operator SHIFT LEFT
        System.out.println("==== SHIFT LEFT (<<) ====");
        // membuat string dengan format tertentu disini perintah untuk menampilkan 8
        // buah karakter. String format akan disimpan di a_bits
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        // angka 1 adalah jumlah pergeseran ke kirinya dari sebelah kanan kalau 3 maka
        // bergeser 3
        // b = (byte)( a << 1);
        b = (byte) (a << 3);
        // Maka outputnya 00011000
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');

        System.out.printf("%s = %d \n", b_bits, b);



        // Operator SHIFT RIGHT
        System.out.println("==== SHIFT RIGHT (>>) ====");
        // Set nilai
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        // angka 1 adalah jumlah pergeseran ke kanannya dari sebelah kiri
        b = (byte) (a >> 1);
        // Maka outputnya 00001100
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');

        System.out.printf("%s = %d \n", b_bits, b);



        // Operator BITWISE OR
        System.out.println("==== BITWISE OR (|) ====");
        // Set nilai
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');

        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("---------OR");
        c = (byte) (a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);



        // Operator BITWISE AND
        System.out.println("==== BITWISE AND (&) ====");
        // Set nilai
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');

        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("---------AND");
        c = (byte) (a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);



        // Operator BITWISE XOR
        System.out.println("==== BITWISE XOR (^) ====");
        // Set nilai
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');

        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("---------XOR");
        c = (byte) (a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);



        // Operator NEGASI / NOT
        System.out.println("==== NEGASI / NOT (~) ====");
        // Set nilai
        a = 24;
        b = (byte) (~a);
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        System.out.println("---------NOT");
        b_bits = String.format("%8s", Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d \n", b_bits, b);

    }
}