import java.util.Scanner;

public class GanjilGenap {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Bil. Pertama: ");
    int bilangan1 = scanner.nextInt();

    System.out.print("Bil. Kedua: ");
    int bilangan2 = scanner.nextInt();

    if (bilangan1 % 2 == 0 && bilangan2 % 2 == 0) {
      int hasil = bilangan1 + bilangan2;
      System.out.println("Keduanya bilangan genap, hasil penjumlahan: " + hasil);

    } else if (bilangan1 % 2 != 0 && bilangan2 % 2 != 0) {
      int hasil = bilangan1 * bilangan2;
      System.out.println("Keduanya bilangan ganjil, hasil perkalian: " + hasil);

    } else {
      System.out.println("Bilangan tidak memenuhi syarat (satu ganjil, satu genap).");
    }
  }
}
