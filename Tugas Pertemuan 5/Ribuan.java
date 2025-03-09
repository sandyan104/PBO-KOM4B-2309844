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
      cth(angka[i]);
    }
    
  }

  public static void cth(int i){
    if (i >= 1000 && i <= 9999) {
      System.out.println(i + " adalah ribuan.");
    } else {
      System.out.println(+i + " bukan ribuan.");
    }
  } 
}
