import java.util.Scanner;

public class GajiKaryawan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiPokok;
        double bonus, totalGaji;
        double tunjanganTransport = 600000;
        double tunjanganMakan = 400000;

        System.out.print("Masukkan gaji pokok karyawan: Rp. ");
        gajiPokok = sc.nextInt();

        bonus = 0.5*gajiPokok;
        totalGaji = gajiPokok + tunjanganTransport + tunjanganMakan + bonus - (0.1*gajiPokok);
        
        System.out.println("Bonus bulanan anda adalah Rp. " + bonus);
        System.out.println("Gaji yang anda terima adalah Rp. " + (int) totalGaji);
        sc.close();
    }
}
