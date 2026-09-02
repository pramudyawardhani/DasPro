public class StudiKasus1 {
    public static void main(String[] args) {
        
    double gajiPokok = 5000000;
    double tunjanganAnak = 1000000;
    int jumlahAnak = 4;
    double persentasePotonganPensiun = 0.10;

    double totalTunjanganAnak = tunjanganAnak * jumlahAnak;
    double potonganPensiun = gajiPokok * persentasePotonganPensiun;
    double gajiBersih = gajiPokok + totalTunjanganAnak - potonganPensiun;

    System.out.println("Gaji bersih yang diterima = " + gajiBersih);
    }   
}
