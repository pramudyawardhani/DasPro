import java.util.Scanner;

public class StudiKasus2_Dinamis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan lebar tanah: ");
        int lebarTanah = sc.nextInt();

        System.out.print("Masukkan panjang tanah: ");
        int panjangTanah = sc.nextInt();

        System.out.print("Masukkan diameter kolam: ");
        int diameterKolam = sc.nextInt();

        System.out.print("Masukkan panjang sisi taman: ");
        int panjangSisiTaman = sc.nextInt();

        int luasTanah = lebarTanah * panjangTanah;
        int luasKolam = (int) (Math.PI * Math.pow(diameterKolam / 2.0, 2));
        int luasTaman = panjangSisiTaman * panjangSisiTaman;

        int sisaLuasTanah = luasTanah - (luasKolam + luasTaman);
        System.out.println("Sisa luas tanah = " + sisaLuasTanah);
    }
}
