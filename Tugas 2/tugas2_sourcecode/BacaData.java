/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_sourcecode;
/** Nim : 13020200237
    Nama : Rahmadani
    Hari, Tanggal : Sabtu, 12 Maret 2022 */

import java.util.Scanner;
/* contoh membaca integer menggunakan Class Scanner*/

public class BacaData {
    public static void main(String[] args) {
        int a;
        Scanner masukan;
        /* Program */
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); ; 
        Apa akibatnya ?*/
        System.out.println ("Nilai yang dibaca : "+ a);
    }
}

