import java.util.Scanner;
public class DeretBilangan {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Silahkan masukkan NIM anda : ");
    long nim = sc.nextLong();

    int n = (int)(nim % 100);
    if (n < 10) {
        n += 10;
    }
    System.out.println("nilai n = " + n);
    System.out.print("output : ");

    for (int i = 1; i <= n; i++ ) {
        if (i == 10 || i == 15){
            continue;
        }
        if (i % 3 == 0) {
            System.out.print("# ");
        } else if (i % 2 == 0) {
            System.out.print(i + " ");
        } else {
            System.out.print("* ");
        }
    }
    }
}
