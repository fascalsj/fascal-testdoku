package com.case1.app;

/**
 * Hello world!
 *
 */
public class Fungsi 
{
    public static int cariDiskon(String kodePromo) {
        int diskon = 0;
        if("New Year".equals(kodePromo))
        {
            diskon = 5;
        }
        else if("Lebaran".equals(kodePromo))
        {
            diskon = 10;
        }
        else if("Harbolnas".equals(kodePromo))
        {
            diskon = 20;
        }
        return diskon;
     }
    
    public static int nilaiPotong(int diskon, int amount) {
       
        int hargaPotong = (diskon * amount)/ 100;
        int potonganHarga = amount - hargaPotong;
        return potonganHarga;
     }
}