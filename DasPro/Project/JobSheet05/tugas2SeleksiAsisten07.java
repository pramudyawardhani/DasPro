package Project.JobSheet05;

import java.util.Scanner;

public class tugas2SeleksiAsisten07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif, sedangDisanksi, punyaSertifikat;
        double nilaiDasarPemrograman, nilaiWawancara;

        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();

        System.out.print("Apakah mahasiswa sedang mendapatkan sanksi akademik? (true/false): ");
        sedangDisanksi = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {

            System.out.print("Masukkan nilai mata kuliah Dasar Pemrograman: ");
            nilaiDasarPemrograman = sc.nextDouble();

            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
            punyaSertifikat = sc.nextBoolean();

            if (nilaiDasarPemrograman >= 80 || punyaSertifikat) {
                System.out.println("\n-> Selamat! Anda lolos ke tahap wawancara.");

                System.out.print("Masukkan nilai wawancara: ");
                nilaiWawancara = sc.nextDouble();

                if (nilaiWawancara >= 75) {
                    System.out.println("Selamat! Anda Diterima sebagai Asisten Praktikum.");
                } else {
                    System.out.println("Gagal! Nilai wawancara kurang dari 75.");
                }

            } else {
                System.out.println("Gagal! Nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi.");
            }

        } else {
            System.out.println("Gagal! Status mahasiswa tidak aktif atau sedang mendapatkan sanksi akademik.");
        }

        sc.close();
    }
}
