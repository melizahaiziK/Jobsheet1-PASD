import java.util.Scanner;
public class Tugas2 {
    static Scanner sc = new Scanner(System.in);

    static void inputJadwal (String [][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Jadwal ke - " + (i+1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal [i][0] = sc.nextLine();
            
            System.out.print("Ruangan          : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari             : ");
            jadwal [i][2] = sc.nextLine();

            System.out.print("Jam              : ");
            jadwal [i][3] = sc.nextLine();

            System.out.println();
        }
    }

    static void tampilJadwal (String [][] jadwal, int n) {
        System.out.println("\nTAMPIL JADWAL KULIAH");
        System.out.printf("%-3s %-20s %-10s %-10s %-5s%n",
            "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
    
            for (int i = 0; i < n; i++) {
                System.out.printf("%-3d %-20s %-10s %-10s %-5s%n", 
            (i+1),
            jadwal[i][0],  
            jadwal[i][1],  
            jadwal[i][2],  
            jadwal[i][3]);

            System.out.println();
        }
    }

    static void berdasarkanHarian (String [][] jadwal, int n ){
        System.out.print("Masukkan hari yang ingin dicari : ");
        String cariHari = sc.nextLine();

        System.out.println("Jadwal pada hari " + cariHari + " adalah :");
        System.out.printf("%-20s %-10s %-10s%n", "Mata Kuliah", "Ruang", "Jam");
        for (int i = 0; i < n; i++) {
            if (jadwal [i][2].equalsIgnoreCase(cariHari)) {
            System.out.printf("%-20s %-10s %-10s%n",
                                   jadwal[i][0],  
                                   jadwal[i][1],
                                   jadwal[i][3]);
            }
        }
        System.out.println();
    }
    

    static void berdasarkanMatkul (String [][] jadwal, int n ) {
        System.out.print("Masukkan matkul yan ingin dicari : " );
        String cariMatkul = sc.nextLine();

        System.out.println("Jadwal untuk mata kuliah " + cariMatkul + " adalah :");
        System.out.printf("%-10s %-10s %-10s%n", "Hari", "Ruang", "Jam");
        for (int i = 0; i < n; i++) {
            if (jadwal [i][0].equalsIgnoreCase(cariMatkul)) {
                System.out.printf("%-10s %-10s %-10s%n",
                                   jadwal[i][2],
                                   jadwal[i][1],
                                   jadwal[i][3]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][]jadwal = new String[n][4];
        
        inputJadwal(jadwal, n);

        tampilJadwal(jadwal, n);
        berdasarkanHarian(jadwal, n);
        berdasarkanMatkul(jadwal, n);
    }
}
