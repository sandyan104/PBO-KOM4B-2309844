import java.util.Scanner;

public class Star {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan nilai N (1-1000): ");
    int N = scanner.nextInt();

    if (N < 1 || N > 1000) {
      System.out.println("Nilai N harus antara 1 dan 1000.");
    } else {
      int i = 1;
      while (i <= N) {
        int j = 1;
        while (j <= i) {
          System.out.print("*");
          j++;
        }
        System.out.println();
        i++;
      }
    }
  }
}
