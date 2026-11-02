import java.util.Scanner;

public class Latihan02_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hari, jenis;
        int jumlah;
        double harga, persen, subtotal, diskon, total;
        boolean kamus, novel;

        System.out.print("Hari: ");
        hari = sc.next().toLowerCase();
        System.out.print("Jenis buku: ");
        jenis = sc.next().toLowerCase();
        System.out.print("Jumlah buku: ");
        jumlah = sc.nextInt();
        System.out.print("Harga per buku: ");
        harga = sc.nextDouble();

        kamus = jenis.equals("kamus");
        novel = jenis.equals("novel");

           if (kamus && jumlah > 2) {
                persen = 12;            // 10% + 2%
            } else if (kamus && jumlah <= 2) {
                persen = 10;
            } else if (novel && jumlah > 3) {
                persen = 9;             // 7% + 2%
            } else if (novel && jumlah <= 3) {
                persen = 8;             // 7% + 1%
            } else if (!kamus && !novel && jumlah > 3) {
                persen = 5;             
            }
            else {
            persen = 0;
        }

        subtotal = harga * jumlah;
        diskon = subtotal * persen / 100;
        total = subtotal - diskon;

        System.out.println("Diskon      : " + persen + "% (Rp " + diskon + ")");
        System.out.println("Total bayar : Rp " + total);

        sc.close();
    }
}