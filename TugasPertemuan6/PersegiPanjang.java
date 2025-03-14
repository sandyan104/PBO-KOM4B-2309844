package TugasPertemuan6;

public class PersegiPanjang {
  private int panjang;
  private int lebar;

  public PersegiPanjang() {
    panjang = 0;
    lebar = 0;
  }

  public PersegiPanjang(int newPjg, int newLbr) {
    panjang = newPjg;
    lebar = newLbr;
  }

  public int getLuas() {
    return panjang * lebar;
  }

  public int getKeliling() {
    return 2 * (panjang + lebar);
  }

  public void setPanjang(int newPjg) {
    panjang = newPjg;
  }

  public void setLebar(int newLbr) {
    lebar = newLbr;
  }
}

