import java.util.Scanner;
public class PembayaranParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi = 0, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan : 1 Mobil, 2 Motor, 0 keluar = ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Berapa durasi parkirmu? ");
                durasi = sc.nextInt();
                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += (durasi * 3000);
                } else if (jenis == 2) {
                    total += (durasi * 2000);
                }
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid. Silakan coba lagi.");
            }
        } while (jenis != 0);
        sc.close();
        System.out.println("Biaya parkirmu sebesar: " + total);
    }
}