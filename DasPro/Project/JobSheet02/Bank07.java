import java.util.Scanner;
public class Bank07 {
    public static void main(String[] args) {

        int jumlah_tabungan_awal, lama_menabung;
        double persentase_bunga = 0.02, jumlah_bunga, jumlah_tabungan_akhir;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah tabungan awal anda\t = ");
        jumlah_tabungan_awal = sc.nextInt();
        System.out.print("Masukkan lama menabung\t\t\t = ");
        lama_menabung = sc.nextInt();

        jumlah_bunga = jumlah_tabungan_awal * persentase_bunga * lama_menabung;
        jumlah_tabungan_akhir = jumlah_tabungan_awal + jumlah_bunga;

        System.out.println("Jumlah bunga \t\t\t\t = " + jumlah_bunga);
        System.out.println("Jumlah tabungan akhir \t\t\t = " + jumlah_tabungan_akhir);
    }
}
