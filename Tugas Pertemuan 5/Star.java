import java.util.Scanner;

public class Star {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan nilai N (1-1000): ");
    int N = scanner.nextInt();
    
    print(N);
  }

  public static void print(int n){
    if (n < 1 || n > 1000) {
      System.out.println("Nilai N harus antara 1 dan 1000.");
    } else {
      int i = 1;
      while (i <= n) {
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
