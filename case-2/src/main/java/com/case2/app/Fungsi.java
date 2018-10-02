package com.case2.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class Fungsi {

    public static HashMap<String, String[]> getParkiran() {
        
        String [] motor = {"motor,mobil,bus"};
        String [] mobil = {"mobil,bus"};
        String [] bus = {"bus"};
        HashMap<String, String[]> parkiran = new HashMap<String, String[]>();
        parkiran.put("motor",motor);
        parkiran.put("mobil",mobil);
        parkiran.put("bus",bus);
        return parkiran;

        
//        ArrayList<String> motor = new ArrayList<String>();
//        motor.add("motor");
//        motor.add("mobil");
//        motor.add("bus");
//        
//        ArrayList<String> mobil = new ArrayList<String>();
//        mobil.add("mobil");
//        mobil.add("bus");
//
//        ArrayList<String> bus = new ArrayList<String>();
//        bus.add("bus");
//
//        ArrayList<ArrayList<String>> parkiran = new ArrayList();
//        parkiran.add(mobil);
//        parkiran.add(motor);
//        parkiran.add(bus);
//        return parkiran;
    }
}
