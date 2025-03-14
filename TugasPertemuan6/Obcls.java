package TugasPertemuan6;

import java.util.Scanner;

public class Obcls {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    PersegiPanjang persegiPanjang1 = new PersegiPanjang(1,1);
    PersegiPanjang persegiPanjang2 = new PersegiPanjang();
    PersegiPanjang persegiPanjang3 = new PersegiPanjang();

    persegiPanjang2.setPanjang(30);
    persegiPanjang2.setLebar(40);

    System.out.println("Masukkan Panjang dan Lebar Persegi Panjang ke-3: ");
    int pjg = scanner.nextInt();
    int lbr = scanner.nextInt();

    persegiPanjang3.setPanjang(pjg);
    persegiPanjang3.setLebar(lbr);

    System.out.println("Persegi Panjang 1: ");
    System.out.println("Luas: " + persegiPanjang1.getLuas());
    System.out.println("Keliling: " + persegiPanjang1.getKeliling());

    System.out.println("\nPersegi Panjang 2: ");
    System.out.println("Luas: " + persegiPanjang2.getLuas());
    System.out.println("Keliling: " + persegiPanjang2.getKeliling());

    System.out.println("\nPersegi Panjang 3: ");
    System.out.println("Luas: " + persegiPanjang3.getLuas());
    System.out.println("Keliling: " + persegiPanjang3.getKeliling());
  }
}
