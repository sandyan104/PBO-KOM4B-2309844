package UTS;

import java.util.Scanner;

public class Palindrom1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan tiga digit integer : ");
        int angka = input.nextInt();

        if (angka < 100 || angka > 999) {
            System.out.println("Input harus berupa bilangan bulat tiga digit.");
        } else {
            int ratusan = angka / 100;
            int satuan = angka % 10;

            if (ratusan == satuan) {
                System.out.println(angka + " adalah palindrom");
            } else {
                System.out.println(angka + " bukan palindrom");
            }
        }
    }
}
