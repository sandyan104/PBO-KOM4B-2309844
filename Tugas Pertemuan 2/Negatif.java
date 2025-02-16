import java.util.Scanner;

public class Negatif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bilangan negatif 1: ");
        double num1 = input.nextDouble();

        System.out.print("Bilangan negatif 2: ");
        double num2 = input.nextDouble();

        System.out.print("Bilangan negatif 3: ");
        double num3 = input.nextDouble();

        double tam = num1 + num2 + num3;
        double kur = num1 - num2 - num3;
        double kal = num1 * num2 * num3;
        double bag = num1 / num2 / num3;

        System.out.println("\nHasil:");
        System.out.println("Penjumlahan      : " + tam);
        System.out.println("Pengurangan      : " + kur);
        System.out.println("Perkalian        : " + kal);
        System.out.println("Pembagian        : " + bag);
        
    }
}
