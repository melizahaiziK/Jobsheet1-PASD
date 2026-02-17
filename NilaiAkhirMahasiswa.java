import java.util.Scanner;
public class NilaiAkhirMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program menghitung nilai akhir");
        System.out.println("=======================");
        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = sc.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int nilaiKuis = sc.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int nilaiUts = sc.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int nilaiUas = sc.nextInt();
        System.out.println("=======================");
        System.out.println("=======================");

        if (nilaiKuis < 0 || nilaiKuis > 100) {
        System.out.println("Nilai tidak valid!");
        } else if (nilaiTugas < 0 || nilaiTugas > 100) {
        System.out.println("Nilai tidak valid!");
        } else if (nilaiUas < 0 || nilaiUas > 100) {
        System.out.println("Nilai tidak valid!");
        } else if (nilaiUts < 0 || nilaiUts > 100) {
        System.out.println("Nilai tidak valid!");
        } else {
            double nilaiAkhir = (nilaiTugas * 0.20) + (nilaiKuis * 0.20) + (nilaiUas * 0.30) + (nilaiUts * 0.30);
            int Nilaiangka1 = (int) nilaiAkhir;

        
            String pesan = " ";
            if (Nilaiangka1 >= 80 && Nilaiangka1 <= 100) {
            pesan = "A";
            } else if (Nilaiangka1 > 73 && Nilaiangka1 >= 80) {
            pesan = "B+";
            } else if (Nilaiangka1 > 65 && Nilaiangka1 >= 73) {
            pesan = "B";
            } else if (Nilaiangka1 > 60 && Nilaiangka1 >= 65) {
            pesan = "C+";
            } else if (Nilaiangka1 > 50 && Nilaiangka1 >= 60) {
            pesan = "C";
            } else if (Nilaiangka1 > 39 && Nilaiangka1 >= 50) {
            pesan = "D";
            } else if (Nilaiangka1 > 39) {
            pesan = "E";
            }

            System.out.println("Nilai akhir : " + nilaiAkhir);
            System.out.println("Nilai huruf : " + pesan);
            System.out.println("=======================");
            System.out.println("=======================");
        
        String semester = " ";
        if (nilaiAkhir >= 60 && nilaiAkhir <= 100) {
            semester = "SELAMAT ANDA LULUS";
        } else {
            semester = "MAAF ANDA TIDAK LULUS!";
        }

        System.out.println(semester);
        }
    }
}
