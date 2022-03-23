/** Nim : 13020200237
    Nama : Rahmadani
    Hari, Tanggal : Senin, 21 Maret 2022 
    Waktu : 16:11 */

package tugas2_sourcecode;

public class Operator {
    /* Contoh pengoperasian variabel bertype dasar */
    public static void main(String[] args) {
        boolean Bool1, Bool2,TF, TF1,TF2,TF3,TF4,TF5,TF6 ; int i,j, hsl1, hsl2,hsl3,hsl4,hsl5, hsl6 ;
        float x,y,res1,res2, res3, res4, res5; 
        /* algoritma */
        System.out.println ("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");
        Bool1 = true; Bool2 = false;
        TF1 = ((Bool1 && Bool2)? Bool1:Bool2);/* Boolean AND */
        TF2 = ((Bool1 || Bool2)? Bool1:Bool2) ; /* Boolean OR */
        TF3 = ! Bool1 ; /* NOT */
        TF4 = ((Bool1 ^Bool2)? Bool1:Bool2); /* XOR */
        System.out.println("Hasil Operator AND : " + TF1);
        System.out.println("Hasil Operator OR  : " + TF2);
        System.out.println("Hasil Operator NOT : " + TF3);
        System.out.println("Hasil Operator XOR : " + TF4 );
        /* operasi numerik */
        i = 5; 
        j = 2 ;
        hsl1 = i+j; 
        hsl2 = i - j; 
        hsl3 = i / j; 
        hsl4 = i * j;
        hsl5 = i /j ; /* pembagian bulat */
        hsl6 = i%j ; 
        System.out.println("==============================");
        System.out.println("Hasil Operator i + j : " + hsl1);
        System.out.println("Hasil Operator i - j : " + hsl2);
        System.out.println("Hasil Operator i / j : " + hsl3);
        System.out.println("Hasil Operator i * j : " + hsl4);
        System.out.println("Hasil Operator i /j : " + hsl5);
        System.out.println("Hasil Operator i % j : " + hsl5);
        /* sisa. modulo */
        /* operasi numerik */
        System.out.println("==============================");
        x = 5 ; y = 5 ;
        res1 = x + y; res2 = x - y; res3 = x / y; res4 = x * y;
        System.out.println("Hasil Operasi x + y : " + res1);
        System.out.println("Hasil Operasi x - y : " + res2);
        System.out.println("Hasil Operasi x / y : " + res3);
        System.out.println("Hasil Operasi x * y : " + res4);
        System.out.println("==============================");
        /* operasi relasional numerik */
        TF1 = (i==j); TF2 = (i!=j);
        TF3 = (i < j); TF4 = (i > j); TF5 = (i <= j); TF6 = (i >= j);
        System.out.println("Hasil Operator i==j : " + TF1);
        System.out.println("Hasil Operator i!=j : " + TF2);
        System.out.println("Hasil Operator i<j  : " + TF3);
        System.out.println("Hasil Operator i>j  : " + TF4);
        System.out.println("Hasil Operator i<=j : " + TF5 );
        System.out.println("Hasil Operator i<=j : " + TF6);
        System.out.println("==============================");
        /* operasi relasional numerik */
        TF1 = (x != y);
        TF2 = (x < y); TF3 = (x > y); TF4 = (x <= y); TF5 = (x >= y); 
        System.out.println("Hasil Operator x!=y : " + TF1);
        System.out.println("Hasil Operator x<y  : " + TF2);
        System.out.println("Hasil Operator x>y  : " + TF3);
        System.out.println("Hasil Operator x<=y : " + TF4);
        System.out.println("Hasil Operator x>=y : " + TF5);
    }
}


