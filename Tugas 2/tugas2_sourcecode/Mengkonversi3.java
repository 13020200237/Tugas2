/** Nim : 13020200237
    Nama : Rahmadani
    Hari, Tanggal : Selasa, 22 Maret 2022 
    Waktu : 10:35*/

package tugas2_sourcecode;

import java.util.Scanner;

public class Mengkonversi3 {
    public static void main(String [] args){
		Scanner masukan = new Scanner(System.in);
                long totalMilisec = System.currentTimeMillis();
                
		
		long jam1, menit, detik, konversi,totaljam, local;

		System.out.print("Masukkan Detik yang ingin Dikonversi : ");
		konversi = masukan.nextInt();

		jam1 = konversi/3600;
		menit = (konversi %3600)/60;
		detik = (konversi%3600)%60;
                totaljam = (konversi/3600)% 24;
                
                long totalSec = totalMilisec / 1000;
                //hitung jumlah detik sekarang
                long scd = totalSec % 60;
                //Hitung Menit Sekarang
                long totalMenit = totalSec / 60;
                long mnt = totalMenit % 60;
                //Hitung Jam Sekarang
                long totalJam1 = totalMenit / 60;
                long hour = (totalJam1 % 24)+7;//jam ditambah 7 karena waktu lokal indonesia
               
                //Hasil
		System.out.println("konversi dari : "+ konversi + " detik, adalah : ");
		System.out.println(jam1 + " Jam : " + menit + " Menit : " + detik + " Detik");
                System.out.println(totaljam + " Jam Saat Ini");
                System.out.println("Waktu menunjukan " + hour + ":" + mnt + ":" + scd + " Waktu lokal");
 
	}
}
