package Project.JobSheet04;
import java.util.Scanner;

public class TugasParkir07 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int lamaParkir, tarifParkir;
    System.out.print("Masukkan lama parkir (jam): ");
    lamaParkir = sc.nextInt();

    if (lamaParkir <= 2) {
        tarifParkir = 2000;
    } else {
        tarifParkir = 2000 + (lamaParkir - 2) * 1000;
        
    }
    System.out.println("Tarif parkir: " + tarifParkir);
    sc.close();
    }
}
