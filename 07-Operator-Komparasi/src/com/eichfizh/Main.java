package com.eichfizh;

public class Main {

    public static void main(String[] args){
        // Operator Komparasi ini akan menghasilkan nilai dalam bentuk boolean dari perbandingan dua buah nilai

        int a,b;
        // float a,b;
        boolean hasilKomparasi;

        // Operator Equal atau Persamaan
        System.out.println("---------- PERSAMAAN");
        // a = 11.0f;
        // b = 10.5f;
        a = 10;
        b = 10;

        // A artinya sama dengan B
        hasilKomparasi = (a == b);
        // System.out.printf("%f apakah sama dengan %f ? %s \n",a,b,hasilKomparasi);
        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        // Operator Equal atau Persamaan
        a = 12;
        b = 10;

        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        // Operator NOT Equal atau Pertidaksamaan
        System.out.println("---------- PERTIDAKSAMAAN");
        a = 10;
        b = 10;

        // A artinya tidak sama dengan B
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b,hasilKomparasi);

        // Operator Equal atau Persamaan
        a = 12;
        b = 10;

        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b,hasilKomparasi);

        // Operator Less than atau Kurang dari
        System.out.println("---------- KURANG DARI");
        a = 9;
        b = 10;

        // A artinya kecil dari B
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b,hasilKomparasi);

        // Operator Equal atau Persamaan
        a = 12;
        b = 10;

        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b,hasilKomparasi);
        
        // Operator Greater than atau Lebih dari
        System.out.println("---------- LEBIH DARI");
        a = 9;
        b = 10;

        // A artinya besar dari B
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b,hasilKomparasi);

        // Operator Equal atau Persamaan
        a = 12;
        b = 10;

        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b,hasilKomparasi);

        // Operator Less than equal atau Kurang dari sama dengan
        System.out.println("---------- kURANG DARI SAMA DENGAN");
        a = 9;
        b = 10;

        // A artinya kecil dari B
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b,hasilKomparasi);
        a = 10;
        b = 10;

        // A artinya kecil dari B
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b,hasilKomparasi);

        // Operator Equal atau Persamaan
        a = 12;
        b = 10;

        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b,hasilKomparasi);

        // Operator Greater than equal atau Lebih dari sama dengan
        System.out.println("---------- LEBIH DARI SAMA DENGAN");
        a = 9;
        b = 10;

        // A artinya kecil dari B
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b,hasilKomparasi);

        a = 10;
        b = 10;

        // A artinya kecil dari B
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b,hasilKomparasi);

        // Operator Equal atau Persamaan
        a = 12;
        b = 10;

        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b,hasilKomparasi);

    }
}