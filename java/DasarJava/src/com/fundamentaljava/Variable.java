package com.fundamentaljava;

public class Variable {
    public static void main(String[] args) {
        // Untuk declarasi variable terbagi menjadi 2 yaitu assignment dan deklration
        // Deklaration variable (tipe data namaVariable;)
        int nomor;
        nomor = 30;
        System.out.println(nomor);

        // Assignment Variable
        String namaDepan = "Adam";
        System.out.println(namaDepan);

        // Tipe data di java dan cara membuat variable

        int number = 10;
        System.out.println(number);
        // Tipe data selanjutnya yaitu char (character), untuk referensi char bisa merujuk ke ASCII
        // Untuk char sendiri menggunakan petik 1
        char nama = 'a';
        System.out.println(nama);
        // Lalu ada tipe data boolean yang bernilai benar atau salah (true or false)
        boolean benar = true;
        boolean salah = false;
        System.out.println(benar);
        System.out.println(salah);
        // Tipe data selanjutnya yaitu float atau bilangan desimal
        // penggunaan f dibelakang angka untuk menunjukkan bahwa tipe data tersebut adalah float
        float desimal = 2f;
        float desimal2 = 2.5f;
        System.out.println(desimal);
        System.out.println(desimal2);
        // Double adalah tipe data sama seperti float namun untuk jumlah desimal yang ditampung lebih besar daripada float
        double angkaDesimal = 2.403;
        System.out.println(angkaDesimal);
        // Lalu ada tipe data String yaitu berupa sebuah kata, nama atau yang berisi kalimat. Untuk String sendiri menggunakan tanda petik 2 ""
        String namaLengkap = "Adam Abdillah";
        System.out.println(namaLengkap);

        System.out.println("==========================================================");

        // Tipe data primitif
        // int, short, long, byte, double, float, char, boolean

        // Integer (satuan)
        int x = 20;
        System.out.println("Nilai dari X adalah " + x);
        // Besaran nilai yang ditampung dalam tipe data integer
        System.out.println("Nilai max dari X adalah = " + Integer.MAX_VALUE);
        System.out.println("Nilai min dari X adalah = " + Integer.MIN_VALUE);
        System.out.println("Besar nilai integer = " + Integer.BYTES + " Bytes");
        System.out.println("Besar nilai integer = " + Integer.SIZE + " Bit");

        // Byte (satuan)
        byte b = 12;
        System.out.println("Nilai dari B adalah " + b);
        // Besaran nilai yang ditampung dalam tipe data byte
        System.out.println("Nilai max dari B adalah = " + Byte.MAX_VALUE);
        System.out.println("Nilai min dari B adalah = " + Byte.MIN_VALUE);
        System.out.println("Besar nilai byte = " + Byte.BYTES + " Bytes");
        System.out.println("Besar nilai byte = " + Byte.SIZE + " Bit");

        // Long (satuan)
        long l = 122;
        System.out.println("Nilai dari L adalah " + l);
        // Besaran nilai yang ditampung dalam tipe data long
        System.out.println("Nilai max dari L adalah = " + Long.MAX_VALUE);
        System.out.println("Nilai min dari L adalah = " + Long.MIN_VALUE);
        System.out.println("Besar nilai byte = " + Long.BYTES + " Bytes");
        System.out.println("Besar nilai byte = " + Long.SIZE + " Bit");

        // Short (satuan)
        short s = 68;
        System.out.println("Nilai dari S adalah " + s);
        // Besaran nilai yang ditampung dalam tipe data short
        System.out.println("Nilai max dari S adalah = " + Short.MAX_VALUE);
        System.out.println("Nilai min dari S adalah = " + Short.MIN_VALUE);
        System.out.println("Besar nilai short = " + Short.BYTES + " Bytes");
        System.out.println("Besar nilai short = " + Short.SIZE + " Bit");

        // Double (desimal)
        double d = 20.329;
        System.out.println("Nilai dari D adalah " + d);
        // Besaran nilai yang ditampung dalam tipe data double
        System.out.println("Nilai max dari S adalah = " + Double.MAX_VALUE);
        System.out.println("Nilai min dari S adalah = " + Double.MIN_VALUE);
        System.out.println("Besar nilai double = " + Double.BYTES + " Bytes");
        System.out.println("Besar nilai double = " + Double.SIZE + " Bit");

        // Float (desimal)
        float f = 2.4f;
        System.out.println("Nilai dari D adalah " + d);
        // Besaran nilai yang ditampung dalam tipe data double
        System.out.println("Nilai max dari S adalah = " + Double.MAX_VALUE);
        System.out.println("Nilai min dari S adalah = " + Double.MIN_VALUE);
        System.out.println("Besar nilai double = " + Double.BYTES + " Bytes");
        System.out.println("Besar nilai double = " + Double.SIZE + " Bit");
    }
}
