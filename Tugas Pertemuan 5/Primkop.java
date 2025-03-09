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
    primcomp("p", batasAwal, batasAkhir);

    System.out.println();
    
    System.out.print("Bilangan komposit " + batasAwal + " - " + batasAkhir + " : ");
    primcomp("c", batasAwal, batasAkhir);
  }
  
  public static void primcomp(String type, int awal, int akhir){
    for (int num = awal; num <= akhir; num++) {
      if (num < 2)
        continue;
      boolean isPrime = true;
      boolean isComposite = false;
      for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
          if (type == "c"){
            isComposite = true;
          }
          if (type == "p"){
            isPrime = false;
          }
          break;
        }
      }
      if (type == "c" && isComposite) {
        System.out.print(num + " ");
      }
      if (type == "p" && isPrime) {
        System.out.print(num + " ");
      }
    }
  } 
}
