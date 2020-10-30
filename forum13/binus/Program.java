package com.ol.binus;

import java.util.*;

public class Program {
    // TODO code application logic here
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//menampung inputan dari user dan memanggil class Mahasiswa dan MahasiswaComporator

        System.out.print("Masukkan jumlah data: ");
        int jmlData = input.nextInt();

        List<Mahasiswa> daftarMhs = new ArrayList<>();

        for (int i = 0; i < jmlData ; i++) {
            System.out.println("Masukkan data ke- "+ (i + 1) +" ");
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("Masukkan NIM: ");
                String nim = input.nextLine();

                System.out.print("Masukkan Nama: ");
                String nama = input.nextLine();

                System.out.print("Masukkan IPK: ");
                double ipk = input.nextDouble();

                System.out.println("");

                daftarMhs.add(new Mahasiswa(nim, nama, ipk));

            }catch(Exception e) {
                System.out.print("Inputan Ada yang salah : " + e);
            }
        }


        MahasiswaComporator comporator = new MahasiswaComporator();
        Collections.sort(daftarMhs,comporator);


        System.out.println("\nHasil Setelah di Sorting: ");


        for (Mahasiswa mhsall:daftarMhs)
            System.out.println(mhsall.toString());
    }
}