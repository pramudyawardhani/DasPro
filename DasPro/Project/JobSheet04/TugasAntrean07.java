package Project.JobSheet04;
import java.util.Scanner;

public class TugasAntrean07 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int kode;

    System.out.print("Masukkan kode layanan: ");
    kode = sc.nextInt();

    switch (kode) {
        case 1:
            System.out.println ("Layanan = Legalizir Ijazah");
            System.out.println ("Loket = Loket A");
            break;
        case 2:
            System.out.println("Layanan = Surat Keterangan AKtif Kuliah");
            System.out.println ("Loket = Loket B");
            break;
        case 3:
            System.out.println("Layanan = Pembayaran UKT");
            System.out.println ("Loket = Loket C");
            break;
        case 4:
            System.out.println("Layanan = Pengajuan Cuti Akademik");
            System.out.println ("Loket = Loket D");
            break;
        default:
            System.out.println("Kode layanan tidak tersedia");
        }

        sc.close();
    }
}
