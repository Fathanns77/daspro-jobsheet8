
/**
 * Triangle07
 */
import java.util.Scanner;

public class Triangle07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        // 1. Segitiga Siku-siku Tegak
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

        // 2. Segitiga Terbalik (Langkah 8)
        i = n; 
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }

        sc.close();
    }
}