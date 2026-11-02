package JobSheet07;
import java.util.Scanner;
public class Tugas1Bioskop07 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    int hargaTiket = 50000, totalTiket = 0, jumlahTiket;
    double totalPenjualan = 0, diskon = 0, hargaDiskon, hargaNormal, bayar;
 
    do {
    System.out.print("Masukkan jumlah tiket: ");
    jumlahTiket = sc.nextInt();
 
        if (jumlahTiket < 0) {
        System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
        continue;
        }
 
        if (jumlahTiket > 0) {
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
                }
 
                hargaNormal = jumlahTiket * hargaTiket;
                hargaDiskon = hargaNormal * diskon;
                bayar = hargaNormal - hargaDiskon;
 
                System.out.println("Harga normal : Rp " + hargaNormal);
                System.out.println("Diskon       : Rp " + hargaDiskon);
                System.out.println("Total bayar  : Rp " + bayar);
 
                totalTiket += jumlahTiket;
                totalPenjualan += bayar;
            }
        } while (jumlahTiket != 0);
 
        System.out.println("----- Rekap Penjualan Tiket -----");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp " + totalPenjualan);

        sc.close();
    }
}