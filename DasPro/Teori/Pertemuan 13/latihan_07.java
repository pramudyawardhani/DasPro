import java.util.Scanner;

public class latihan_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi dan instansiasi
        int[][] survei = new int[10][6];
        int total;
        int totalSemua = 0;
        double rata;

        // a. Input hasil survei
        System.out.println("=== INPUT HASIL SURVEI ===");

        for (int i = 0; i < survei.length; i++) {
            for (int j = 0; j < survei[i].length; j++) {

                do {
                    System.out.print("Responden " + (i + 1)
                            + ", pertanyaan " + (j + 1) + ": ");

                    survei[i][j] = sc.nextInt();

                    if (survei[i][j] < 1 || survei[i][j] > 5) {
                        System.out.println("Error! Nilai harus 1-5.");
                    }

                } while (survei[i][j] < 1 || survei[i][j] > 5);
            }
        }

        // Menghitung total seluruh nilai
        for (int i = 0; i < survei.length; i++) {
            for (int j = 0; j < survei[i].length; j++) {
                totalSemua += survei[i][j];
            }
        }

        // Menampilkan judul tabel
        System.out.println("\n=== TABEL HASIL SURVEI ===");

        System.out.print("Responden\t");

        for (int j = 0; j < survei[0].length; j++) {
            System.out.print("P" + (j + 1) + "\t");
        }

        System.out.println("Total\tRata-rata");

        // b. Rata-rata setiap responden
        for (int i = 0; i < survei.length; i++) {
            total = 0;

            System.out.print("Responden " + (i + 1) + "\t");

            for (int j = 0; j < survei[i].length; j++) {
                System.out.print(survei[i][j] + "\t");
                total += survei[i][j];
            }

            rata = (double) total / survei[i].length;

            System.out.println(total + "\t" + rata);
        }

        // c. Rata-rata setiap pertanyaan
        System.out.print("Rata-rata\t");

        for (int j = 0; j < survei[0].length; j++) {
            total = 0;

            for (int i = 0; i < survei.length; i++) {
                total += survei[i][j];
            }

            rata = (double) total / survei.length;

            System.out.print(rata + "\t");
        }

        System.out.println();

        // d. Rata-rata keseluruhan
        rata = (double) totalSemua /
                (survei.length * survei[0].length);

        System.out.println("\nRata-rata keseluruhan: " + rata);

        sc.close();
    }
}