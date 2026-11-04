/**
 * Tugas307
 */
import java.util.Scanner;

public class Tugas307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
        } while (jumlahToko < 1);

        int totalBarangSeluruhToko = 0;
        int maxBarang = -1;
        int tokoTerbanyak = 1;

        for (int t = 1; t <= jumlahToko; t++) {
            System.out.println("\n Toko " + t + " ");

            int jumlahPelanggan;
            do {
                System.out.print("Jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;
            for (int p = 1; p <= jumlahPelanggan; p++) {
                int barang;
                do {
                    System.out.print("  Jumlah barang pelanggan " + p + ": ");
                    barang = sc.nextInt();
                } while (barang < 0);
                totalBarangToko += barang;
            }

            System.out.println("Ringkasan Toko " + t + " -> Pelanggan: " + jumlahPelanggan + ", Total barang: " + totalBarangToko);

            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = t;
            }
        }

        System.out.println("\n=================================");
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
} 
    

