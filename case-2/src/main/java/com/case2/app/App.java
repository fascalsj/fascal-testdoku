package com.case2.app;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        String kendaraan = "mobil";
        ArrayList<ArrayList<String>> listParkiran = Fungsi.getParkiran();
        for (ArrayList<String> listParkiran1 : listParkiran) {
            System.out.println(listParkiran1);
        }
        
    }
}
