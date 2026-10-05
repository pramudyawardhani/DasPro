import java.util.Scanner;

public class Latihan00_07 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int suhu;
    char hujan;

    System.out.print("Masukkan suhu: ");
    suhu = sc.nextInt();
    System.out.print("Apakah sedang hujan? (Y/T): ");
    hujan = sc.next().charAt(0); 

    if (suhu > 27) {
            System.out.println("Memakai dress");
            if (hujan == 'y' || hujan == 'Y') {
                System.out.println("Membawa payung");
            } else {
                System.out.println("Memakai sunscreen");
            }
        } else {
            System.out.println("Memakai celana panjang");
        }

        sc.close();
    }
}
