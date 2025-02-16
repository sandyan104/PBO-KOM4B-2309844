import java.util.Scanner;

public class Tabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jml Tabungan : ");
        double tabungan = input.nextDouble();

        System.out.print("Sdh pny calon? ");
        boolean calonPasangan = input.nextBoolean();

        if (tabungan > 100000000 && calonPasangan) {
            System.out.println("Siap");
        } else {
            System.out.println("Nanti");
        }
    }
}
