import java.util.Scanner;

public class MobilWisata {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan jumlah peserta: ");
    int jumlahPeserta = scanner.nextInt();

    int kapasitasMobil = 7;
    int jumlahMobil;

    if (jumlahPeserta % kapasitasMobil == 0) {
      jumlahMobil = jumlahPeserta / kapasitasMobil;
    } else {
      jumlahMobil = (jumlahPeserta / kapasitasMobil) + 1;
    }

    System.out.println("Jumlah mobil yang disediakan: " + jumlahMobil);

  }
}
