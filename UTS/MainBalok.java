package UTS;

public class MainBalok {
    public static void main(String[] args) {

        Balok balok1 = new Balok(1, 1, 1);
        tampilkanInfo(balok1);

        Balok balok2 = new Balok(30, 40, 50);
        tampilkanInfo(balok2);

        Balok balok3 = new Balok(25, 35, 45);
        tampilkanInfo(balok3);
    }

    public static void tampilkanInfo(Balok balok) {
        System.out.println("Balok dengan panjang : " + balok.getPanjang()
                + ", lebar : " + balok.getLebar()
                + " dan tinggi : " + balok.getTinggi()
                + ". Luasnya : " + balok.getLuas()
                + ", sedangkan kelilingnya : " + balok.getKeliling()
                + " dan volumenya : " + balok.getVolume());
    }
}
