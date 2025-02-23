import java.util.Scanner;

public class NilaiMhs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("UTS: ");
    double uts = scanner.nextDouble();

    System.out.print("UAS: ");
    double uas = scanner.nextDouble();

    System.out.print("Tugas: ");
    double tugas = scanner.nextDouble();

    double nilaiAkhir = (uts * 0.35) + (uas * 0.45) + (tugas * 0.20);

    char indeks;
    if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
      indeks = 'A';
    } else if (nilaiAkhir >= 70) {
      indeks = 'B';
    } else if (nilaiAkhir >= 50) {
      indeks = 'C';
    } else if (nilaiAkhir >= 40) {
      indeks = 'D';
    } else {
      indeks = 'E';
    }

    System.out.println("Nilai Akhir: " + nilaiAkhir);
    System.out.println("Indeks Nilai: " + indeks);
  }
}
