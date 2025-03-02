import java.util.Scanner;

public class Primkop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan batas awal: ");
    int batasAwal = scanner.nextInt();

    System.out.print("Masukkan batas akhir: ");
    int batasAkhir = scanner.nextInt();

    if (batasAwal < 1 || batasAkhir > 100 || batasAwal > batasAkhir) {
      System.out.println("batasAwal <= 1, batasAkhir <= 100.");
      return;
    }

    System.out.print("Bilangan prima " + batasAwal + " - " + batasAkhir + " : ");
    for (int num = batasAwal; num <= batasAkhir; num++) {
      if (num < 2)
        continue;
      boolean isPrime = true;
      for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.print(num + " ");
      }
    }

    System.out.println();
    System.out.print("Bilangan komposit " + batasAwal + " - " + batasAkhir + " : ");
    for (int num = batasAwal; num <= batasAkhir; num++) {
      if (num < 2)
        continue;
      boolean isComposite = false;
      for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
          isComposite = true;
          break;
        }
      }
      if (isComposite) {
        System.out.print(num + " ");
      }
    }
  }
}
