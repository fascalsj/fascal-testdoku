package com.case2.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.print("Jenis Kendaraan : ");
        String jenisKendaraan = new Scanner(System.in).next();
        HashMap<String, String[]> listParkiran = Fungsi.getParkiran();
        String [] kendaraan = listParkiran.get(jenisKendaraan);
        System.out.println("Lot Parkir yang diperbolehkan : ");
        for (String kendaraan1 : kendaraan) {
            System.out.println("   - Lot Parkir "+kendaraan1);
        }
        
        
 
        
    }
}
