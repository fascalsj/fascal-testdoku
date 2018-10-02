package com.case2.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        String kendaraan = "mobil";
        HashMap<String, String[]> listParkiran = Fungsi.getParkiran();
        System.err.println(listParkiran);
        String [] mobil = listParkiran.get(kendaraan);
        System.out.println(Arrays.toString(mobil));
 
        
    }
}
