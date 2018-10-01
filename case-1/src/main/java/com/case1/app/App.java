package com.case1.app;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print("Amount : ");
        String number = new Scanner(System.in).next();
        int nilai = Integer.parseInt(number);	
        System.out.print("Kode Promo : ");
        String kodePromo = new Scanner(System.in).next();
        int diskon = Fungsi.cariDiskon(kodePromo);
        int hargaPotong = Fungsi.nilaiPotong(diskon, nilai);
        System.out.println("Diskon : "+diskon);
        System.out.println("Amount yang harus dibayar : "+hargaPotong);
    }
}
