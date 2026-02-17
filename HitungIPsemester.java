import java.util.Scanner;
public class HitungIPsemester {
    static Scanner sc = new Scanner(System.in);

    static void inputData(String []namaMatkul, int [] sks) {
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.println("Mata kuliah ke- " + (i+1));
            System.out.print("Nama Matkul : ");
            namaMatkul[i] = sc.nextLine();

            System.out.print("Bobot sks : ");
            sks[i] = sc.nextInt();
            sc.nextLine();

        }
    }

    static void inputNilai (String [] namaMatkul, int [] nilaiAngka) {
        System.out.println("=========================");
        System.out.println("PROGRAM MENGHITUNG IP SEMESTER");
        System.out.println("=========================");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("masukkan nilai angka untuk matkul " + namaMatkul[i] + ": ");
            nilaiAngka[i] = sc.nextInt();
        }
    }

    static void konversiNilai (int [] nilaiAngka, String [] nilaiHuruf, double [] nilaiSetara){
        for (int i = 0; i < nilaiAngka.length; i++) {

            if (nilaiAngka[i] >= 80 && nilaiAngka[i] <=100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] >= 73 && nilaiAngka[i] <=80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] >= 65 && nilaiAngka[i] <=73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] >= 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] >= 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] >= 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }
        }
    }

    static double hitungIP (int [] sks, double [] nilaiSetara) {
        double totalbobotNilai = 0;
        int totalSks = 0;

        for (int i = 0; i < sks.length; i++) {
            totalbobotNilai += nilaiSetara[i] * sks[i];
            totalSks += sks[i];
        }
        return totalbobotNilai / totalSks ;
    }

    static void tampilHasil (String [] namaMatkul, int [] nilaiAngka, String [] nilaiHuruf,
                             double [] nilaiSetara, double ipk) {
        System.out.println("=========================");
        System.out.println("HASIL KONVERSI NILAI");
        System.out.println("=========================");
        System.out.printf("%-20s %-15s %-15s %-15s\n",
        "Nama Matkul","Nilai Angka","Nilai Huruf","Nilai Setara");

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.printf("%-20s %-15s %-15s %-15.2f\n",
                              namaMatkul[i],
                              nilaiAngka[i],
                              nilaiHuruf[i], 
                              nilaiSetara[i]);
        }
        System.out.printf("\nIP Semester: %.2f\n", ipk);
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String [] namaMatkul = new String[jumlah];
        int [] sks = new int[jumlah];
        int [] nilaiAngka = new int[jumlah];
        String [] nilaiHuruf = new String[jumlah];
        double [] nilaiSetara = new double[jumlah];

        inputData(namaMatkul, sks);
        inputNilai(namaMatkul, nilaiAngka);
        konversiNilai(nilaiAngka, nilaiHuruf, nilaiSetara);
        double ipk = hitungIP(sks, nilaiSetara);
        tampilHasil(namaMatkul, nilaiAngka, nilaiHuruf, nilaiSetara, ipk);

    }
}
