public class ModifikasiContoh1_07 {
    public static void main(String[] args) {
        // Data penjualan: 
        // Baris 0 = Dieng, Baris 1 = Soehat, Baris 2 = Sengkaling
        // Kolom 0 = Novel, Kolom 1 = Komik, Kolom 2 = Ensiklopedia
        int[][] penjualan = {
            {2, 8, 6},    // Dieng
            {7, 3, 6},    // Soehat
            {4, 6, 5}     // Sengkaling
        };

        String[] namaCabang = {"Dieng", "Soehat", "Sengkaling"};
        String[] namaKategori = {"Novel", "Komik", "Ensiklopedia"};
        
        int[] totalPerKategori = new int[3];
        int grandTotal = 0;

        // Header Tabel menggunakan printf
        System.out.println("==================================================================");
        System.out.printf("%-12s | %-8s | %-8s | %-14s | %-8s\n", 
                "Cabang", namaKategori[0], namaKategori[1], namaKategori[2], "Total");
        System.out.println("==================================================================");

        // Menampilkan baris data dan menghitung total per cabang
        for (int i = 0; i < penjualan.length; i++) {
            int totalCabang = 0;
            System.out.printf("%-12s | ", namaCabang[i]);
            
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf("%-8d | ", penjualan[i][j]);
                
                totalCabang += penjualan[i][j];          // Hitung total per baris
                totalPerKategori[j] += penjualan[i][j];  // Hitung total per kolom
            }
            
            System.out.printf("%-8d\n", totalCabang);
            grandTotal += totalCabang;
        }

        System.out.println("==================================================================");
        
        // Menampilkan baris total per kategori di bagian bawah
        System.out.printf("%-12s | ", "Total");
        for (int j = 0; j < totalPerKategori.length; j++) {
            System.out.printf("%-8d | ", totalPerKategori[j]);
        }
        
        // Menampilkan grand total di pojok kanan bawah
        System.out.printf("%-8d\n", grandTotal);
        System.out.println("==================================================================");
    }
}