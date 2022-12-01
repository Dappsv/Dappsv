/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.Scanner;

/**
 *
 * @author mokletgaming
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kamar : ");
        String kamar = input.next();
        System.out.println("Masukkan hari : ");
        String hari = input.next();
        int harga = 0;

        if (kamar.equals("Padi")) {
            if (hari.equals("Weekday")) {
                harga = 500000;
            } else if (hari.equals("Weekend")) {
                harga = 650000;
            } else {
                harga = 0;
            }
        }
        if (kamar.equals("Jagung")) {
            if (hari.equals("Weekday")) {
                harga = 700000;
            } else if (hari.equals("Weekend")) {
                harga = 900000;
            } else {
                harga = 0;
            }
        }
        System.out.println("Harga kamar " + kamar + " pada " + hari + " = " + harga);
    }
}

