package UTS;

public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;

    public Balok() {
        this.panjang = 0;
        this.lebar = 0;
        this.tinggi = 0;
    }

    public Balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        this.tinggi = tinggiBaru;
    }

    public int getLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    public int getKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }

    public int getVolume() {
        return panjang * lebar * tinggi;
    }

    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }

    public void setTinggi(int tinggiBaru) {
        this.tinggi = tinggiBaru;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggi() {
        return tinggi;
    }
}
