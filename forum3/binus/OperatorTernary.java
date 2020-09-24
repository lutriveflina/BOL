package com.ol.binus;

import java.util.Scanner;

public class OperatorTernary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        // menggunakan operator ternary
        String status = (nilai > 75) ? "Lulus" : "Gagal";
        System.out.print(status);
    }
}
