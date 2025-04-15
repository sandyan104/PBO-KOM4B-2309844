package UTS;

public class NestedLoop2 {
    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern B");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            for (int spasi = 6 - i; spasi > 0; spasi--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern D");
        for (int i = 0; i < 6; i++) {
            for (int spasi = 0; spasi < i; spasi++) {
                System.out.print("  "); 
            }
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
