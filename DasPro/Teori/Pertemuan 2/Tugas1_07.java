import java.util.Scanner;

public class Tugas1_07{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

    double gajiPokok;
    double tunjanganAnak;
    int jumlahAnak;
    double persentasePotonganPensiun = 0.10;

    System.out.print("Masukkan gaji pokok: ");
    gajiPokok = sc.nextDouble();

    System.out.print("Masukkan tunjangan anak: ");
    tunjanganAnak = sc.nextDouble();

    System.out.print("Masukkan jumlah anak: ");
    jumlahAnak = sc.nextInt();

    double totalTunjanganAnak = tunjanganAnak * jumlahAnak;
    double potonganPensiun = gajiPokok * persentasePotonganPensiun;
    double gajiBersih = gajiPokok + totalTunjanganAnak - potonganPensiun;

    System.out.println("Gaji bersih yang diterima = " + gajiBersih);
    }
}
