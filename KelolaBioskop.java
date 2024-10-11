import java.util.Scanner;
public class KelolaBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaPelanggan;
        double diskon = 0;
        int tiket, jumlahTiketTerjual = 0, totalHargaTiket = 0, hargaTiket = 50000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Masukkan jumlah pembelian tiket: ");
            tiket = sc.nextInt();

            if (tiket > 0) {
                if (tiket > 4 && tiket <= 10) {
                    diskon = 0.1;
                    System.out.println("Extra Diskon 10%");
                } else if (tiket > 10) {
                    diskon = 0.15;
                    System.out.println("Extra Diskon 15%");
                } else {
                    diskon = 0;
                    System.out.println("Tidak ada diskon.");
                }
                jumlahTiketTerjual += tiket;
                double hargaTotal = tiket * hargaTiket;
                totalHargaTiket += (int) (hargaTotal - (hargaTotal * diskon)); // Corrected to accumulate total

                System.out.println("Total harga tiket: " + (int) (hargaTotal - (hargaTotal * diskon)));
            } else {
                System.out.println("Invalid input, input kembali");
            }

            sc.nextLine();

        } while (true);

        System.out.println("Total tiket terjual hari ini: " + jumlahTiketTerjual);
        System.out.println("Total harga penjualan tiket hari ini: " + totalHargaTiket);
        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}