package com.eichfizh;

class Main {
    public static void main(String[] args) 
    {   
        //Tipe data
        // integer, byte, short, long, double, float, char, boolean
        // integer (satuan)
        int i = 10;
        System.out.println("\n ===========Integer===========");
        System.out.println("nilai Integer i = " + i);
        System.out.println("nilai MAX = " + Integer.MAX_VALUE);
        System.out.println("nilai MIN = " + Integer.MIN_VALUE);
        System.out.println("besar Integer = " + Integer.BYTES + "bytes");
        System.out.println("besar Integer = " + Integer.SIZE + "bit");

        // Byte (satuan)
        byte b  = 10;
        System.out.println("\n ===========Byte===========");
        System.out.println("nilai Byte i = " + b);
        System.out.println("nilai MAX = " + Byte.MAX_VALUE);
        System.out.println("nilai MIN = " + Byte.MIN_VALUE);
        System.out.println("besar Byte = " + Byte.BYTES + "bytes");
        System.out.println("besar Byte = " + Byte.SIZE + "bit");
        
        // Short (satuan)
        short s  = 10;
        System.out.println("\n ===========Short===========");
        System.out.println("nilai Short i = " + s);
        System.out.println("nilai MAX = " + Short.MAX_VALUE);
        System.out.println("nilai MIN = " + Short.MIN_VALUE);
        System.out.println("besar Short = " + Short.BYTES + "bytes");
        System.out.println("besar Short = " + Short.SIZE + "bit");

        // Long (satuan)
        long l  = 10L;
        System.out.println("\n ===========Long===========");
        System.out.println("nilai Long i = " + l);
        System.out.println("nilai MAX = " + Long.MAX_VALUE);
        System.out.println("nilai MIN = " + Long.MIN_VALUE);
        System.out.println("besar Long = " + Long.BYTES + "bytes");
        System.out.println("besar Long = " + Long.SIZE + "bit");
        
        // Double (koma, bilangan real)
        double d  = 10.8D;
        System.out.println("\n ===========Double===========");
        System.out.println("nilai Double i = " + d);
        System.out.println("nilai MAX = " + Double.MAX_VALUE);
        System.out.println("nilai MIN = " + Double.MIN_VALUE);
        System.out.println("besar Double = " + Double.BYTES + "bytes");
        System.out.println("besar Double = " + Double.SIZE + "bit");
        
        // Float (satuan)
        float f  = 10.3F;
        System.out.println("\n ===========Float===========");
        System.out.println("nilai Float i = " + f);
        System.out.println("nilai MAX = " + Float.MAX_VALUE);
        System.out.println("nilai MIN = " + Float.MIN_VALUE);
        System.out.println("besar Float = " + Float.BYTES + "bytes");
        System.out.println("besar Float = " + Float.SIZE + "bit");
        
        // Char (character) berdasarkan ASCII
        char c  = 'c';
        System.out.println("\n ===========Char===========");
        System.out.println("nilai Char i = " + c);
        System.out.println("nilai MAX = " + Character.MAX_VALUE);
        System.out.println("nilai MIN = " + Character.MIN_VALUE);
        System.out.println("besar Char = " + Character.BYTES + "bytes");
        System.out.println("besar Char = " + Character.SIZE + "bit");
        
        // Boolean (nilai true atau false)
        boolean val  = true;
        System.out.println("\n ===========Boolean===========");
        System.out.println("nilai Boolean i = " + val);
        System.out.println("nilai MAX = " + Boolean.TRUE);
        System.out.println("nilai MIN = " + Boolean.FALSE);
        

        System.out.println(" \n =========== Variabel ===========");
        // Variabel
        int x = 10; // masukin nilai 10 ke x disebut assignment
        System.out.println("Nilai dari x = " + x);
        
        x = 20;
        System.out.println("Nilai dari x baru = " + x);

        System.out.println(" \n =========== Deklarasi ===========");
        // Deklarasi
        int y; //kalau tanpa assignment disebut deklarasi

        y = 7;

        System.out.println("Ini adalah nilai y = " + y);
    }
}