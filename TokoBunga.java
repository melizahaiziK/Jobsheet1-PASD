import java.util.Scanner;
public class TokoBunga {
    static int[] harga = {75000,50000,60000,10000};

    static int [][] stok = { 
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
    public static void main(String[] args) {
        for (int i = 0; i < stok.length; i++){
            int pendapatan = HitungPendapatan(i);

            System.out.println("Royal Garden " + (i+1));
            System.out.println("Pendapatan Rp : " + pendapatan);

            if (pendapatan > 1500000) {
                System.out.println("Status : Sangat Baik");
            } else {
                System.out.println("Status : Perlu Evaluasi");
            }
            System.out.println();

        }
    }
    public static int HitungPendapatan(int cabang) {
    int total = 0;

        for (int i = 0; i < harga.length; i++) {
            total += stok[cabang][i] * harga[i];
        }
        return total;
    }
    
}
