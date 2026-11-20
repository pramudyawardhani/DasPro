import java.util.Scanner;

public class ModifikasiContoh2_07 {
    public static void main(String[] args) {
        // Data nama kota
        String[] kota = {"Tokyo", "Osaka", "Sapporo", "Fukuoka", "Naha"};
        
        // Array 2 dimensi untuk menyimpan suhu: 5 baris (kota), 7 kolom (hari)
        double[][] suhu = new double[5][7];
        
        Scanner sc = new Scanner(System.in);

        // 1. Memasukkan data suhu dari user
        System.out.println("=== MASUKKAN DATA SUHU ===");
        for (int i = 0; i < suhu.length; i++) {
            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print(kota[i] + " hari ke-" + (j + 1) + ": ");
                suhu[i][j] = sc.nextDouble();
            }
        }

        // 2. Inisialisasi variabel pencarian suhu minimum dan maksimum
        double suhuMin = suhu[0][0];
        double suhuMax = suhu[0][0];
        
        int kotaMin = 0;
        int hariMin = 0;
        
        int kotaMax = 0;
        int hariMax = 0;

        // 3. Proses pencarian suhu terendah dan tertinggi
        for (int i = 0; i < suhu.length; i++) {
            for (int j = 0; j < suhu[i].length; j++) {
                if (suhu[i][j] < suhuMin) {
                    suhuMin = suhu[i][j];
                    kotaMin = i;
                    hariMin = j;
                }
                
                if (suhu[i][j] > suhuMax) {
                    suhuMax = suhu[i][j];
                    kotaMax = i;
                    hariMax = j;
                }
            }
        }

        // 4. Menampilkan hasil dalam bentuk tabel menggunakan printf
        System.out.println("\n========================================================");
        System.out.printf("%-15s | %-15s | %-15s\n", "Keterangan", "Suhu", "Lokasi & Waktu");
        System.out.println("========================================================");
        
        System.out.printf("%-15s | %-15.2f | Kota %-10s (Hari ke-%d)\n", 
                "Suhu Terendah", suhuMin, kota[kotaMin], (hariMin + 1));
        
        System.out.printf("%-15s | %-15.2f | Kota %-10s (Hari ke-%d)\n", 
                "Suhu Tertinggi", suhuMax, kota[kotaMax], (hariMax + 1));
                
        System.out.println("========================================================");

        sc.close();
    }
}