package com.tutorial;

/**
 * Dinda Tri Rahmasari
 * A2.1900052
 * TI-1A
 */
public class Main {

    public static void main (String[] args){


//        while (kondisi) {
//            aksi
//        }

        int a = 0;
        boolean kondisi = true;

        System.out.println("awal program");

        while (kondisi) {
            System.out.println("while loop ke-" + a);

            if (a == 10){
                kondisi = false;
            }

            a++;
        }

        System.out.println("akhir program");

    }
}
