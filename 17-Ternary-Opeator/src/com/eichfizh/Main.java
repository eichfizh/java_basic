package com.eichfizh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ternary operator
        
        int input, x;
        
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("Masukkan nilai: ");
        input = inputUser.nextInt();
        System.out.println(input);

        // variabel x = ekspresi ? statement_true : statement_false;
        x = (input == 10) ? (input*input) : (input/2);

        System.out.println("hasilnya " + x);
    }
}