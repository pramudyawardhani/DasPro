import java.util.Scanner;
 
public class Latihan01_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalJam = 0, jam;
        int hari = 1;
 
        while (hari <= 7) {
            System.out.print("Masukkan jam belajar hari ke-" + hari + ": ");
            jam = sc.nextDouble();
 
            if (jam > 10) {
                System.out.println("Input tidak mungkin (> 10 jam), ulangi input!");
                continue;   // abaikan input, hari tidak bertambah, kembali cek kondisi
            }
 
            totalJam += jam;
            hari++;
        }
 
        System.out.println("Total jam belajar selama seminggu: " + totalJam + " jam");
        sc.close();
    }
}