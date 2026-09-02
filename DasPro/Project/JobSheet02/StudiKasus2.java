public class StudiKasus2 {
    public static void main(String[] args) {
        
    int lebarTanah = 30, panjangTanah = 100;
    int luasTanah = lebarTanah * panjangTanah;
    int diameterKolam = 5;
    int panjangSisiTaman = 2;

    int luasTanah = lebarTanah * panjangTanah;
    int luasKolam = (int) (Math.PI * Math.pow(diameterKolam / 2.0, 2));
    int luasTaman = panjangSisiTaman * panjangSisiTaman;

    int sisaLuasTanah = luasTanah - (luasKolam + luasTaman);
    System.out.println("Sisa luas tanah = " + sisaLuasTanah);
    }
}
