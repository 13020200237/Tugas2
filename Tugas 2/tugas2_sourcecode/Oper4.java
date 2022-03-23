/** Nim : 13020200237
    Nama : Rahmadani
    Hari, Tanggal : Sabtu, 20 Maret 2022 
    Waktu : 20:02
    */
package tugas2_sourcecode;

/* Operator terner */
    public class Oper4 {
        public static void main(String[] args) {
        int i = 0; /* perhatikan int i,j=0 bukan seperti ini */
        int j = 0;
        char c = 8; char d = 10;
        int e = (((int)c > (int)d) ? c: d); 
        int k = ((i>j) ? i: j);
        /* ALGORITMA */
        System.out.print ("Nilai e = "+ e); 
        System.out.print ("\nNilai k = "+ k); 
        i = 2;
        j = 3;
        k = ((i++>j++) ? i: j) ;
        System.out.print ("\nNilai k = "+ k); 
    }
}
