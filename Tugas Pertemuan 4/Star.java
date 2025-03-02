import java.util.Scanner;

public class Star {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan nilai N (1-1000): ");
    int N = scanner.nextInt();

    if (N < 1 || N > 1000) {
      System.out.println("N harus antara 1-1000.");
    } else {
      for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}
