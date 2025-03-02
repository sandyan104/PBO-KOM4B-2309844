import java.util.Scanner;

public class Ribuan {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] angka = new int[3];

    for (int i = 0; i < 3; i++) {
      System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
      angka[i] = scanner.nextInt();
    }

    for (int i = 0; i < 3; i++) {
      if (angka[i] >= 1000 && angka[i] <= 9999) {
        System.out.println(angka[i] + " adalah ribuan.");
      } else {
        System.out.println(+angka[i] + " bukan ribuan.");
      }
    }
  }
}
