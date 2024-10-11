import java.util.Scanner;
public class SiakadFor14{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double nilai, tertinggi = 0, terendah = 100, batasKelulusan = 60, lulus = 0, tidakLulus = 0;

    for (int i = 1; i <= 5; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
        nilai = sc.nextDouble();
        if (nilai > tertinggi){
            tertinggi = nilai;
        }
        if (nilai < terendah){
            terendah = nilai;
        }
        if (nilai > batasKelulusan){
            nilai = lulus++ ;
        } else {
            nilai = tidakLulus++ ;
        }
    }
    System.out.println("Nilai tertinggi: " + tertinggi);
    System.out.println("Nilai terendah: " + terendah);
    System.out.println("Banyaknya lulus : " + (byte) lulus);
    System.out.println("Banyaknya tidak lulus : " + (byte) tidakLulus);
    }
}