package Project.JobSheet05;

import java.util.Scanner;

public class nestedUjianSkripsi07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan, bebasKompen;
        int bimbinganP1, bimbinganP2;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        bebasKompen = sc.nextLine().trim();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahsiswa boleh mendaftar ujian skripsi.";
            }   else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurangbdari 4 kali.";        
            }   else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali.";
            }   else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali.";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen.";
        }

        System.out.print(pesan);

        sc.close();
    }
}


