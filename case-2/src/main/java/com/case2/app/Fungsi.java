package com.case2.app;

import java.util.HashMap;

public class Fungsi {

    public static HashMap<String, String[]> getParkiran() {
        
        String [] motor = {"motor","mobil","bus"};
        String [] mobil = {"mobil","bus"};
        String [] bus = {"bus"};
        HashMap<String, String[]> parkiran = new HashMap<String, String[]>();
        parkiran.put("motor",motor);
        parkiran.put("mobil",mobil);
        parkiran.put("bus",bus);
        return parkiran;
    }
}
