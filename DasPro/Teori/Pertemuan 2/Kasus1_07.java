import java.util.Scanner;

public class Kasus1_07 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    int panjang, lebar, keliling;

    panjang = input.nextInt();
    lebar = input.nextInt();    

    keliling = 2 * (panjang + lebar);   

    System.out.println("Keliling persegi panjang = " + keliling);
}
}