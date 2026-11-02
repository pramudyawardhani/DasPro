import java.util.Scanner;

public class MenghitungTotalBayar {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            double harga, potongan, jumlahBayar, diskon = 0.15;

            System.out.print("Masukkan harga barang: Rp.  ");
            harga = sc.nextDouble();

            potongan = harga * diskon;
            jumlahBayar = harga - potongan;

            System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jumlahBayar);
        sc.close();
        }
}
