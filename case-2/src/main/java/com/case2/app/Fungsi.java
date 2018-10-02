package com.case2.app;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Fungsi {

    public static ArrayList<ArrayList<String>> getParkiran() {
        ArrayList<String> motor = new ArrayList<String>();
        motor.add("motor");
        motor.add("mobil");
        motor.add("bus");

        ArrayList<String> mobil = new ArrayList<String>();
        mobil.add("mobil");
        mobil.add("bus");

        ArrayList<String> bus = new ArrayList<String>();
        bus.add("bus");

        ArrayList<ArrayList<String>> parkiran = new ArrayList();
        parkiran.add(mobil);
        parkiran.add(motor);
        parkiran.add(bus);
        return parkiran;
    }
}
