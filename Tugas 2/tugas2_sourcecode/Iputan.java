/**
 *
 * @author mifta
 */
import java.io.*;

public class Iputan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Berapa Harga Barang :");
        int a = Integer.parseInt(dataIn.readLine());
        System.out.print("Berapa Jumlah Barang yang diambil:");
        int b = Integer.parseInt(dataIn.readLine());
        int total =(a*b);

        System.out.println("Harga barang = Rp "+a);
        System.out.println("Jmlah barang = "+b);

        System.out.println("Total harga sebelum diskon =Rp"+total);
        if(total>10000 & total<=100000)
        {
            System.out.print("Total harga yang harus dibayar (setelah diskon) =Rp ");
            System.out.println(total-(total * 0));
        }
        else if(total>100000 & total<=500000)
        {
            System.out.print("Total harga yang harus dibayar (setelah diskon) =Rp ");
            System.out.println(total-(total * 0.05));
        }
        else if(total>500000 & total<=1000000)
        {
            System.out.print("Total harga yang harus dibayar (setelah diskon) =Rp ");
            System.out.println(total-(total * 0.1));
        }
        else
        {
            System.out.print("Total harga yang harus dibayar (setelah diskon) =Rp ");
            System.out.println(total-(total * 0.15));
        }
    }
}
