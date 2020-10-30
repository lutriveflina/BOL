package com.ol.binus;

import java.util.Scanner;

public class Ajaib {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka antara 1-100 : ");
        int angka = input.nextInt();
        if (angka >= 1 && angka <=100){ 
            if (angka % 2 == 0){
                if (angka >= 6 && angka <= 20){
                    System.out.print("Ajaib");
                }else{
                    System.out.print("Tidak Ajaib");
                }
            }else{
                System.out.print("Ajaib");
            }
        }else {
            System.out.println("Inputan anda salah");
        }
    }
}
