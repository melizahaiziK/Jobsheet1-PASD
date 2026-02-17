import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char [] Plat = {'A','B','D','E','F','G','H','L','N','T'};
        char [][] namaKota = {
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
        };
        System.out.print("Masukkan Kode Plat : ");
        char input = sc.next().charAt(0);
        
        boolean ditemukan = false;
        for (int i = 0; i < Plat.length; i++){
            if (input == Plat[i]) {
                System.out.println("Kota : " + String.valueOf(namaKota[i]));
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("kode tidak ditemukan");
        }
    }
}
