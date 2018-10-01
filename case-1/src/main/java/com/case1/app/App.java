package com.case1.app;
import com.case1.app.Fungsi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int diskon = Fungsi.cariDiskon("Lebaran");
        int hargaPotong = Fungsi.nilaiPotong(diskon, 1000000);
        System.out.println(hargaPotong);
    }
}
