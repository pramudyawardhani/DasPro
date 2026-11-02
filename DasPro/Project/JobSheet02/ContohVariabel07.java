public class ContohVariabel07 {
    public static void main(String[] args) {
        String salahSatuHobiSayaAdalah = "Mendengarkan musik";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte umurSaya = 18;
        double $ipk = 3.97, $tinggi = 1.65;
        System.out.println("Hobi saya adalah " + salahSatuHobiSayaAdalah);
        System.out.println("Apakah saya pandai? " +isPandai);
        System.out.println("Jenis kelamin: " +jenisKelamin);
        System.out.println("Umur saya: " +umurSaya);
        System.out.println(String.format("Saya berIPK %s, dengan tinggi badan %s", $ipk, $tinggi));
    }
}