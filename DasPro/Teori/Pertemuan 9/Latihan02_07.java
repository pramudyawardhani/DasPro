import java.util.Scanner;
 
public class Latihan02_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jamKerja;
        double gajiHarian, bonus;
 
        do {
            System.out.print("Masukkan jam kerja: ");
            jamKerja = sc.nextInt();
 
            if (jamKerja < 0) {
                break; 
            }
 
            System.out.print("Masukkan gaji harian: ");
            gajiHarian = sc.nextDouble();
 
            if (jamKerja > 8) {
                bonus = 0.2 * gajiHarian;
            } else {
                bonus = 0;
            }
            System.out.println("Bonus pegawai: " + bonus);
        } while (jamKerja >= 0);
 
        System.out.println("Program selesai.");
        sc.close();
    }
}