package com.case1.app;

public class Fungsi 
{
    public static int cariDiskon(String kodePromo) {
        int diskon = 0;
        if(!"New Year".equals(kodePromo))
            if("Lebaran".equals(kodePromo))
            {
                diskon = 10;
            }
            else if("Harbolnas".equals(kodePromo))
            {
                diskon = 20;
            }
        else {
                diskon = 5;
        }
        return diskon;
     }
    
    public static int nilaiPotong(int diskon, int amount) {
       
        int hargaPotong = (diskon * amount)/ 100;
        int potonganHarga = amount - hargaPotong;
        return potonganHarga;
     }
}